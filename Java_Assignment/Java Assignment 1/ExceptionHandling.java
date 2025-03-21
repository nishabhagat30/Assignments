import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Division operation (may throw ArithmeticException)
            int result = numerator / denominator;
            System.out.println("Result: " + result);

            // Array example (may throw ArrayIndexOutOfBoundsException)
            int[] numbers = {10, 20, 30};
            System.out.println("Accessing 4th element: " + numbers[3]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
            
        }
    }
}
