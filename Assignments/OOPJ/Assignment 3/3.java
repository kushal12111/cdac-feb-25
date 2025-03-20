
// 3.
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 85, 12};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The smallest element in the array is: " + min);
    }
}