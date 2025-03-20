// 5.

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        // Using temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (using temporary variable): a = " + a + ", b = " + b);
        
        // Without using temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (without using temporary variable): a = " + a + ", b = " + b);
    }
}