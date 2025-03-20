class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break; // Break after this case
            case 2: 
                System.out.println("Level 2"); 
                break; // Break after this case
            case 3: 
                System.out.println("Level 3"); 
                break; // Break after this case
            default: 
                System.out.println("Unknown level"); 
                break; // Break after this case (optional, as this is the last case)
        } 
    } 
}
