import java.util.Scanner;

/*
Task_7
Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
Sample Input:
6
1
2
2
3
3
3
Sample Output:
1
 */
public class task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size array: ");
        int l = Integer.parseInt(sc.nextLine());
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("elem: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println();
        unique_elements(arr);
    }

    static void unique_elements(int[] arr) {
        System.out.print("Unique elements is: ");
        for (int k : arr) {
            int counter = 0;
            for (int i : arr) {
                if (k == i) counter++;
            }
            if (counter == 1) System.out.printf("%d ", k);
        }
    }
}
