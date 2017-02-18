import java.util.*;

/**
 * Created by Ray on 2017/2/6.
 *
 * 1002  A+B for Polynomials
 *

 2
 1 2.4 0 3.2
 2
 2 1.5 1 0.5

 *
 */
public class Polynomials {
    public static void main(String[] args){
        TreeMap<Integer, Double> map = new TreeMap<Integer, Double>();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a-- > 0){
            int exponents = scanner.nextInt();
            double coefficients = scanner.nextDouble();

            map.put(exponents,coefficients);
        }

        int b = scanner.nextInt();
        while (b-- > 0){
            int exponents = scanner.nextInt();
            double coefficients = scanner.nextDouble();

            if(map.get(exponents) == null){
                map.put(exponents,coefficients);
            }
            else {
                double result = map.get(exponents)+coefficients;
                map.put(exponents,result);
            }
        }


        int count = 0;

        NavigableMap<Integer,Double> nmap = map.descendingMap();
        Iterator iterator = nmap.entrySet().iterator();
        while (iterator.hasNext()){
            NavigableMap.Entry e = (NavigableMap.Entry) iterator.next();
            if(((Double)e.getValue()).intValue()  != 0){
                count ++;
            }
        }
        System.out.print(count + " ");

        iterator = nmap.entrySet().iterator();
        while (iterator.hasNext()){
            NavigableMap.Entry e = (NavigableMap.Entry) iterator.next();

            if(((Double)e.getValue()).intValue()  != 0){
                System.out.print(e.getKey() + " " + ((Double)((Double)e.getValue()*10)).intValue()/10.0);

                if(--count > 0){
                    System.out.print(" ");
                }
            }

        }



    }


}
