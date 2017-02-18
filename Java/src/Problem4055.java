import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/6/problem/4055
 */
public class Problem4055 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i < b.length();++i){
            Character ch = b.charAt(i);
            map.put(Character.toUpperCase(ch), 1);
            map.put(Character.toLowerCase(ch),1);
        }

        for(int i = 0; i < a.length();++i){
            Character ch = a.charAt(i);
            if(map.get(ch) == null){
                map.put(Character.toUpperCase(ch), 1);
                map.put(Character.toLowerCase(ch),1);
                System.out.print(Character.toUpperCase(ch));
            }
        }


    }


}
