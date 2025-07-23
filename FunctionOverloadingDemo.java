import java.util.Scanner;

public class FunctionOverloadingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read and display integer
        System.out.print("Enter an integer: ");
        int intNum = readNumber(scanner, "int");
        System.out.println("You entered integer: " + intNum);
        
        // Read and display double
        System.out.print("Enter a double: ");
        double doubleNum = readNumber(scanner, "double");
        System.out.println("You entered double: " + doubleNum);
        
        // Read and display string
        System.out.print("Enter a string: ");
        String str = readNumber("string");
        System.out.println("You entered string: " + str);
        
        scanner.close();
    }
    
    // Function to read integer
    public static int readNumber(Scanner scanner, String type) {
        if (type.equals("int")) {
            System.out.print("Enter an integer: ");
            return scanner.nextInt();
        }
        return 0;
    }
    
    // Overloaded function to read double
    public static double readNumber(Scanner scanner, String type) {
        if (type.equals("double")) {
            System.out.print("Enter a double: ");
            return scanner.nextDouble();
        }
        return 0.0;
    }
    
    // Overloaded function to read string
    public static String readNumber(String type) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
}
