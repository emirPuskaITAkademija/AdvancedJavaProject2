package four;

import three.collection.person.Person;
import three.collection.person.PersonDao;

import java.util.List;

/**
 *
 */
public class Executor {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retrieveAll();
        printPersons(personList);
    }

    static void printPersons(List<Person> personList){
        for(Person person: personList){
            System.out.println(person);
        }
    }
}
