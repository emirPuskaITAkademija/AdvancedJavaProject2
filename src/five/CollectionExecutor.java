package five;

import three.collection.person.Gender;
import three.collection.person.Person;
import three.collection.person.PersonDao;

import javax.swing.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * <li>1. Predicate<T>   T element    boolean</li>
 * <li>2. Consumer<T>  T element  void </li>
 * <li>3. Supplier<T>   ()       T element</></li>
 * <li>4. Function<T, R>  transformer    T element     R returnElement</li>
 */
public class CollectionExecutor {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> listOfPersons = personDao.retrieveAll();
        printPersons(listOfPersons);
        //Anonymous inner type
        PersonChecker personChecker =p->p.getName().equals("Amila");
        boolean pcrTest =  personChecker.test(listOfPersons.get(0));


        List<Integer> brojevi = Arrays.asList(23, 34, 45, 45, 56, 67, 78, 79, 9, 9);
        int sum = 0;
        for(Integer broj: brojevi){
            sum = sum+broj;
        }
        System.out.println("Suma: " + sum);
        int sum1 = brojevi.stream().reduce(0, (n1, n2)->n1+n2);
        System.out.println("Suma: " + sum1);






    }

    //Iterator vs Spliterator
    /*
       <li>1. Izvor stream -> objekata Person -> stream()  -> Stream<Person>
       <li>2. Međuoperacijama Intermediate operations
       <li>3. Terminirajuća operacija ili funkcija
     */
    static void printPersons(Collection<Person> collectionOfPersons){
        //STARA enhanced for loop
       /* for(Person person: collectionOfPersons){
            if(person.getGender().equals(Gender.FEMALE)){
                System.out.println(person);
            }
        }*/
        //1.8  Spliterator
        //Consumer<Person> personConsumer = person -> System.out.println(person);
        Predicate<Person> personGenderTest = p -> p.getGender().equals(Gender.FEMALE);

        Stream<Person> personStream = collectionOfPersons.stream();
        personStream =  personStream.filter(p->p.getGender().equals(Gender.FEMALE));
        // Stream žena INTERMEDIATE funkcija
        personStream.forEach(p-> System.out.println(p));// Terminirajuća funkcija



        collectionOfPersons
                .stream()
                .filter(p->p.getGender().equals(Gender.FEMALE))
                .forEach(p-> System.out.println(p));
    }
}
