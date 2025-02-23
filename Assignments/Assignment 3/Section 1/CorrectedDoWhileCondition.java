class CorrectedDoWhileCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 1); // Corrected condition to stop after one iteration
    } 
}
