package HW_2;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Реализовать простой калькулятор
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.printf("Выберите действие: +-*/ ");
        String o = sc.nextLine();
        System.out.printf("Введите второе число: ");
        int b = Integer.parseInt(sc.nextLine());
        logger();
        if (o.equals("+")) sum_nums(a, b);
        else if(o.equals("-")) diff_nums(a, b);
        else if (o.equals("*")) mult_nums(a, b);
        else if (o.equals("/")) div_nums(a, b);
        else System.out.println("Wrong operation!");

    }

    static void sum_nums(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
        System.out.println();
    }

    static void diff_nums(int a, int b) {
        System.out.printf("%d - %d = %d", a, b, a - b);
        System.out.println();
    }

    static void mult_nums(int a, int b) {
        System.out.printf("%d * %d = %d", a, b, a * b);
        System.out.println();
    }

    static void div_nums(int a, int b) {
        try {
            if (a % b == 0){
                System.out.printf("%d / %d = %d", a, b, a / b);
                System.out.println();
            }
            else {
                Double da = Double.valueOf(a);
                Double db = Double.valueOf(b);
                System.out.printf("%d / %d = %f", a, b, da / db);
                System.out.println();
            }
        } catch (Exception exception) {
            String s = "division to 0";
            System.out.println(s);
            System.out.println(exception);
        }

    }

    static void logger() {
        Logger logger = Logger.getLogger(Task3.class.getName());
        logger.setLevel(Level.ALL);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Test logging");
        logger.info("Test logging again");
    }

}
