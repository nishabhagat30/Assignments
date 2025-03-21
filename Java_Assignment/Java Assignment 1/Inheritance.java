import java.util.Scanner;

// Base class (Parent)
class Student {
    // Attributes
private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Derived class (Child)
class GraduateStudent extends Student {
    private int age;
    private String address;

    // Constructor
    public GraduateStudent(String name, int rollNumber, double marks,int age,String address) {
        super(name, rollNumber, marks); // Calling the parent class constructor
        this.age = age;
        this.address = address;
    }

    // Method to display Graduate Student details
    public void displayInfo() {
        super.display(); // Call base class method
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Main class to test the functionality
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
      
        System.out.print("Enter age: ");
       int age = sc.nextInt();
       sc.nextLine();
        System.out.print("Enter address: ");
        String address= sc.nextLine();

        // Creating GraduateStudent object
        GraduateStudent st = new GraduateStudent(name, rollNumber, marks, age, address);

        // Displaying graduate student details
       st.displayInfo();

    }
}
