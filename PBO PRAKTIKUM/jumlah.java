public class jumlah {
    public static void main(String args[]) {
        int[] array = { 2, 1, 4, 1, 7, 6, 2, 1, 1, 8 };
        int sum = 0;
        // Advanced for loop
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Jumlah Dari Semua Elemen Array Adalah:" + sum);
    }
}