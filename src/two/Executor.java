package two;

import one.ponavljanje.Person;

import java.lang.reflect.Array;
import java.util.Optional;

/**
 * LOše stvari se dese:
 * <li>1. pokušamo pristupiti elementu u nizu koji ne postoji</li>
 *
 * <p>
 *     Vrste izuzetaka ili grešaka:
 *     <li>1. Runtime Exceptions</li>
 *     ArrayIndexOutOfBoundsException
 *     ArithmeticException
 *     NullPointerException
 *
 *     ...throws Exception -> RuntimeException.....
 * </p>
 */
public class Executor {
    public static void main(String[] args) {
        //deklaraciju tipa new
        // 8 polja niza
        // 0, 1, ..7
        String[] names = new String[8];
        names[0] = "Dino";
        names[1] = "Armin";
        names[2] = "Amila";
        names[3] = "Mitar";
        names[4] = "Dino";
        names[5] = "Benjamin";
        names[6] = "Amer";
        names[7] = "Aida";
        names[8] = "Emir";// pristupam elementu u nizu koji ne psotoji
        int number = 23;
        //int result = number/0; // dijeljenje RuntimeException
        System.out.println("Vozdra raja,...konačno petak");
        Person person = new Person();
        person.setName("Mitar");
        String name = person.getName();//NPE NullPointExcpetion
        System.out.println(name);
    }
}
