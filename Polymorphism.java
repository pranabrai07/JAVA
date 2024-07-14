// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog inherits from Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
	Dog in = new Dog();
        in.makeSound(); // Calls the method in Animal class
        in.makeSound(); // Calls the method in Dog class
    }
}
