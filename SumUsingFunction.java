import java.util.Scanner;

public class SumUsingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Read second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Calculate sum using the sum function
        double result = sum(num1, num2);
        
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        
        scanner.close();
    }
    
    // Function to calculate sum
    public static double sum(double a, double b) {
        return a + b;
    }
}
