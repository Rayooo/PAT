import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/2/problem/4067
 */
public class Problem4067 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        while (a != 1){
            if(a%2 == 0){
                a = a/2;
            }
            else{
                a = (3*a + 1)/2;
            }
            count++;
        }
        System.out.print(count);

    }
}
