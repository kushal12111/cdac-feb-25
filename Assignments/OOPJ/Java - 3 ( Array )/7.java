// 7.
int[] arr = {1, 2, 3, 4, 5};
int k = 2;
int n = arr.length;
int[] rotatedArray = new int[n];
for (int i = 0; i < n; i++) {
    rotatedArray[(i + k) % n] = arr[i];
}
System.out.println(Arrays.toString(rotatedArray));