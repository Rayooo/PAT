import java.util.Scanner;

/**
 * Created by Ray on 2017/2/6.
 */
public class Problem4079 {
    public static void main(String[] args){
        int[] arr = {
                2,3,5,7,11,13,17,19,23,29,
                31,37,41,43,47,53,59,61,67,71,
                73,79,83,89,97,101,103,107,109,113

        };

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i = a - 1;i < b; ++i){
            System.out.print(arr[i]);
            if(i % 10 == 9){
                System.out.print(" ");
            }
            else{
                System.out.print("\n");
            }
        }


    }

}
