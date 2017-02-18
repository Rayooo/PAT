import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/2/problem/4075
 */
public class Problem4075 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] result = s.split(" ");
        for(int i = result.length-1;i >= 0;--i){
            System.out.print(result[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }
    }
}
