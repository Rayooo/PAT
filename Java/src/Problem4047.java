import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Ray on 2017/2/6.
 * https://www.nowcoder.com/pat/6/problem/4047
 */
public class Problem4047 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        if(a.compareTo(BigInteger.ZERO) == 0){
            System.out.println("0:1");
            return;
        }

        TreeMap<Integer,Integer> map = new TreeMap<>();

        while (a.compareTo(BigInteger.ZERO) > 0){
            BigInteger x = a.mod(BigInteger.TEN);
            int key = x.intValue();
            a = a.divide(BigInteger.TEN);
            if(map.get(key) != null){
                int value = map.get(key);
                map.put(key,value+1);
            }
            else{
                map.put(key,1);
            }
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry e = (Map.Entry)iterator.next();
            System.out.println(e.getKey() + ":" + e.getValue());
        }


    }


}
