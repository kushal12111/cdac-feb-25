// 4.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a += b;
        b = a - b;
        a -= b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}