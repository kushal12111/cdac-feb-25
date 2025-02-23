class MultiplesOfSeven {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
