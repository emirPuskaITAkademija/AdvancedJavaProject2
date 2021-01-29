package two.io;


import one.ponavljanje.Person;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

//CTRL + space
// CTRL + klik na metodu ili konstruktor ili klasu
// ALT + lijevo
// ALT + desno
//FileWriter
//PrintWriter

//FileReader
//BufferedReader
public class CopyLines {
    public static void main(String[] args) {
        // output ili writer
        // input ili reader
        try(FileReader fileReader = new FileReader("imena.txt");
            BufferedReader br  =new BufferedReader(fileReader);
            Scanner scanner = new Scanner(br)
        ){

            System.out.println("ŠALJEM SADRŽJA UČITAN IZ FAJLA");
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }
}
