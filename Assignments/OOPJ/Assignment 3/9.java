// 9.
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 5, 4, 9};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.print("Duplicate elements: ");
        for (int dup : duplicates) {
            System.out.print(dup + " ");
        }
    }
}