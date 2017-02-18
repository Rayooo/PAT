import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/2/problem/253
 */
public class Problem253 {
    public static void main(String[] args){
        int arr[] = new int[100001];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2;i < 100001; ++i){
            arr[i] = (arr[i-1]+arr[i-2])%1000000;
        }

        Scanner scanner = new Scanner(System.in);
        int a;
        while (scanner.hasNextInt()){
            a = scanner.nextInt();
            if(a > 25){
                int zero = 6- String.valueOf(arr[a]).length();
                while (zero-- >0){
                    System.out.print("0");
                }

            }
            System.out.println(arr[a]);
        }
    }

}
