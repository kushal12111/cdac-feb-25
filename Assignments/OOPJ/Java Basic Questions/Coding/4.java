// 4.

public class WrapperClassExample {
    public static void main(String[] args) {
        int num = 10;
        double d = Double.valueOf(num); // Integer to Double using wrapper class
        System.out.println("Integer to Double: " + d);
        
        double doubleValue = 15.5;
        int intValue = doubleValue.intValue(); // Double to Integer using wrapper class
        System.out.println("Double to Integer: " + intValue);
    }
}