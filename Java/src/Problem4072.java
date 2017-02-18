import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 */
public class Problem4072 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String result = "";
        int count = 0;
        while (a > 0){
            count++;
            int x = a%10;
            a /= 10;
            if(count == 1){
                for(int i = 1;i <= x; ++i){
                    result = result + i;
                }
            }
            else if(count == 2){
                for(int i = 1;i <= x; ++i){
                    result = "S" + result;
                }
            }
            else if(count == 3){
                for(int i = 1;i <= x; ++i){
                    result = "B" + result;
                }
            }


        }
        System.out.print(result);

    }
}
