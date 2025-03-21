import java.util.Scanner;
public class Fibonacci{

    public static void fib(int num){
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int first = 0, second = 1;
            // Print first two terms
            System.out.print(first + " " + second + " "); 
            for (int i = 3; i <= num; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        fib(n);       
        
    }
}
