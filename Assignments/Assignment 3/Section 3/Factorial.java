class Factorial {
    public static void main(String[] args) {
        int number = 10; // The number for which to compute the factorial
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
