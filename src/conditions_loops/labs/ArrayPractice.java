package conditions_loops.labs;

public class ArrayPractice {

    public static void main(String[] args) {

        /* multiplication table from 1 to 5 should appear like
            1 |2 |3 |4 |5 |
            2 |4 |6 |8 |10 |
            3 |6 |9 |12 |15 |
            4 |8 |12 |16 |20 |
            5 |10 |15 |20 |25 |
            need to start with for statement that will create each row and an nested for statement to iterate each column
         */

        //create outer for loop to print the rows -- start with initial value of 1, counts to 5, counts by 1
        for(int row = 1; row <= 5; row++){
            //inner for loop for columns -- (this will iterate in full with each outer loop iteration)
            for(int column = 1; column <= 5; column++){
                //don't want to print a new line here because we want each of these to appear on the same line to form columns
                //add formatting to include spaces and separators for a clean look
                System.out.print((row * column) + " " + "|");
            }
            //this refers to the outer loop and SHOULD include a new line each iteration because we're moving to a new row
            //it should remain blank because the only thing actually printing to the console should be the values by column
            System.out.println();
        }

    }
}
