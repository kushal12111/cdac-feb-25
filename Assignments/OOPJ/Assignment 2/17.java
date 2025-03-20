// 17.
public class MinOfFour {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 5, d = 20;
        int min = (a < b) 
                    ? ((a < c) 
                        ? ((a < d) ? a : d) 
                        : ((c < d) ? c : d)) 
                    : ((b < c) 
                        ? ((b < d) ? b : d) 
                        : ((c < d) ? c : d));
        System.out.println("The minimum value is: " + min);
    }
}