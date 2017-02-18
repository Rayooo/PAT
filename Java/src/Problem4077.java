import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/6.
 *
 * https://www.nowcoder.com/pat/6/problem/4077
 * A+B和C (15)
 */
public class Problem4077 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i = 1;i <= count; ++i){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();

            if(c.compareTo(a.add(b)) < 0){
                System.out.println("Case #" + i + ": " + "true");
            }
            else {
                System.out.println("Case #" + i + ": " + "false");
            }

        }

    }


}
