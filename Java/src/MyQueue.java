import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Ray on 2017/2/23.
 */
public class MyQueue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("aaa");
        queue.add("bb");
        System.out.print(queue.peek());

    }
}
