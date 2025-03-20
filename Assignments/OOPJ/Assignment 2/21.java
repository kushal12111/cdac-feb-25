// 21.

public class IncrementWithoutPlus {
    public static void main(String[] args) {
        int number = 5;
        int incrementedNumber = -~number;
        System.out.println("The incremented value is: " + incrementedNumber);
    }
}