import java.util.Scanner;

/**
 * Created by Ray on 2017/2/7.
 * https://www.nowcoder.com/pat/6/problem/4049
 */
public class Problem4049 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0;i < 10;++i){
            arr[i] = scanner.nextInt();
        }

        if(arr[0] == 0){
            for(int i = 0;i  < 10;++i){
                if(arr[i] != 0){
                    while (arr[i]-- > 0){
                        System.out.print(i);
                    }
                }
            }
        }
        else{
            boolean isFound = false;
            for(int i = 1;i < 10; ++i){
                if(arr[i] != 0){
                    System.out.print(i);
                    arr[i]--;
                    isFound = true;
                    break;
                }
            }

            if(isFound){
                for(int i = 0;i  < 10;++i){
                    if(arr[i] != 0){
                        while (arr[i]-- > 0){
                            System.out.print(i);
                        }
                    }
                }
            }
            else{
                System.out.print("0");
            }
        }


    }

}
