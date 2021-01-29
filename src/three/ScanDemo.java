package three;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) {
        File file = new File("imena.txt");
        String variable = "imena.txt";
        try (Scanner scanner = new Scanner(variable);) {
            scanner.useLocale(Locale.US);
            while (scanner.hasNext()){
                double number  =scanner.nextDouble();

                System.out.println(number);
            }
        }
    }
}
