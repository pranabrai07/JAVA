// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog dog = new Dog();
        dog.eat(); // Method from superclass
        dog.bark(); // Method from subclass

        System.out.println();

        System.out.println("Multilevel Inheritance:");
        Puppy puppy = new Puppy();
        puppy.eat(); // Method from Animal class
        puppy.bark(); // Method from Dog class
        puppy.weep(); // Method from Puppy class

        System.out.println();

        System.out.println("Hierarchical Inheritance:");
        Cat cat = new Cat();
        cat.eat(); // Method from superclass
        cat.meow(); // Method from Cat class
    }
}
