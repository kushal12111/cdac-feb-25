// 15.

import java.util.HashMap;
import java.util.ArrayList;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        int[][] arrays = {
            { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 },
            { 1, 2, -3, 4, 5, 6 },
            { 1, 2, -2, 3, 4, 5, 6 }
        };

        for (int[] nums : arrays) {
            System.out.println("Sub-arrays with 0 sum:");
            findZeroSumSubarrays(nums);
        }
    }

    public static void findZeroSumSubarrays(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                System.out.println("[" + 0 + ", " + i + "]");
            }
            if (map.containsKey(sum)) {
                ArrayList<Integer> indices = map.get(sum);
                for (Integer index : indices) {
                    System.out.println("[" + (index + 1) + ", " + i + "]");
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }
}