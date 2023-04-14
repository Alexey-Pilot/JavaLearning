package HW_1;

import java.util.Scanner;

//Реализовать простой калькулятор
public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.printf("Выберите действие: +-*/ ");
        String o = sc.nextLine();
        System.out.printf("Введите второе число: ");
        int b = Integer.parseInt(sc.nextLine());
        switch (o) {
            case "+":
                System.out.println(sum_nums(a, b));
                break;
            case "-":
                System.out.println(diff_nums(a, b));
                break;
            case "*":
                System.out.println(mult_nums(a, b));
                break;
            case "/":
                System.out.println(div_nums(a, b));
                break;
        }

    }

    static Integer sum_nums(int a, int b) {
        return a + b;
    }

    static Integer diff_nums(int a, int b) {
        return a - b;
    }

    static Integer mult_nums(int a, int b) {
        return a * b;
    }

    static Double div_nums(double a, double b) {
        return a / b;
    }
}
