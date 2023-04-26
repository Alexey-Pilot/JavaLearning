package HW_3;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class extratask {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(createListRandomInt(20, -29, 30));
        System.out.println(nums);
        merge_sort(nums);
        System.out.println(nums);
    }
    public static List<Integer> createListRandomInt(int capacity, int min, int max) {
        Random rnd = new Random();
        List<Integer> lst = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            lst.add(rnd.nextInt(min, max));
        }
        return lst;
    }

    static void merge_sort(List<Integer> nums) {
        if (nums.size() > 1) {
            int mid = nums.size() / 2;
            List<Integer> left = new ArrayList<>(nums.subList(0, mid));
            List<Integer> right = new ArrayList<>(nums.subList(mid, nums.size()));
            merge_sort(left);
            merge_sort(right);
            int i = 0, j = 0, k = 0;
            while ((i < left.size()) && (j < right.size())) {
                if (left.get(i) < right.get(j)) {
                    nums.set(k, left.get(i));
                    i++;
                } else {
                    nums.set(k, right.get(j));
                    j++;
                }
                k++;
            }
            while (i < left.size()) {
                nums.set(k, left.get(i));
                i++;
                k++;
            }
            while (j < right.size()) {
                nums.set(k, right.get(j));
                j++;
                k++;
            }

        }
    }
}

