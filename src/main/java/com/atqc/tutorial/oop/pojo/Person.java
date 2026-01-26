package com.atqc.tutorial.oop.pojo;


/**
 * Represents a simple POJO class that stores person information.
 *
 * Task:
 * Implement the Person class so it matches the requirements.
 *
 * Requirements:
 * - The class must contain exactly 3 fields:
 *   - String name
 *   - String surname
 *   - Integer age
 *
 * - All fields must be private, non-static and non-final.
 *
 * - The class must have two constructors:
 *   - no-args constructor
 *   - constructor with parameters (String name, String surname, Integer age)
 *
 * - The class must provide public getters and setters for all fields.
 *
 * Example:
 * Person person = new Person("Petro", "Melnyk", 30);
 * person.getName() → "Petro"
 * person.getSurname() → "Melnyk"
 * person.getAge() → 30
 */

public class Person {

    private String name;
    private String surname;
    private Integer age;

    public Person() {
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
