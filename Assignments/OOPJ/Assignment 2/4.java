public class Main {
    public static void main(String[] args) {
        int n = 9;
        
        while (n >= 3) {
            n = n - 3;
        }

        if (n == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 3");
        }
    }
}
