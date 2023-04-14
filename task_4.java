package HW_1;
import java.util.Scanner;

/*
 * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = randomInt(1, 3);
        System.out.printf("Введите %d цифру первого слагаемого: ", x);
        int q = Integer.parseInt(sc.nextLine());
        int y = randomInt(1, 3);
        System.out.printf("Введите %d цифру второго слагаемого: ", y);
        int w = Integer.parseInt(sc.nextLine());
        int z = randomInt(1, 3);
        System.out.printf("Введите %d цифру суммы:  ", z);
        int e = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            int num_1 = 0;
            if (x == 2){
                num_1 = i * 10 + q;
            }
            if (x == 1){
                num_1 = i + q * 10;
            }
            for (int j = 0; j < 10; j++) {
                int num_2 = 0;
                if (y == 2) {
                    num_2 = j * 10 + w;
                } else {
                    num_2 = j + w * 10;
                }
                for (int k = 0; k < 10; k++) {
                    int sum = 0;
                    if (z == 1) {
                        sum = k * 10 + e;
                    } else {
                        sum = k + e * 10;
                    }
                    if (num_1 + num_2 == sum){
                        flag = true;
                        System.out.printf("%d + %d = %d", num_1, num_2, sum);
                        System.out.println();
                    }

                }
            }
        }
        if (flag == false) System.out.println("Уравнение не имеет решений!");


    }

    static Integer randomInt(int maxValue, int minValue) {
        int rand = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        return rand;
    }
}
