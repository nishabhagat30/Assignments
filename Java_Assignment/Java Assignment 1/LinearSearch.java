import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        
        int[] numbers = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Taking the element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Searching the element using linear search
        int result = linearSearch(numbers, key);

        // Displaying the result
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
