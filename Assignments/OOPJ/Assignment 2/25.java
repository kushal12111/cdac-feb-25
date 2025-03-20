// 25.

public class ReverseInteger {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int reversedNumber = 0;
        
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
