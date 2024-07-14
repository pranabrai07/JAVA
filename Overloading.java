class Calculator {
    // Method overloading
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

class Person {
    String name;
    int age;

    // Constructor overloading

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Overloading {
    public static void main(String[] args) {
        // Demonstrate method overloading
        Calculator calc = new Calculator();
        System.out.println("Method Overloading:");
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));
        System.out.println("Sum of 1.5 and 2.5: " + calc.add(1.5, 2.5));

        System.out.println();

        // Demonstrate constructor overloading
        System.out.println("Constructor Overloading:");
        Person person1 = new Person();
        person1.display();

        System.out.println();

        Person person2 = new Person("Alice");
        person2.display();

        System.out.println();

        Person person3 = new Person("Bob", 25);
        person3.display();
    }
}