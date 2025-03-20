class LargestDigit {
    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            if (digit > largestDigit) {
                largestDigit = digit; // Update the largest digit
            }
            number /= 10; // Remove the last digit
        }

        System.out.println("The largest digit is: " + largestDigit);
    }
}
