package com.atqc.tutorial.oop.inheritance;


/**
 * Task:
 * Implement inheritance using two classes: Animal and Dog.
 *
 * Requirements:
 * - Dog must extend Animal.
 *
 * - Class Animal must contain:
 *   - private String name
 *   - private Integer age
 *
 * - Class Dog must contain:
 *   - private String breed
 *
 * - Animal must have:
 *   - no-args constructor
 *   - constructor with parameters (String name, Integer age)
 *
 * - Dog must have:
 *   - no-args constructor
 *   - constructor with parameters (String name, Integer age, String breed)
 *
 * - Public getters and setters must be implemented for all fields.
 *
 * Example:
 * Dog dog = new Dog("Rex", 3, "Labrador");
 * dog.getName() → "Rex"
 * dog.getAge() → 3
 * dog.getBreed() → "Labrador"
 */

/**
 * Additional task:
 * Explain the following code line:
 *
 * Animal animal = new Dog();
 *
 * Questions to answer:
 * - What is the compile-time type of the variable animal?
 * - What is the runtime type of the object?
 * - Why is this assignment allowed?
 */

public class Animal {

    private String name;
    private Integer age;

    public Animal() {
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
