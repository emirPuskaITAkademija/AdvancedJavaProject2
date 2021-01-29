package four;

import three.collection.person.Person;
import three.collection.person.PersonDao;

import java.util.List;

/**
 * Ovo je komentar koji vi nemate.
 * <p>Ne možete ni imati jer nisam ga ni commit & pushao</p>
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
