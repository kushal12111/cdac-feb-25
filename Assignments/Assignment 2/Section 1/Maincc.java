public class Maincc { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        Maincc obj = new Maincc(); // Create an instance of the Maincc class
        obj.display(); // Call the display() method using the instance
        obj.display(5); // Call the overloaded display(int num) method using the instance
    } 
}
