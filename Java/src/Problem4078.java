import java.util.Scanner;

/**
 * Created by Ray on 2017/2/6.
 * https://www.nowcoder.com/pat/6/problem/4078
 * 数字分类 (20)
 */
public class Problem4078 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for(int i = 0;i < count;++i){
            arr[i] = scanner.nextInt();
        }

        int a1 = 0;
        int a2 = 0;
        boolean a2Current = true;
        int a3 = 0;
        int a4 = 0;
        int a4Count = 0;
        int a5 = Integer.MIN_VALUE;

        boolean a1Exist = false;
        boolean a2Exist = false;
        boolean a3Exist = false;
        boolean a4Exist = false;
        boolean a5Exist = false;

        for(int i = 0;i < count; ++i){
            if(arr[i] % 5 == 0 && arr[i] % 2 == 0){
                a1Exist = true;
                a1 += arr[i];
            }


            if(arr[i] % 5 == 1){
                a2Exist = true;
                if(a2Current){
                    a2 = a2 + arr[i];
                    a2Current = false;
                }
                else{
                    a2 = a2 - arr[i];
                    a2Current = true;
                }
            }

            if(arr[i] % 5 == 2){
                a3Exist = true;
                a3++;
            }

            if(arr[i] % 5 == 3){
                a4Exist = true;
                a4 += arr[i];
                a4Count ++;
            }

            if(arr[i] % 5 == 4 && arr[i] > a5){
                a5 = arr[i];
                a5Exist = true;
            }
        }

        System.out.print(a1Exist? a1:"N");
        System.out.print(" ");
        System.out.print(a2Exist? a2:"N");
        System.out.print(" ");
        System.out.print(a3);
        System.out.print(" ");
        System.out.print(a4Exist? Math.round(a4*10.0/a4Count)/10.0:"N");
        System.out.print(" ");
        System.out.print(a5Exist? a5:"N");


    }

}
