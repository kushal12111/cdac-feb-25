// 4.
int[] arr = {1, 2, 3, 4, 5, 6};
int evenCount = 0;
int oddCount = 0;
for (int num : arr) {
    if (num % 2 == 0) {
        evenCount++;
    } else {
        oddCount++;
    }
}
System.out.println("Even numbers: " + evenCount + ", Odd numbers: " + oddCount);