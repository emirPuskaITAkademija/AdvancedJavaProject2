package seven.thread;

import java.util.Arrays;
import java.util.List;

//COMPUTAIONAL INTENSIVE
public class Sample {

    public static final int MAX = 25000;

    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 34.34, 343.12, 32.23, 434.2, 34.6);

        System.out.println("Jezgri procesora: "+Runtime.getRuntime().availableProcessors());

        long currentTimeInMiliseconds = System.currentTimeMillis();
        //POČETNA TAČKA
        double result = numbers.parallelStream()
                .map(Sample::compute)
                .reduce(0.0, (x1, x2)->x1+x2);
        System.out.println(result);
        //KRAJNJA TAČKA
        long time = System.currentTimeMillis()-currentTimeInMiliseconds;
        long seconds = time/1000;
        System.out.println("Trebalo mu je : " + seconds+" sekundi da završi posao compute");
    }

    static double compute(double value){
        System.out.println("Thread se zove: " + Thread.currentThread().getName());
        double suma = 0;
        for(int i = 0; i<MAX; i++){
            for(int j = 0; j<MAX; j++){
                suma = suma + Math.sqrt(i*j);
            }
        }

        return value+suma;
    }
}
