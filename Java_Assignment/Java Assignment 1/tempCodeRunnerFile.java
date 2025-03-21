// Interface
interface Animal {
    // Abstract method 
    void makeSound();

    // Default method 
    default void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Implementing the interface in a class
class Dog implements Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Dog barks!!!");
    }
}

// Another class implementing the interface
class Cat implements Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Cat meows!!!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Calls the Dog class implementation
        myDog.sleep();     // Calls the default method from the interface

        myCat.makeSound(); // Calls the Cat class implementation
        myCat.sleep();     // Calls the default method from the interface
    }
}
