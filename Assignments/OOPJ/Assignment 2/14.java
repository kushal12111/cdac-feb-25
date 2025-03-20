// 14.
public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29;  // Example number
        System.out.println("Number of 1s in the binary representation of " + number + " is: " + countSetBits(number));
    }
}