import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's percentage: ");
        double percentage = scanner.nextDouble();
        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("The student has: " + result);
    }
}
