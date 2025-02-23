class CorrectedLoopVariableScope { 
    public static void main(String[] args) { 
        int x = 0; // Declare the variable x outside the loop
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); // Now 'x' is accessible here
    } 
}
