// 1.
int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
int largest = arr[0];
int smallest = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > largest) largest = arr[i];
    if (arr[i] < smallest) smallest = arr[i];
}
System.out.println("Largest: " + largest + ", Smallest: " + smallest);