package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class Multiply {

        void multiply(int a) {
            System.out.println("Overloaded method 1 is: " + a);
        }

        void multiply(int a, int b) {
            System.out.println("Overloaded method 2 is: " + (a * b));
        }

        void multiply(double c) {
            System.out.println("Overloaded method 3 is: " + c);
        }

        void multiply(int b, double c) {
            System.out.println("Overloaded method 4 is: " + (b * c));
        }

    public static void main(String[] args) {

        Multiply mult = new Multiply();

        mult.multiply(2);
        System.out.println();

        mult.multiply(2, 3);
        System.out.println();

        mult.multiply(1.5);
        System.out.println();

        mult.multiply(3, 1.5);
        System.out.println();

    }
}

