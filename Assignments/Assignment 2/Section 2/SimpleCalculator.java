import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean isError = false;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    isError = true;
                }
                break;
            default:
                System.out.println("Invalid operator");
                isError = true;
                break;
        }

        if (!isError) {
            System.out.println("The result is: " + result);
        } else if (operator == '/') {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
