// 15.
public class SwapOddEvenBits {

    public static int swapBits(int n) {
        int evenBits = n & 0xAAAAAAAA;
        int oddBits = n & 0x55555555;
        evenBits >>= 1;
        oddBits <<= 1;
        return (evenBits | oddBits);
    }

    public static void main(String[] args) {
        int number = 23;
        System.out.println("Original number: " + number);
        System.out.println("Number after swapping odd and even bits: " + swapBits(number));
    }
}