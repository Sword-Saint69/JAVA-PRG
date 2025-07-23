import java.util.Scanner;

public class PassFailTernary {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student score: ");
        int score = input.nextInt();
        
        String result = (score >= 40) ? "Pass" : "Fail";
        
        System.out.println("Result: " + result);
        
        input.close();
    }
}
