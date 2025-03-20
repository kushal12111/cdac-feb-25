// 10.

int[] arr1 = {1, 2, 2, 3, 4};
int[] arr2 = {2, 3, 5};
Set<Integer> set1 = new HashSet<>();
for (int num : arr1) {
    set1.add(num);
}
Set<Integer> set2 = new HashSet<>();
for (int num : arr2) {
    set2.add(num);
}
set1.retainAll(set2);
System.out.println("Intersection: " + set1);
set1 = new HashSet<>();
for (int num : arr1) {
    set1.add(num);
}
for (int num : arr2) {
    set1.add(num);
}
System.out.println("Union: " + set1);