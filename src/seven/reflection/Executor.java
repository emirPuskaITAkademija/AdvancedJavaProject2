package seven.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Executor {

    public Executor(){
        System.out.println("Konstruktor Executor klase..");
    }
    public static void main(String[] args) throws Exception{
        //kolko hoćemo ...
        Book book = new Book();
        Class andeoBook = Book.class;
        Book b2 = new Book();
        Class andeoB2 = Book.class;
        System.out.println(andeoB2.hashCode());
        System.out.println(andeoBook.hashCode());
        //
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        //Refleksija  čija je on refleksija ----> s   anđeoČuvar
        Class anđeoČuvar = Singleton.class;
        Constructor<Singleton> konstruktor = anđeoČuvar.getDeclaredConstructor();
        Method method;
        Field field;
        konstruktor.setAccessible(true);
        Singleton nijeSingletonObjekat = (Singleton) konstruktor.newInstance();
        System.out.println(nijeSingletonObjekat.hashCode());
    }
}
