package three.collection;

import java.util.*;

public class Executor {
    public static void main(String[] args) {
        //NIZ
        String[] names = new String[4];
        names[0] = "Mitar";
        names[1] = "Amer";
        names[2] = "Amila";
        names[3] = "Aida";
        //ENHANCED
        for(String name: names){
         //  System.out.println(name);
        }

        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Mitar");
        listOfNames.add("Mitar");
        listOfNames.add("Mitar");
        listOfNames.add("Amer");
        listOfNames.add("Amila");
        listOfNames.add("Aida");
        listOfNames.add("Benjamin");

        printCollection(listOfNames);


        System.out.println();
        System.out.println("IDE HashSet");
        Set<String> setOfNames = new TreeSet<>(listOfNames);
        printCollection(setOfNames);
    }

    //DEPENDING upon ABSTRACTION
    static void printCollection(Collection<String> collection){
        //ENHANCED for loop
        for(String name: collection){
            System.out.println(name);
        }
    }
}
