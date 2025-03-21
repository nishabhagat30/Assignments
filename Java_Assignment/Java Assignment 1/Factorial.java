
import java.util.Scanner;

public class Factorial {
    public static int fact(int num){
        if(num == 0){
        return 1;
        }

        else{
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculte the factorial:");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is "+fact(num));
    }
    
}
