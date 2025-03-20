// 5.
int[] arr = {1, 2, 3, 4, 5};
int totalSum = 0;
for (int num : arr) {
    totalSum += num;
}
double average = (double) totalSum / arr.length;
System.out.println("Sum: " + totalSum + ", Average: " + average);