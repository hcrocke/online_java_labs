package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class PetAdoption {

    public static void main(String[] args) {

        PetAdoption AdoptOne = new PetAdoption("Smith", 2, "dogs");
        PetAdoption AdoptTwo = new PetAdoption("Crocker", 3, "a lizard, a fish, and a dog");
        PetAdoption AdoptThree = new PetAdoption("Madigan", 0, "nothing");
        System.out.println("Total number of pets available for adoption: " + TotalPets);

    }

    String name; //Adopting family's name
    int pets; //number of pets adopted by family
    String petType;
    static int TotalPets; //total number of pets available for adoption

    PetAdoption(String name, int pets, String petType) {
        this.name = name;
        this.pets = pets;
        this.petType = petType;
        this.TotalPets = 18;

        System.out.print("The " + name + " family has adopted " + pets + " pet(s). ");
        System.out.println("They adopted " + petType + ".");
    }

}