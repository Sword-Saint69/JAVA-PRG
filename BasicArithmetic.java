import java.util.Scanner;

public class BasicArithmetic {
    
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double firstNumber = inputScanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double secondNumber = inputScanner.nextDouble();
        
        
        double additionResult = firstNumber + secondNumber;
        double subtractionResult = firstNumber - secondNumber;
        double multiplicationResult = firstNumber * secondNumber;
        double divisionResult = firstNumber / secondNumber;
        double modulusResult = firstNumber % secondNumber;
        
        
        System.out.println("====OUTPUT====");
        System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + additionResult);
        System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + subtractionResult);
        System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + multiplicationResult);

        inputScanner.close();
    }
}
