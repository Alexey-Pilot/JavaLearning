package HW_4;

import java.util.LinkedList;

public class EX_3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = EX_1.createLL();
        System.out.println(ll);
        int sumLL = countSum(ll);
        System.out.println(sumLL);
        System.out.println(ll);

    }

    public static int countSum(LinkedList<Integer> lst) {
        int res = 0;
        for (int i :lst) {
            res += i;
        }
        return res;
    }
}
