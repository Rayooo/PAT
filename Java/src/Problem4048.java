import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/6.
 * https://www.nowcoder.com/pat/6/problem/4048
 */
public class Problem4048 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger n = scanner.nextBigInteger();
        BigInteger c = a.add(b);

        String result = "";
        while (c.compareTo(BigInteger.ZERO) > 0){
            String m = String.valueOf(c.mod(n).intValue());
            result = m + result;
            c = c.divide(n);
        }

        System.out.print(result);
    }
}
