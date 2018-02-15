package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {

    public static void main(String[] args) {

        //start with the top of the count
        int x = 1003;

        do {
            System.out.println(x -= 3);

        } while (x >= 3) ;

    }
}
