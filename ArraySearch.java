import java.util.Scanner;

public class ArraySearch {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int searchElement = input.nextInt();
        
        boolean found = false;
        int index = -1;
        
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                index = i;
                break;
            }
        }
        
        if (found) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array");
        }
        
        input.close();
    }
}
