package five;

import three.collection.person.Person;
import three.collection.person.PersonDao;

/**
 * Proces -> vlastitu memoriju, vlastito izvršno okruženje7
 * <p>MAIN thread</p>
 */
public class Executor {

    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        //retrieveAll
        //retrieve(id)
        Person amila = personDao.retrieve(1);//id = 1
        System.out.println(amila);
        String amilinoPrezime = "Hasovic-Hasic";
        amila.setSurname(amilinoPrezime);
        //personDao.update(amila);
    }
}
