package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

//this program will produce two types of Pets: indoor and outdoor. each class will produce two Pet objects.

class PetController {
    public static void main(String[] args) {

        Cat Lucy = new Cat("Lucy", "tabby mix", "white, brown and black", 6, 8.3, true, false);
        Dog Macy = new Dog("Macy", "cocker spaniel", "black, white and brown", 9, 25, true);
        Cat Dorian = new Cat("Dorian", "mix", "gray", 8, 19.2, false, true);
        Cat Beardy = new Cat("Beardy", "Siberian", "blue lynx point", 4, 13, true, false);

        System.out.println();
    }

}

class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weightLbs;
    boolean houseTrained;

    Dog(String name, String breed, String color, int age, double weight, boolean houseTrained) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weightLbs = weight;
        this.houseTrained = houseTrained;

        System.out.println("Dog Information");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Is this dog housetrained?: " + houseTrained);
        System.out.println();

    }

}

class Cat {

    String name;
    String breed;
    String color;
    int age;
    double weightLbs;
    boolean longHair;
    boolean declawed;

    Cat(String name, String breed, String color, int age, double weight, boolean longHair, boolean declawed) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weightLbs = weight;
        this.longHair = longHair;
        this.declawed = declawed;

        System.out.println("Cat Information");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Long Hair?: " + longHair);
        System.out.println("Declawed?: " + declawed);
        System.out.println();

    }

}