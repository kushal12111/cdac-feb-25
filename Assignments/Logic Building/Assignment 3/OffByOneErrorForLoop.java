class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { // Adjusted loop condition to i < 10
            System.out.println(i); 
        } 
        // Expected: 9 iterations with numbers 1 to 9 
        // Actual: Prints numbers 1 to 9 
    } 
}
