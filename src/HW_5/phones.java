package HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phones {
    public static void addNew(HashMap<String, ArrayList<String>> phoneNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        ArrayList<String> phones = new ArrayList<>();
        System.out.println("Введите номер телефона: ");
        phones.add(sc.nextLine());
        phoneNumber.put(name, phones);
        System.out.println("Контакт добавлен");
    }

    public static void changeNum(HashMap<String, ArrayList<String>> phoneNumber) {
        String contact = find(phoneNumber);
        Scanner scanner = new Scanner(System.in);
        if (contact == null) {
            System.out.println("Добавить новый контакт или искать снова? н - новый, д - добавить, любая другая - выход");
            String act = scanner.nextLine().toLowerCase();
            if (act.equals("н")) addNew(phoneNumber);
            else if (act.equals("д")) changeNum(phoneNumber);
            else System.out.println("Спасибо, что воспользовались справочником");
        } else {
            ArrayList<String> numbers = phoneNumber.get(contact);
            phoneNumber.remove(contact);
            System.out.println("Ведите дополнительный номер");
            String newNum = scanner.nextLine();
            numbers.add(newNum);
            phoneNumber.put(contact, numbers);
            System.out.println("Номер изменен");
        }
    }

    public static String find(HashMap<String, ArrayList<String>> phoneBook) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine().toLowerCase();
        for (var item : phoneBook.entrySet()) {
            if (item.getKey().toLowerCase().contains(name)) {
                System.out.printf("%s ", item.getKey());
                for (String number : item.getValue()) {
                    System.out.printf("%s, ", number);
                }
                return item.getKey();
            }
        }
        return null;
    }

}
