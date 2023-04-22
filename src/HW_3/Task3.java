package HW_3;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
public class Task3 {
    public static void main(String[] args) {
        String[] planets = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        @NotNull ArrayList planetArr= planetList(planets);
        System.out.println(planetArr);
        Map<String,Integer> countPlanet = new HashMap<String, Integer>();
        for (String i : planets){
            countPlanet.put(i, countElem(planetArr, i));
        }
        for (String key : planets){
            System.out.printf("%s: %d", key, countPlanet.get(key));
            System.out.println();
        }

    }
    public static @NotNull ArrayList planetList(String[] planets){
        ArrayList<String> res = new ArrayList<>();
        Random r = new Random();
        int size = r.nextInt((100 - 10) + 10);
        for (int i = 0; i < size; i ++){
            int planetIndex = r.nextInt(planets.length);
            res.add(planets[planetIndex]);
        }
        return res;
    }
    public static int countElem(ArrayList<String> arr, String elem){
        int counter =0;
        for (String s : arr){
            if(s.equals(elem)) counter ++;
        }
        return counter;
    }
}
