package datatypes_operators.labs;

import java.util.Scanner; //import Scanner class
/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //write code here
        Scanner num = new Scanner(System.in); // create a new object of type Scanner called num
        boolean withinRange = true; //will check if the number entered by the user is within range of 1-10

        while (withinRange) {
            System.out.print("Enter a number between 1 and 10: "); // prompt the user the enter a number
            int indexNum = num.nextInt();
            if (indexNum >= 0 && indexNum < array.length) { // sets range of index available
                System.out.println("Index number is: " + array[indexNum]);
                withinRange = true; // will check during run time if the number entered has an index between 0-9
                return;
            }
            else {
                System.out.println("Invalid number entered.");
                return;
            }


        }



    }
}