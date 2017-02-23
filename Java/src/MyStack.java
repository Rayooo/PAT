import java.util.Stack;

/**
 * Created by Ray on 2017/2/23.
 */
public class MyStack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("aaa");
        stack.push("bbb");
        System.out.println(stack.peek());

    }
}
