// 16.
public class NumberCheck {
    public static void main(String[] args) {
        int number = -5;

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number " + number + " is: " + result);
    }
}