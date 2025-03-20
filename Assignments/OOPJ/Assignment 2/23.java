// 23.

public class OddOrEven {
    public static void main(String[] args) {
        int number = 7;
        String result = (number & 1) == 0 ? "Even" : "Odd";
        System.out.println("The number is: " + result);
    }
}
