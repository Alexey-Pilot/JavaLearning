package HW_4;

import java.util.Random;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class EX_4 {
    public static void main(String[] args) {
        int[] array = createArray();
        printArray(array);
        System.out.println("Shift Array");
        printArray(enqueue(array));
        Dequeue dq = dequeue(array);
        System.out.printf("First num is %d\n", dq.firstElem);
        System.out.println("Array without first num");
        printArray(dq.array);
        System.out.printf("First num is %d\n", first(array));


    }

    public static int[] createArray() {
        int size = new Random().nextInt(20) + 10;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = new Random().nextInt(100);
        }
        return res;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.printf("%d, ", i);
        System.out.println();
    }

    public static int[] enqueue(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                res[arr.length - 1] = arr[0];
            } else {
                res[i - 1] = arr[i];
            }
        }
        return res;
    }


    public static Dequeue dequeue(int[] arr) {
        int[] res = new int[arr.length - 1];
        System.arraycopy(arr, 1, res, 0, res.length);
        System.out.println(arr[0]);
        int x = first(arr);
        return new Dequeue(x, res);
    }

    public static int first(int[] arr) {
        return arr[0];
    }
}

final class Dequeue {
    public int firstElem;
    public int[] array;

    public Dequeue(int firstElem, int[] array) {
        this.firstElem = firstElem;
        this.array = array;
    }
}
