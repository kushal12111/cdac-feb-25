// 3.

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting
        int a = 100;
        double b = a; // int to double
        System.out.println("Implicit casting (int to double): " + b);
        
        // Explicit casting
        double x = 9.78;
        int y = (int) x; // double to int
        System.out.println("Explicit casting (double to int): " + y);
    }
}