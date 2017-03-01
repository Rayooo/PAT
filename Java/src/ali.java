/**
 * Created by Ray on 2017/3/1.
 */
import java.util.*;
import java.math.*;


public class ali {

    private static boolean testDivide(int[] A, BigInteger sum){
        BigInteger tmpSum = BigInteger.ZERO;
        int count = 0;

        for(int i = 0;i < A.length; ++i){
            tmpSum = tmpSum.add(new BigInteger(String.valueOf(A[i])));
            if(tmpSum.equals(sum)){
                count++;
                i++;
                tmpSum = BigInteger.ZERO;
            }
            else if(tmpSum.compareTo(sum) > 0){
                return false;
            }

            if(count == 4 && i < A.length){
                return false;
            }
        }
        return count == 4;
    }


    private static boolean resolve(int[] A) {
        BigInteger[] sumA = new BigInteger[A.length];
        BigInteger[] sumB = new BigInteger[A.length];
        sumA[0] = new BigInteger(String.valueOf(A[0]));
        for(int i = 1;i < A.length; ++i){
            sumA[i] = sumA[i-1].add(new BigInteger(String.valueOf(A[i])));
        }

        sumB[A.length-1] = new BigInteger(String.valueOf(A[A.length-1]));
        for(int i = A.length-2;i>=0;--i){
            sumB[i] = sumB[i+1].add(new BigInteger(String.valueOf(A[i])));
        }

        for(int i = 0;i < sumA.length;++i){
            for(int j = sumB.length-1;j >= 0;--j){
                if(sumA[i].equals(sumB[j])){

                    if(testDivide(A, sumA[i])){
                        return true;
                    }
                }
                if(sumA[i].compareTo(sumB[i]) < 0){
                    break;
                }
            }


        }

        return false;

    }

    public static void main(String[] args){
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while(line != null && !line.isEmpty()) {
            int value = Integer.parseInt(line.trim());
            if(value == 0) break;
            inputs.add(value);
            line = in.nextLine();
        }
        int[] A = new int[inputs.size()];
        for(int i=0; i<inputs.size(); i++) {
            A[i] = inputs.get(i).intValue();
        }
        Boolean res = resolve(A);

        System.out.println(String.valueOf(res));
    }
}