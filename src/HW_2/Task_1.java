package HW_2;

import java.util.Arrays;

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
public class Task_1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        System.out.println(reposition(s, index));
    }
    public static String reposition(String str, int[] index){
        char[] letters = str.toCharArray();
        char [] res = new char[index.length];
        for (int i = 0; i < index.length; i++){
            res[i] = letters[index[i] - 1];
        }
        String st = new String(res);
        return st;
    }
}
