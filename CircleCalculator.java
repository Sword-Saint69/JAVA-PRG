import java.util.Scanner;

public class CircleCalculator {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radiusInput = userInput.nextDouble();
        

        double piValue = 3.14;
        
        

        double circleArea = piValue * radiusInput * radiusInput;
        
      
        double circleCircumference = 2 * piValue * radiusInput;
        
        
        System.out.println("Circle Calculations ");
        System.out.println("Radius: " + radiusInput);
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Circumference of the circle: " + circleCircumference);
        
        
        userInput.close();
    }
}
