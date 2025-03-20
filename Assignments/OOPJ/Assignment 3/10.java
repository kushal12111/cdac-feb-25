// 10.
import java.util.HashMap;

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.print("Non-repeating elements: ");
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}