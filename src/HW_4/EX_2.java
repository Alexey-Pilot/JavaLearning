package HW_4;
import java.util.LinkedList;
final class DequeueL{
    public int firstElem;
    public LinkedList<Integer> lList;
    public DequeueL(int firstElem, LinkedList<Integer> lList){
        this.firstElem = firstElem;
        this.lList = lList;
    }

}
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
        DequeueL dq = dequeue(ll);
        System.out.println(dq.firstElem);
        System.out.println(dq.lList);
        int fst = first(ll);
        System.out.println(fst);
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> lst){
        int el = lst.pollFirst();
        lst.add(el);
        return lst;
    }
    public static DequeueL dequeue(LinkedList<Integer> lst){
        int el = lst.pollFirst();
        return new DequeueL(el, lst);
    }
    public static int first (LinkedList<Integer> lst){
        int el = lst.peekFirst();
        return el;
    }

}
