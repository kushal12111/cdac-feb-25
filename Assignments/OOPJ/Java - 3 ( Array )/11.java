// 11.

public static int[] subarraySum(int[] arr, int S) {
    for (int i = 0; i < arr.length; i++) {
        int currentSum = arr[i];
        for (int j = i + 1; j <= arr.length; j++) {
            if (currentSum == S) {
                return Arrays.copyOfRange(arr, i, j);
            }
            if (j == arr.length) break;
            currentSum += arr[j];
        }
    }
    return new int[0];
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 7, 5};
    int S = 12;
    int[] result = subarraySum(arr, S);
    System.out.println(Arrays.toString(result));
}
