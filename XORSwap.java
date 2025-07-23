import java.util.Scanner;

public class XORSwap {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // XOR swap algorithm
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
        
        input.close();
    }
}
