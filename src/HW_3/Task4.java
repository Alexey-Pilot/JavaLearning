package HW_3;

import java.util.Random;

/*Реализовать алгоритм сортировки слиянием
 */
public class Task4 {
    public static void main(String[] args) {
        int size = 8; //newRandomInt(4, 3);
        int[] nums = createArray(size);
        for (int i : nums) System.out.printf("%d ", i);
        System.out.println();
        int[] sorted = mergeSort(nums);
        for (int i : sorted) System.out.printf("%d ", i);


    }

    public static int[] createArray(int size) {
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            int elem = newRandomInt(10, 0);
            res[i] = elem;
        }
        return res;
    }

    public static int newRandomInt(int max, int min) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }

    public static int[] mergeSort(int[] nums) {
        if (nums == null) return null;
        if (nums.length < 2) return nums;
        int mid = nums.length / 2;
        int[] listA = new int[mid];
        int[] listB = new int[nums.length - mid];
        System.arraycopy(nums, 0, listA, 0, listA.length);
        System.arraycopy(nums, mid, listB, 0, listB.length);

//        for (int i : listA) System.out.printf("%d ", i);
//        System.out.println();
//        for (int i : listB) System.out.printf("%d ", i);
//        System.out.println();
        mergeSort(listA);
        mergeSort(listB);
        return intSort(listA, listB);
    }

    public static int[] intSort(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < a3.length; k++) {
            if (a1.length > i && a2.length > j) {
                if (a1[i] < a2[j]) {
                    a3[k] = a1[i];
                    i++;
                } else {
                    a3[k] = a2[j];
                    j++;
                }
            }

            if (i == a1.length) {
                a3[k] = a2[j];
                j++;
            } else if (j == a2.length) {
                a3[k] = a1[i];
                i++;
            }
        }
        for (int x : a3) {
            System.out.printf("%d, ", x);
        }
        System.out.println();
        return a3;
    }

}
