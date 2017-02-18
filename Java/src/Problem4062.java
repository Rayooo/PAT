import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/6/problem/4062
 */
public class Problem4062 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String x = scanner.nextLine();
        Character ch = x.charAt(1);

        int b = (int) Math.round(a*0.5);
        for(int i = 1;i <= b; ++i){
            if(i == 1 || i == b){
                for(int j = 0;j < a;++j){
                    System.out.print(ch);
                }
                System.out.println();
            }
            else{
                for(int j = 0;j < a;++j){
                    if(j == 0 || j == a-1){
                        System.out.print(ch);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}
