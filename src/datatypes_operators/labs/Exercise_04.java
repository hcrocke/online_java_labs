package datatypes_operators.labs;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numsArray = new int[10]; //int array with 10 elements, numsArray is the reference variable
        double sum = 0;
        double avg = 0;

        for (int x = 0; x < 10; x++) {
            System.out.print("Enter in a number: "); //prompt user to enter a number
            numsArray[x] = input.nextInt();
            sum += numsArray[x];

        }
        avg = sum/10;

        System.out.println();
        System.out.println("Sum of your numbers is: " + sum);
        System.out.println();
        System.out.println("Average of your numbers is: " + avg);

    }

}