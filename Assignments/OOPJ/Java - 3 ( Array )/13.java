// 13.
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] marks = new int[20][3];
        int above75Count = 0, below40Count = 0;

        System.out.println("Enter marks for 20 students in Physics, Chemistry, and Maths:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
            }
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 3.0);
            if (percentage >= 75) above75Count++;
            if (percentage <= 40) below40Count++;
        }

        System.out.println("Number of students securing 75% and above: " + above75Count);
        System.out.println("Number of students securing 40% and below: " + below40Count);
    }
}