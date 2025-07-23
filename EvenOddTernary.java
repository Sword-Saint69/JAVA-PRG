import java.util.Scanner;

public class EvenOddTernary {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        String result = (number % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number is " + result);
        
        input.close();
    }
}
