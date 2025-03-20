import java.util.Scanner;

class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input grades for three subjects
        System.out.print("Enter the grade for subject 1: ");
        int grade1 = scanner.nextInt();

        System.out.print("Enter the grade for subject 2: ");
        int grade2 = scanner.nextInt();

        System.out.print("Enter the grade for subject 3: ");
        int grade3 = scanner.nextInt();

        // Initialize a counter for the number of failed subjects
        int failCount = 0;

        // Check if the student failed in any subject
        if (grade1 <= 40) {
            failCount++;
        }
        if (grade2 <= 40) {
            failCount++;
        }
        if (grade3 <= 40) {
            failCount++;
        }

        // Determine pass or fail
        if (failCount == 0) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student fails in " + failCount + " subjects.");
        }
    }
}
