import java.util.Scanner;

public class VowelCount {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

       
        int vowelCount = countVowels(str);

        System.out.println("Number of vowels: " + vowelCount);

    }
}
