import java.util.Scanner;

public class Prime{
       public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get a number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

 
}
