public class genap {
    public static void main(String args[]) {

        int[] nim = { 2, 1, 4, 1, 7, 6, 2, 1, 1, 8 };
        int x = 0, n = 5, i = 1;
        while (i <= n) {
        int j = n, k = 1;
        while (j > i) {
        System.out.print(" ");
        j--;
        }
        while (k <= i) {
            if (x > 9) {
                System.out.print(" ");
                    } else {
                        System.out.print(nim[x] + " ");
                        x = x + 1;
                    }
        k++;
        }
        System.out.println();
        i++;
        }
    }
}