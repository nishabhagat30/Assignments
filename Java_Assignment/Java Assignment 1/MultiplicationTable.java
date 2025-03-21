import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        // Using for loop to print the multiplication table
        System.out.println("\n Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + (num * i));
        }

    }
}
