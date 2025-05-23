// 12.

import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int evenCount = 0, oddCount = 0, multiplesOfThreeCount = 0;

        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
            if (arr[i] % 3 == 0) multiplesOfThreeCount++;
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multiplesOfThreeCount);
    }
}