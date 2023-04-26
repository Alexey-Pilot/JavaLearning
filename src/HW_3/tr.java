package HW_3;

public class tr {
    public static void main(String[] args) {
        int[] lstA = new int[]{1, 3, 5, 7, 9};
        int[] lstB = new int[]{2, 4, 6, 8, 10};
        int[] x = intSort(lstA, lstB);
        for (int i : x) {
            System.out.printf("%d, ", i);
        }
        System.out.println();
        System.out.println(x.length);

    }

    public static int[] intSort(int[] a, int[] b) {
        for (int z : a) System.out.print(z);

        int i = 0;
        int j = 0;
        int[] res = new int[a.length + b.length];
        for (int x = 0; x < res.length; x++) {
            if (i == a.length) {
                res[x] = b[j];
                j++;
            } else if (j == b.length) {
                res[x] = a[i];
                i++;
            } else if (a[i] < b[j]) {
                res[x] = a[i];
                i++;
            } else if (a[i] > b[j]) {
                res[x] = b[j];
                j++;
            }
        }

        return res;
    }
}
