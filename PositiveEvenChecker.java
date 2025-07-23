import java.util.Scanner;

public class PositiveEvenChecker {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number > 0 && number % 2 == 0) {
            System.out.println(number + " is positive and even");
        } else {
            System.out.println(number + " is not positive and even");
        }
        
        input.close();
    }
}
