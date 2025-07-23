import java.util.Scanner;

public class ReadDisplayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Read second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Display the numbers
        System.out.println("You entered: " + num1 + " and " + num2);
        
        scanner.close();
    }
}
