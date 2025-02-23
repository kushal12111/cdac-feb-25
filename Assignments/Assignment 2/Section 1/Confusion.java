public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
                break; // Break after this case
            case 2: 
                System.out.println("Value is 2"); 
                break; // Break after this case
            case 3: 
                System.out.println("Value is 3"); 
                break; // Break after this case
            default: 
                System.out.println("Default case"); 
                break; // Break after this case (optional, as this is the last case)
        } 
    } 
}
