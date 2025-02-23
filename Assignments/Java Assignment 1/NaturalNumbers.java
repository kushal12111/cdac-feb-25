import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int N = scanner.nextInt();

        System.out.println("The first " + N + " natural numbers are:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}
