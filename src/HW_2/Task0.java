package HW_2;
import  java.util.Scanner;
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public class Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the jewels: ");
        char[] jewels = sc.nextLine().toCharArray();
        char[] stones = sc.nextLine().toCharArray();
        for (char j : jewels){
            int jewCounter = 0;
            for(char s : stones){
                if (j ==s ) jewCounter++;
            }
            System.out.print(j);
            System.out.print(jewCounter);
        }

    }
}

