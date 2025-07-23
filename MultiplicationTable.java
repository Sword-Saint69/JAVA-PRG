import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.print("Enter number of rows for the table: ");
        int rows = input.nextInt();
        
        System.out.println("Multiplication Table for " + number);
        System.out.println("-----------------------------");
        
        for (int i = 1; i <= rows; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        input.close();
    }
}
