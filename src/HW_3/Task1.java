package HW_3;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task1 {
    public static void main(String[] args) {
        int size = getRandomInt(10, 50);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(getRandomInt(0, 99));
        }
        System.out.println(nums.isEmpty());
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums);
    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
