/**
 * Created by Ray on 2017/3/4.
 */
public class split {
    public static void main(String[] args){
        String a = "1234 123fdsf sdfa";
        String[] x = a.split(" ");
        for (String i : x){
            System.out.println(i);
        }
    }
}
