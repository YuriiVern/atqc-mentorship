package com.atqc.tutorial.oop.inheritance;


/**
 *
 * Pet interface requirements:
 * - Methods:
 *   - String getOwnerName()
 *   - void setOwnerName(String ownerName)
 *
 * Dog class requirements (Part 2):
 * - Dog must implement Pet interface.
 * - Add field:
 *   - String ownerName
 *
 * - Implement all methods from Pet interface.
 *
 * Theory question (Part 2):
 * Explain the following code line:
 *
 * Pet pet = new Dog();
 *
 * Explain:
 * - What is the type of variable pet?
 * - What methods are available through this reference?
 */


public interface Pet {

    String getOwnerName();

    void setOwnerName(String ownerName);



}
