
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/2/problem/367
 */
public class Problem367 {
    public static void main(String[] args){
        String[] arr = {"V","W","X","Y","Z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U"};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String a = scanner.nextLine();
            for(int i = 0;i < a.length();++i){
                char ch = a.charAt(i);
                if(String.valueOf(ch).equals(" ")){
                    System.out.print(" ");
                }
                else {
                    char asciiA = 'A';
                    System.out.print(arr[(int)ch - (int)asciiA]);
                }
            }
            System.out.println();
        }


    }


}
