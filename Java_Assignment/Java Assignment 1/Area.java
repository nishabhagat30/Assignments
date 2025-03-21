import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the shape :");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Circle 
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of the Circle: " + circleArea);
                break;

            case 2:
             // Rectangle
                System.out.print("Enter the length: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of the Rectangle: " + rectangleArea);
                break;

            case 3:
                // Triangle 
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the Triangle: " + triangleArea);
                break;

            default:
                System.out.println("Invalid choice!!!");
        }

    }
}
