package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        //create a loop
        int x;

        for (x = 0; x <=100; x++){
            System.out.println(x);
            if(x == 10) break;

        }
    }
}
