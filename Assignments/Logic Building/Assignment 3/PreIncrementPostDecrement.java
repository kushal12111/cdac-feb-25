class PreIncrementPostDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int result = ++x + y-- - x++;

        System.out.println("x: " + x);  // Updated value of x after the expression
        System.out.println("y: " + y);  // Updated value of y after the expression
        System.out.println("result: " + result);  // Result of the expression
    }
}
