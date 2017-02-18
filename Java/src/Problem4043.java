import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/6.
 * https://www.nowcoder.com/pat/6/problem/4043
 */
public class Problem4043 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        System.out.print(a.divide(b) + " " + a.mod(b));
    }
}
