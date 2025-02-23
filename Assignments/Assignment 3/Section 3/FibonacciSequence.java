public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1;
        while (a <= 21) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
