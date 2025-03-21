import java.util.Scanner;

public class OperatorsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        //  Arithmetic Operators 
        System.out.println("\n Arithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); 
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); 

        //  Relational Operators 
        System.out.println("\n Relational Operations:");
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));

        //  Logical Operators 
        System.out.println("\n Logical Operations:");
        //And operator
        boolean condition1 = (num1 > 0 && num2 > 0); 
        System.out.println( condition1);

        //Or operator
        boolean condition2 = (num1 % 2 == 0 || num2 % 2 == 0); 
        System.out.println(condition2);

        //Not operator
        boolean condition3 = !(num1 == num2); 
        System.out.println(condition3);
    
   

        
    }
}
