import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Ray on 2017/2/23.
 */
public class MySort {
    public static void main(String[] args){
        Integer[] array = new Integer[10];
        array[0] = ((int)(Math.random()*100+1));
        array[1] = ((int)(Math.random()*100+1));
        array[2] = ((int)(Math.random()*100+1));
        array[3] = ((int)(Math.random()*100+1));
        array[4] = ((int)(Math.random()*100+1));
        array[5] = ((int)(Math.random()*100+1));
        array[6] = ((int)(Math.random()*100+1));
        array[7] = ((int)(Math.random()*100+1));
        array[8] = ((int)(Math.random()*100+1));
        array[9] = ((int)(Math.random()*100+1));

        Arrays.sort(array, (o1, o2) -> -o1+o2);

        for(int i : array ){
            System.out.println(i);
        }


    }

}
