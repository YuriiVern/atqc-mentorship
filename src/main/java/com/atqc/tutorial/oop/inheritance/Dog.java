package com.atqc.tutorial.oop.inheritance;


public class Dog extends  Animal implements Pet {

    private String breed;

    private String ownerName;

    public Dog() {
    }

    public Dog(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
}
