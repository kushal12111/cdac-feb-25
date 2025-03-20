// 8.
import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
        
        System.out.print("Enter the second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();
        
        System.out.print("Enter the third boolean value (true/false): ");
        boolean c = scanner.nextBoolean();
        
        boolean result = (a && b) || (a && c) || (b && c);
        
        System.out.println("At least two inputs are true: " + result);
        
        scanner.close();
    }
}