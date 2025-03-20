// 11.
import java.util.Scanner;

public class PowerOfTwoChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPowerOfTwo = (number > 0) && ((number & (number - 1)) == 0);
        
        System.out.println("Is the number a power of 2? " + isPowerOfTwo);
        
        scanner.close();
    }
}