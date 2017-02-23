import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Ray on 2017/2/23.
 */
public class MyPriorityQueue {
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>((o1, o2) -> o1.length()-o2.length());
        queue.add("aaaa");
        queue.add("b");
        queue.add("cc");
        System.out.print(queue.remove());
        System.out.print(queue.remove());
        System.out.print(queue.remove());


    }
}
