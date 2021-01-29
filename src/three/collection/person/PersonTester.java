package three.collection.person;

import java.util.*;
import java.util.function.Predicate;

/**
 * <li>1. Predicate<T> -> TESTER</li>
 */
public class PersonTester {
    public static void main(String[] args) {
        PersonDao  personDao = new PersonDao();
        List<Person> listaPersona = personDao.retrieveAll();
        //LAMBDA operator -> new kada kreiramo objekte tipa funkcionalnog interfejsa
        Predicate<Person> tester = p->p.getAge()>23;
        printTestedPersons(listaPersona, p->true);
        printTestedPersons(listaPersona, p->p.getAge()>=23);
        printTestedPersons(listaPersona, p->p.getAge()<23);
        printTestedPersons(listaPersona, p->p.getSurname().equals("Hadžić"));

    }

    static void printTestedPersons(Collection<Person> collectionOfPersons, Predicate<Person> tester){
        for(Person person: collectionOfPersons){
            if(tester.test(person)){
                System.out.println(person);
            }
        }
    }
/*
    static void printPersons(Collection<Person> collectionOfPersons){
        for(Person person : collectionOfPersons){
            System.out.println(person);
        }
    }

    static void printOlderThan(Collection<Person> collectionOfPersons, int age){
        for(Person person : collectionOfPersons){
            if(person.getAge()>=age){
                System.out.println(person);
            }
        }
    }
    static void printYoungerThan(Collection<Person> collectionOfPersons, int age){
        for(Person person : collectionOfPersons){
            if(person.getAge()<age){
                System.out.println(person);
            }
        }
    }*/

}
