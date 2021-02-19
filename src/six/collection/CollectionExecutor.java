package six.collection;

import three.collection.person.Gender;
import three.collection.person.Person;
import three.collection.person.PersonDao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Iterator vs Spliterator
 * <p>Funkctionalni interfejs</p>
 * <li>1. Predicate<T>  ->boolean test(T element)</li>
 * <li>2. Consumer<T> ->   void accept(T element)</li>
 * <li>3. Supplier<T> ->  T get()     </li>
 * <li>4. Function<T,R>->  R  apply(T element)    </li>
 */
public class CollectionExecutor {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retrieveAll();
        //printPersons(personList);
        //LAMBDA operator    ->     new   ...funkcionalnih interfejsa
        //printPersonCollection(personList, p->true);
        //printPersonsWithGender(personList, Gender.MALE);
        //printPersonCollection(personList, p->p.getGender().equals(Gender.FEMALE));
        //printPersonsOlderThan(personList, 18);
       // processPersonCollection(personList, person -> person.getGender().equals(Gender.FEMALE), person -> System.out.println(person));
        //printPersonsYounger(personList, 18);
        //printPersonsWithAge(personList, 18);
        //printPersonsWithingAges(personList, 30, 40);
        //Stream -> Spliterator
        //1. izvor stream -> personList.stream() Stream
        //2. funkcije koje ti ponovno vracaju stream nakon sto ucine nesto sa tim streamom
        //3. funkciju koja ti ne vrati stream objekat -> terminirajuću funkciju
         personList
                 .stream() // 1. izvor stream
                .filter(p->p.getGender().equals(Gender.FEMALE))//2. Intermediate operation
                .forEach(p-> System.out.println(p));//3. Terminirate operation
        //personList.forEach(p-> System.out.println(p));

        Person person = new Person().setSurname("Zirojevic").setName("Mitar").setBirthday(LocalDate.now());

    }

    //ITerator
    static void processPersonCollection(Collection<Person> persons, Predicate<Person> tester, Consumer<Person> consumer){
        for(Person person :persons){
            if(tester.test(person)){
                consumer.accept(person);
            }
        }
    }
/*
    static void printPersonCollection(Collection<Person> personCollection, Predicate<Person> personTester){
        for(Person person: personCollection){
            if(personTester.test(person)){
                System.out.println(person);
            }
        }
    }

    //printam, .... ne znam
    static void printPersonsWithingAges(Collection<Person> personCollection, int low, int high) {
        for (Person person : personCollection) {
            if (person.getAge()>=low && person.getAge()<=high) {
                System.out.println(person);
            }
        }
    }
    static void printPersonsWithAge(Collection<Person> personCollection, int age) {
        for (Person person : personCollection) {
            if (person.getAge() ==age) {
                System.out.println(person);
            }
        }
    }
    static void printPersonsYounger(Collection<Person> personCollection, int age) {
        for (Person person : personCollection) {
            if (person.getAge() <age) {
                System.out.println(person);
            }
        }
    }
    static void printPersonsOlderThan(Collection<Person> personCollection, int age) {
        for (Person person : personCollection) {
            if (person.getAge() > age) {
                System.out.println(person);
            }
        }
    }

    static void printPersons(Collection<Person> personCollection) {
        for (Person person : personCollection) {
            System.out.println(person);
        }
    }

    static void printPersonsWithGender(Collection<Person> personCollection, Gender spol) {
        for (Person person : personCollection) {
            if (person.getGender().equals(spol)) {
                System.out.println(person);
            }
        }
    }

*/
}
