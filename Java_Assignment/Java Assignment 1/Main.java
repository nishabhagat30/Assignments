import java.util.Scanner;

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
        System.out.println("\nStudents details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        // Creating Student object
        Student student = new Student(name, rollNumber, marks);

        // Displaying student details
        student.display();
    }
}
