package five;

import three.collection.person.Gender;
import three.collection.person.Person;
import three.collection.person.PersonDao;

import java.io.PrintStream;
import java.util.List;

/**
 * ->  kao shortcut za new ---- kada kreiramo objekte tipa funkctionalnog interfejsa
 * ::   kada lambda ne radi ništa drugo nego samo poziva drugu
 * funkciju mi cemo se samo referencirati na tu funkciju
 *  ->     :: (method referencing)
 */
public class LambdaExecutor {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retrieveAll();
       /* personList.stream()
                .filter(p->p.getGender().equals(Gender.MALE))
                //Stream<Person>
                .map(p->p.getSurname())
                //Stream<String>
                .forEach(it->printString(it));*/
       for(Person it : personList){
           System.out.println(it);
       }
       personList.forEach(it ->printPerson(it));
       personList.forEach(LambdaExecutor::printPerson);//STATIC method

        PrintStream consoleOutput = System.out;
       personList.stream()
               .map(Person::getSurname)
               .forEach(consoleOutput::println);//INSTANCE method referenciranje


    }

    static void printString(String name){
        System.out.println(name);
    }

    static void printPerson(Person person){
        System.out.println(person);
    }
}
