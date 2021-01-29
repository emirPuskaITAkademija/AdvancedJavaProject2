package two;

import one.ponavljanje.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * PrintWriter
 * FileWriter
 * ..ime fajla String
 * <p>
 * CHECKED EXCEPTION -> IOException
 */
public class CheckedExecutor {
    public static void main(String[] args) {
        //NIZOVA -> FIKSNA DUŽINA
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Dino");
        listOfNames.add("Armin");
        listOfNames.add("Amila");
        listOfNames.add("Mitar");
        listOfNames.add("Dino");
        listOfNames.add("Benjamin");
        listOfNames.add("Amer");
        listOfNames.add("Aida");
        listOfNames.add("Edin");
        //....


        //try-catch-finally Java SE <1.7
        //try - with - resource   koristi try-catch BEZ finally

        try (FileWriter fileWriter = new FileWriter("imena.txt");
             PrintWriter out = new PrintWriter(fileWriter);
             ) {
            for (int i = 0; i < listOfNames.size(); i++) {
                String name = listOfNames.get(i);
                System.out.println(name);
                out.println(name);
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
