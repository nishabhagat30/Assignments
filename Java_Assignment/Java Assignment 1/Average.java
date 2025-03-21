import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

       
        System.out.println("Enter elements:");
      float sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // Calculating sum
        }

        // Calculating the average
       float average = sum / size;

        
        System.out.println("The average is: " + average);
    }
}
