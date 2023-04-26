package HW_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.
public class EX_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = createLL();
        System.out.println(ll);
        LinkedList<Integer> ll_rev = revertLL(ll);
        System.out.println(ll_rev);
    }

    public static LinkedList<Integer> createLL() {
        LinkedList<Integer> ll = new LinkedList<>();
        int size = new Random().nextInt(20) + 10;
        for (int i = 0; i < size; i++) {
            int el = new Random().nextInt((100) + 1);
            ll.add(el);
        }
        return ll;
    }

    public static LinkedList<Integer> revertLL(LinkedList<Integer> lst) {
        Collections.reverse(lst);
        return lst;
    }
}
