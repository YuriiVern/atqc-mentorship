package com.atqc.tutorial.oop.inheritance;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class InheritanceTest {


    @Test
    public void testDogExtendsAnimal() {
        Class<?> superClass = Dog.class.getSuperclass();
        assertEquals(superClass, Animal.class,
                "Dog class must extend Animal class");
    }

    @Test
    public void testAnimalFields() {
        Field[] fields = Animal.class.getDeclaredFields();
        assertEquals(fields.length, 2, "Animal should have exactly 2 fields");

        Map<String, Class<?>> fieldMap = Arrays.stream(fields)
                .collect(Collectors.toMap(Field::getName, Field::getType));

        assertEquals(fieldMap.get("name"), String.class);
        assertEquals(fieldMap.get("age"), Integer.class);
    }

    @Test
    public void testDogOwnFields() {
        Field[] fields = Dog.class.getDeclaredFields();
        assertEquals(fields.length, 1, "Dog should have exactly 1 own field");

        Field breedField = fields[0];
        assertEquals(breedField.getName(), "breed");
        assertEquals(breedField.getType(), String.class);
    }

    @Test
    public void testDogDoesNotDuplicateAnimalFields() {
        Set<String> animalFields = Arrays.stream(Animal.class.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toSet());

        Set<String> dogFields = Arrays.stream(Dog.class.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toSet());

        for (String field : animalFields) {
            assertFalse(dogFields.contains(field),
                    "Dog must not declare field: " + field);
        }
    }


    @Test
    public void testAnimalConstructors() {
        Constructor<?>[] constructors = Animal.class.getDeclaredConstructors();

        boolean hasNoArgs = Arrays.stream(constructors)
                .anyMatch(c -> c.getParameterCount() == 0);

        boolean hasAllArgs = Arrays.stream(constructors)
                .anyMatch(c ->
                        c.getParameterCount() == 2 &&
                                c.getParameterTypes()[0] == String.class &&
                                c.getParameterTypes()[1] == Integer.class
                );

        assertTrue(hasNoArgs, "Animal must have no-args constructor");
        assertTrue(hasAllArgs, "Animal must have all-args constructor");
    }

    @Test
    public void testDogConstructors() {
        Constructor<?>[] constructors = Dog.class.getDeclaredConstructors();

        boolean hasNoArgs = Arrays.stream(constructors)
                .anyMatch(c -> c.getParameterCount() == 0);

        boolean hasAllArgs = Arrays.stream(constructors)
                .anyMatch(c ->
                        c.getParameterCount() == 3 &&
                                c.getParameterTypes()[0] == String.class &&
                                c.getParameterTypes()[1] == Integer.class &&
                                c.getParameterTypes()[2] == String.class
                );

        assertTrue(hasNoArgs, "Dog must have no-args constructor");
        assertTrue(hasAllArgs, "Dog must have all-args constructor");
    }

    @Test
    public void testDogCanAccessAnimalGetters() throws Exception {
        Constructor<?> ctor = Dog.class
                .getDeclaredConstructor(String.class, Integer.class, String.class);

        Object dog = ctor.newInstance("Rex", 4, "Labrador");

        Method getName = Dog.class.getMethod("getName");
        Method getAge = Dog.class.getMethod("getAge");
        Method getBreed = Dog.class.getMethod("getBreed");

        assertEquals(getName.invoke(dog), "Rex");
        assertEquals(getAge.invoke(dog), 4);
        assertEquals(getBreed.invoke(dog), "Labrador");
    }

    @Test
    public void testAnimalReferencePointsToDogObject() {
        Animal animal = new Dog();
        assertTrue(animal instanceof Dog,
                "Animal reference should point to Dog object");
    }

}
