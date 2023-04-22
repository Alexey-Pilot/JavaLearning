package HW_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.
// Collections.max()
public class Task2 {
    public static void main(String[] args) {
        int size = getRandomNum(10, 100);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(getRandomNum(0, 100));
        }
        System.out.println(nums);
        System.out.printf("Max num equals to %d", Collections.max(nums));
        System.out.println();
        System.out.printf("Min num equals to %d", Collections.min(nums));
        System.out.println();
        System.out.printf("Average of nums equals to %f", getAverageInt(nums));

    }

    public static int getRandomNum(int min, int max) {
        Random num = new Random();
        return num.nextInt((max - min) + 1) + min;
    }

    public static double getAverageInt(ArrayList<Integer> lst) {
        double summ = 0;
        for (int i : lst) {
            summ += i;
        }
        return summ / lst.toArray().length;
    }

}
