package HW_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

/*Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

 */
public class EX2 {
    public static void main(String[] args) {
        String employees ="Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, " +
                "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] empList = employees.split(", ");
        ArrayList<String> names = new ArrayList<>();
        for (String value : empList) {
            names.add(value.split(" ")[0]);
        }
        TreeMap<Integer, ArrayList<String>> sortedNames= new TreeMap<>();
        for (String s: empList){

            int counter = Collections.frequency(names, s.split(" ")[0]);
            ArrayList<String> tempoList = new ArrayList<>();
            if (sortedNames.containsKey(counter)){
                tempoList = sortedNames.get(counter);
                tempoList.add(s);
                sortedNames.put(counter, tempoList);

            }else{;
                tempoList.add(s);
                sortedNames.put(counter, tempoList);}
        }
        StringBuilder sb = new StringBuilder();
        for( var s :sortedNames.values()){
            String x = s.toString().replace(']', ',').replace('[', ' ');
            sb.append(x);
        }
        System.out.println(sb.substring(1));

    }
}
