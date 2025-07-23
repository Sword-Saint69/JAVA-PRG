import java.util.Scanner;

public class RangeChecker {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.print("Enter lower bound: ");
        int lower = input.nextInt();
        
        System.out.print("Enter upper bound: ");
        int upper = input.nextInt();
        
        if (number >= lower && number <= upper) {
            System.out.println(number + " is within the range [" + lower + ", " + upper + "]");
        } else {
            System.out.println(number + " is not within the range [" + lower + ", " + upper + "]");
        }
        
        input.close();
    }
}
