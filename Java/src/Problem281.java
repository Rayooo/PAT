import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/2/problem/281
 */
public class Problem281 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();

            if((a.add(b)).compareTo(c) > 0 && (c.add(b)).compareTo(a) > 0 && (a.add(c)).compareTo(b) > 0 ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
