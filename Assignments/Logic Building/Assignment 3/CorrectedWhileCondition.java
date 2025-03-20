class CorrectedWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count == 0) { // Use the equality operator to compare
            System.out.println(count); 
            count--; 
        } 
    } 
}
