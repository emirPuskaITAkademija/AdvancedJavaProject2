package seven.thread;

import java.util.Arrays;
import java.util.List;

/**
 * <li>1. COMPUTANIONAL INTENSIVE CPU intensive</li>
 *
 * <li>2. IO intensive</li>
 */
public class StreamExecutor {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 32, 434, 34);
        int sum = 0;
        for(Integer number: numbers){
            sum = sum + number;
            System.out.println("Koji Thread sad radi operaciju + ?");
            System.out.println(Thread.currentThread().getName());
            System.out.println();
        }
        System.out.println("Suma = " + sum);
        //****
        int suma1 =  numbers
                .stream().parallel()
                .reduce(0, (x1, x2)->sum(x1, x2));
        System.out.println("Suma1 = " + suma1);
    }

    static int sum(int x1, int x2){
        int result = x1+x2;
        System.out.println("Thread name: " + Thread.currentThread().getName()+" da vraća rezultat operacije: " + x1+" + "+ x2+" = " +result);
        return result;
    }
}
