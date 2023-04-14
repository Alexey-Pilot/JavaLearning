import java.util.Scanner;
/*
Task_6
Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
 */
public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size array: ");
        int l = Integer.parseInt(sc.nextLine());
        int[] arr = new int[l];
        int sum_nums = 0;
        for (int i = 0; i < l; i++){
            System.out.println("elem: ");
            arr[i] = Integer.parseInt(sc.nextLine());
            if (i%2==0){
                sum_nums += arr[i];
            }
        }
        System.out.println(sum_nums);
        for(int i = 0; i < l; i += 2){
            System.out.println(arr[i]);
        }
    }
}
