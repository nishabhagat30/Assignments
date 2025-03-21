import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        
        String reverse= "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Displaying the reversed string
        System.out.println("Reversed String: " + reverse);

    }
}
