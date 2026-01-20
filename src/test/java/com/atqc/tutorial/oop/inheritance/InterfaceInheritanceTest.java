package com.atqc.tutorial.oop.inheritance;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InterfaceInheritanceTest {

    @Test
    public void testDogImplementsPet() {
        assertTrue(Pet.class.isInterface(), "Pet must be an interface");
        assertTrue(Pet.class.isAssignableFrom(Dog.class),
                "Dog must implement Pet interface");
    }


    @Test
    public void testPetInterfaceMethods() throws NoSuchMethodException {
        Method getOwnerName = Pet.class.getMethod("getOwnerName");
        assertEquals(getOwnerName.getReturnType(), String.class);

        Method setOwnerName = Pet.class.getMethod("setOwnerName", String.class);
        assertEquals(setOwnerName.getReturnType(), void.class);
    }


    @Test
    public void testInterfacePolymorphismRuntimeType() {
        Pet pet = new Dog();
        assertTrue(pet instanceof Dog, "Pet reference should point to Dog object");
    }


    @Test
    public void testDogHasPetMethods() throws NoSuchMethodException {
        Method getOwnerName = Dog.class.getMethod("getOwnerName");
        assertEquals(getOwnerName.getReturnType(), String.class);

        Method setOwnerName = Dog.class.getMethod("setOwnerName", String.class);
        assertEquals(setOwnerName.getReturnType(), void.class);
    }


    @Test
    public void testPetGetterSetterWork() throws Exception {
        Pet pet = new Dog();

        Method setOwnerName = pet.getClass().getMethod("setOwnerName", String.class);
        Method getOwnerName = pet.getClass().getMethod("getOwnerName");

        setOwnerName.invoke(pet, "Oleh");
        assertEquals(getOwnerName.invoke(pet), "Oleh");
    }

}
