package HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {
        String phBook = "Иванов: +79123242343, Петров: +79876543210, Сидоров: +79765432121, Семенов: +79865433232, Якушев: +79223456789, Аникин: +79232342334";
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        for (var item : phBook.split(", ")) {
            String[] temp = item.split(": ");
            ArrayList<String> num = new ArrayList<>();
            num.add(temp[1]);
            phoneBook.put(temp[0], num);
        }

        System.out.println("Чтобы добавить контакт нажмите: +\nЧтобы изменить контакт нажмите: ++\nЧтобы найти контакт нажмите: ?\nДля просмотра всей телефонной книги нажмите !\nДля выхода любую другую клавишу");
        System.out.print("Выберите действие: ");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            switch (scanner.nextLine()) {
                case "+" -> phones.addNew(phoneBook);
                case "++" -> phones.changeNum(phoneBook);
                case "?" -> phones.find(phoneBook);
                case "!" -> System.out.println(phoneBook);
                default -> {
                    flag = false;
                    System.out.println("Спасибо, что воспользовались телефонной книгой!");
                }

            }
        }
    }
}
