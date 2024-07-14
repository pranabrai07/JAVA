// AbstractAnimal.java

// Abstract class representing an Animal
abstract class AbstractAnimal {
    private String name;

    // Constructor
    public AbstractAnimal(String name) {
        this.name = name;
    }

    // Abstract method - must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}

// Dog.java

// Concrete subclass extending AbstractAnimal
class Dog extends AbstractAnimal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

// Main.java

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        // Instantiate Dog object
        Dog dog = new Dog("Buddy");

        // Call methods
        System.out.println("Name: " + dog.getName());
        dog.makeSound();
        dog.sleep();
    }
}
