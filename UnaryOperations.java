import java.util.Scanner;

public class UnaryOperations {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Original number: " + number);
        System.out.println("Increment: " + ++number);
        System.out.println("Decrement: " + --number);
        System.out.println("Negation: " + -number);
        
        input.close();
    }
}
