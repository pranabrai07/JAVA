import java.util.Scanner;
class MethodOverloading {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading in = new MethodOverloading();

        // Calling the methods with different parameters
        int sum1 = in.add(5, 10);
        int sum2 = in.add(5, 10, 15);
        double sum3 = in.add(2.5, 3.5);

        System.out.println("Sum of 5 and 10 is: " + sum1);
        System.out.println("Sum of 5, 10, and 15 is: " + sum2);
        System.out.println("Sum of 2.5 and 3.5 is: " + sum3);
    }
}
