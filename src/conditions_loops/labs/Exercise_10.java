package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {

        int x;

        //print odd numbers from 0 to 100
        for (x = 0; x <= 100; x++) {
            if ( (x % 2) == 0) continue;
            System.out.println(x);
        }

    }

}
