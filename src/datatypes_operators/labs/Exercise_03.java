package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        // create scanner
        Scanner input = new Scanner(System.in);
        // user enters name
        System.out.print("my name is: ");
        // assign input to variable as string
        String userName = input.nextLine();

        System.out.println("Your regular name: " + userName);
        //get name without first letter
        String nameMinusFirstLetter = userName.substring(1);
        // get first letter
        char firstLetter = userName.charAt(0);
        // assign pig latin ending to string variable
        String ending = "ay";
        //print out name in pig latin by combining the name without the first letter, the first letter and the ending
        System.out.println("Your name in Pig Latin is: " + nameMinusFirstLetter + firstLetter + ending);




    }
}


