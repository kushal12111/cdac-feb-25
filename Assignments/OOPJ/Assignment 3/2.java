// 2.
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 85, 12};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}