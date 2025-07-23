import java.util.Scanner;

public class NumberComparison {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        double firstValue = inputReader.nextDouble();
        
        System.out.print("Enter the second number: ");
        double secondValue = inputReader.nextDouble();
        
        
        System.out.println("Comparison Results");
        
        if (firstValue > secondValue) {
            System.out.println(firstValue + " is greater than " + secondValue);
        }
        
        else if (firstValue < secondValue) {
            System.out.println(firstValue + " is less than " + secondValue);
        }
        
        else {
            System.out.println(firstValue + " is equal to " + secondValue);
        }
        
        
        
        inputReader.close();
    }
}
