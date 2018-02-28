package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */

class One {

    public static void main(String[] args) {
        System.out.println("This is Class One, main method.");

        One classObject = new One(); //object created of class1

        Two object2 = new Two(); //object created of class2
        int c = 4;
        int d = 2;
        System.out.println("c divided by d is: " + object2.divide(c, d));

        Three object3 = new Three(); //object created of class3
        // double sum = object3.add(1.2, 8.4);
        System.out.println("the sum of x and y is: " + object3.add(1.2, 8.4));

    }
}

class Two {

    static int subtract(int a, int b) {
        return a - b;

    }

    int divide(int c, int d){
        return c / d;
    }
}

class Three {

    double add(double x, double y){
        return x + y;

    }

}

