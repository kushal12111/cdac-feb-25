// 13.
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int mask = number >> 31;
        int absoluteValue = (number + mask) ^ mask;
        
        System.out.println("The absolute value of " + number + " is " + absoluteValue);
        
        scanner.close();
    }
}
