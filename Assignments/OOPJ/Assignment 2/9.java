
// 9.
import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Is the number within the range 20 to 50? " + (number >= 20 && number <= 50));
        
        scanner.close();
    }
}