package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a lower bound: ");
        // assign input to variable as int
        int lowerBound = scanner.nextInt();
        System.out.print("Enter an upper bound: ");
        //assign input to variable as int
        int upperBound = scanner.nextInt();

        System.out.println();

        double sum = 0;
        double total = 0;
        double average;

        for (int x = lowerBound; x <= upperBound; x++ ) {
            sum += x;
            total = x;
        }
            average = sum/total;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);

        }

    }



