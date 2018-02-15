package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter any word here: ");

        String word = scanner.nextLine();

        boolean found = false;
        char letter = word.charAt(0);
        int count = 0;

        while (!found) {
            letter = word.charAt(count);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Your word is: " + word);
                System.out.println("The first vowel in your word is: " + letter);
                found = true;
            }else{
                count++;
            }


        }

    }
}

