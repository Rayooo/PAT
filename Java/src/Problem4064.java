import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/6/problem/4064
 */
public class Problem4064 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count1 = scanner.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        while (count1-- > 0){
            int grade = scanner.nextInt();
            if(map.get(grade) == null){
                map.put(grade,1);
            }
            else{
                int sum = map.get(grade) + 1;
                map.put(grade,sum);
            }
        }

        int count2 = scanner.nextInt();
        while (count2-- > 0){
            int grade = scanner.nextInt();
            if(map.get(grade) != null){
                System.out.print(map.get(grade));
            }
            else{
                System.out.print("0");
            }
            if(count2 != 0){
                System.out.print(" ");
            }
        }


    }


}
