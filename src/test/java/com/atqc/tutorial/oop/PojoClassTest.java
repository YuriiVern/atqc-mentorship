package com.atqc.tutorial.oop;

import org.testng.annotations.Test;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class PojoClassTest {

    private final Field[] fields = Person.class.getDeclaredFields();


    @Test
    public void testPersonClassFieldsQuantity() {
        assertEquals(fields.length,3,
                "Fields quantity in not correct. Person class should have fields: \"name\", \"surname\", \"age\"");

    }

    @Test(priority = 1)
    public void testPersonClassFieldName() {

        Field nameField = null;
        for (Field field : fields) {
            if(field.getName().equals("name")) {
                nameField = field;
                break;
            }
        }
        assertNotNull(nameField, "\"Name\" field is not present in class Person");
        assertEquals(nameField.getType(),String.class,"\"Name\" field doesn't have type of String");

        int modifiers = nameField.getModifiers();
        assertTrue(Modifier.isPrivate(modifiers),"\"Name\" field doesn't have private access");
        assertFalse(Modifier.isStatic(modifiers),"\"Name\" field is static in class Person, but have to be non static");
        assertFalse(Modifier.isFinal(modifiers),"\"Name\" field is final in class Person, but have to be non final");
    }

    @Test(priority = 2)
    public void testPersonClassFieldSurname() {

        Field nameField = null;
        for (Field field : fields) {
            if(field.getName().equals("surname")) {
                nameField = field;
                break;
            }
        }
        assertNotNull(nameField, "\"Surname\" field is not present in class Person");
        assertEquals(nameField.getType(),String.class,"\"Surname\" field doesn't have type of String");

        int modifiers = nameField.getModifiers();
        assertTrue(Modifier.isPrivate(modifiers),"\"Surname\" field doesn't have private access");
        assertFalse(Modifier.isStatic(modifiers),"\"Surname\" field is static in class Person, but have to be non static");
        assertFalse(Modifier.isFinal(modifiers),"\"Surname\" field is final in class Person, but have to be non final");
    }

    @Test(priority = 3)
    public void testPersonClassFieldAge() {
        Field ageField = null;
        for (Field field : fields) {
            if(field.getName().equals("age")) {
                ageField = field;
                break;
            }
        }

        assertNotNull(ageField, "\"Age\" field is not present in class Person");
        assertEquals(ageField.getType(), Integer.class,"\"Age\" field doesn't have type of int");

        int modifiers = ageField.getModifiers();
        assertTrue(Modifier.isPrivate(modifiers),"\"Age\" field doesn't have private access");
        assertFalse(Modifier.isStatic(modifiers),"\"Age\" field is static in class Person, but have to be non static");
        assertFalse(Modifier.isFinal(modifiers),"\"Age\" field is final in class Person, but have to be non final");
    }

    @Test(priority = 4)
    public void testPersonClassConstructorParams() {
        Constructor<?>[] declaredConstructors = Person.class.getDeclaredConstructors();
        assertEquals(declaredConstructors.length,2,"Person doesn't have declared two constructors");

        boolean noArgsConstructor = Arrays.stream(Person.class.getDeclaredConstructors())
                .anyMatch(constructor -> constructor.getParameterCount() == 0);
        assertTrue(noArgsConstructor,"Person class doesn't have no args constructor");
        boolean allArgsConstructor = Arrays.stream(Person.class.getDeclaredConstructors())
                .anyMatch(constructor -> constructor.getParameterCount() == 3);
        assertTrue(allArgsConstructor,"Person class doesn't have all args constructor");

        Map<? extends Class<?>, Integer> collect = Arrays.stream(Person.class.getDeclaredConstructors())
                .filter(constructor -> constructor.getParameterCount() == 3)
                .flatMap(constructor ->  Arrays.stream(constructor.getParameterTypes()))
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> 1,
                        Integer::sum));
        assertEquals(collect, Map.of(String.class,2,Integer.class,1));

    }

    @Test(priority = 5)
    public void testBuildPersonObject() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Constructor<?> noArgsConstructor = Arrays.stream(Person.class.getDeclaredConstructors())
                .filter(constructor -> constructor.getParameterCount() == 0)
                .findFirst()
                .orElseThrow(() -> new AssertionError("No-args constructor not found"));;
        Person person =(Person)noArgsConstructor.newInstance();

        Method setAge = Person.class.getDeclaredMethod("setAge", Integer.class);
        Method setName = Person.class.getDeclaredMethod("setName", String.class);
        Method setSurname = Person.class.getDeclaredMethod("setSurname", String.class);
        setAge.invoke(person,30);
        setName.invoke(person,"Petro");
        setSurname.invoke(person,"Melnyk");

        Method getAge = Person.class.getDeclaredMethod("getAge");
        Method getName = Person.class.getDeclaredMethod("getName");
        Method getSurname = Person.class.getDeclaredMethod("getSurname");
        Integer age = (Integer) getAge.invoke(person);
        String name = (String)getName.invoke(person);
        String surname = (String) getSurname.invoke(person);
        assertEquals(age,30,"Age is incorrect");
        assertEquals(name,"Petro","Name is incorrect");
        assertEquals(surname,"Melnyk","Surname is incorrect");

    }


}
