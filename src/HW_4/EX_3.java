package HW_4;

import java.util.LinkedList;

public class EX_3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = EX_1.CreateLL();
        System.out.println(ll);
        int sumLL = countSum(ll);
        System.out.println(sumLL);
        System.out.println(ll);

    }

    public static int countSum(LinkedList<Integer> lst) {
        int res = 0;
        for (int i = 0 ; i < lst.size(); i++) {
            int el = lst.pollFirst();
            lst.addLast(el);
            res += el;
        }
        return res;
    }
}
