// 16.
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        int p = A.length;
        int q = B.length;

        int[] mergedArray = new int[p + q];
        System.arraycopy(A, 0, mergedArray, 0, p);
        System.arraycopy(B, 0, mergedArray, p, q);

        Arrays.sort(mergedArray);

        System.arraycopy(mergedArray, 0, A, 0, p);
        System.arraycopy(mergedArray, p, B, 0, q);

        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }
}
