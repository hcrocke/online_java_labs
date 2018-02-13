package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double radius = 3.14;
        int height = 5;


        // volume of a cylinder is πr^2h
        double volume = Math.PI * (radius*radius) * height;

        // surface area is 2πrh+2πr2
        double surfaceArea = (2* Math.PI * radius * height) + (2 * Math.PI * radius * radius);

        System.out.println("volume = " + volume);

        System.out.println("surface area = " + surfaceArea);

    }
}
