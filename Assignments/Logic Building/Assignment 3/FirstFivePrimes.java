class FirstFivePrimes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2; // Starting with the first prime number

        while (count < 5) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
