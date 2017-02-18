import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/2/problem/250
 */
public class Problem250 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        while (scanner.hasNextInt()){
            a = scanner.nextInt();
            System.out.println(f(a)%3==0 ? "YES":"NO");
        }

    }

    public static int f(int a){
        if(a == 0){
            return 7;
        }
        else if(a == 1){
            return 11;
        }
        else{
            int prepre = 7;
            int pre = 11;
            for(int i = 2;i <= a;++i){
                int current = pre + prepre;
                prepre = pre;
                pre = current;
            }
            return pre;
        }
    }
}
