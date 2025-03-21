
// Abstract class
abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void Sound();

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Concrete class extending the abstract class
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Implementing the abstract method
    void Sound() {
        System.out.println(name + " barks!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.Sound(); // Calls the implemented method
        myDog.sleep(); // Calls the inherited concrete method
    }
}
