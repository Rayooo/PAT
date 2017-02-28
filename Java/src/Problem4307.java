import java.util.Scanner;

/**
 * Created by Ray on 2017/2/28.
 * https://www.nowcoder.com/pat/5/problem/4307
 */
public class Problem4307 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        String comper = scanner.nextLine();
        count--;
        String res = "";
        while (count-- > 0){
            res = "";
            String input = scanner.nextLine();
            if(comper.length() > input.length()){
                String tmp = comper;
                comper = input;
                input = tmp;
            }


            for(int i = comper.length()-1;i >= 0; --i){
                int index = input.length()-(comper.length()-i);
                if((String.valueOf(comper.charAt(i))).equals((String.valueOf(input.charAt(index))))){
                    res = String.valueOf(comper.charAt(i)) + res;
                }
                else{
                    break;
                }
            }
            comper = res;
        }

        System.out.println(res);
    }


}
