/**
 * Created by Ray on 2017/2/23.
 * https://www.nowcoder.com/pat/5/problem/4320
 */
public class Problem4320 {

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for(int i = 3;i * i <= num; i += 2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        for(int i = 0;i < 1000;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
