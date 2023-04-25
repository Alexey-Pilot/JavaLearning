package HW_4;
import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class EX_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = EX_1.CreateLL();
        System.out.println(ll);
        LinkedList<Integer> eq = enqueue(ll);
        System.out.println(eq);
        int dq = dequeue(ll);
        System.out.println(dq);
        int fst = first(ll);
        System.out.println(fst);
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> lst){
        int el = lst.pollFirst();
        lst.add(el);
        return lst;
    }
    public static int dequeue(LinkedList<Integer> lst){
        int el = lst.pollFirst();
        return el;
    }
    public static int first (LinkedList<Integer> lst){
        int el = lst.peekFirst();
        return el;
    }

}
