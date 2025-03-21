import java.util.Scanner;

public class TemperatureConverter{
    
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
           
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius) + "°F");
       
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit) + "°C");
        } 
    }

