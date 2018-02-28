package objects_classes_methods.labs;

/*
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

import java.lang.reflect.Method;

class MethodDemo {

    static void NoReturn() { //static method
        System.out.println("Nothing Returned");

    }

    void Return() { //non-static method
        System.out.println("Non-static method");

        int a = 6;
        int b = 2;

        if ((a * b) > 25) System.out.println("Return value greater than 25");
        else System.out.println("Return value 25 or less");

    }

    int multiply(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        NoReturn();
        MethodDemo x = new MethodDemo();
        x.Return();
    }
}

