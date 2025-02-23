class EvenNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 50;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
