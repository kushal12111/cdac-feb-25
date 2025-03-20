// 6.
int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
int[] result = new int[arr.length];
int j = 0;
for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i] != arr[i + 1]) {
        result[j++] = arr[i];
    }
}
result[j++] = arr[arr.length - 1];
int[] uniqueArray = Arrays.copyOf(result, j);
System.out.println(Arrays.toString(uniqueArray));