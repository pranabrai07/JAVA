// StaticExample.java

// Class to demonstrate static methods and variables
public class StaticExample {
    // Static variable
    private static int staticVariable = 0;

    // Instance variable
    private int instanceVariable;

    // Constructor
    public StaticExample(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Inside staticMethod()");
        System.out.println("Static variable: " + staticVariable);
        // Cannot access instanceVariable directly in a static context
        // System.out.println("Instance variable: " + instanceVariable); // Compilation error
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Inside instanceMethod()");
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Accessing static method directly using class name
        StaticExample.staticMethod();

        // Creating instances of StaticExample
        StaticExample obj1 = new StaticExample(10);
        StaticExample obj2 = new StaticExample(20);

        // Accessing instance methods
        obj1.instanceMethod();
        obj2.instanceMethod();

        // Modifying static variable
        StaticExample.staticVariable = 100;

        // Demonstrating static variable's value across instances
        System.out.println("staticVariable after modification: " + StaticExample.staticVariable);
        System.out.println("obj1.staticVariable: " + obj1.staticVariable); // Accessible but not recommended
        System.out.println("obj2.staticVariable: " + obj2.staticVariable); // Accessible but not recommended
    }
}
