// 12.
import java.util.Scanner;

public class MultiplyByEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = number << 3;
        
        System.out.println("The result of multiplying " + number + " by 8 is " + result);
        
        scanner.close();
    }
}
