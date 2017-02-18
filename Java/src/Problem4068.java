import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/2/problem/4068
 */
public class Problem4068 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals("0")){
            System.out.print("ling");
            return;
        }

        int ans = 0;
        for(int i = 0;i < s.length();++i){
            String ch = String.valueOf(s.charAt(i));
            int a = Integer.parseInt(ch);
            ans += a;
        }
        String[] strings = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String result = "";
        while (ans>0){
            int num = ans % 10;
            result = strings[num] + result;
            if(ans>9){
                result = " " + result;
            }
            ans /= 10;

        }
        System.out.print(result);

    }
}
