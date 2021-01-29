package one.ponavljanje;

import one.ponavljanje.animal.Cat;
import one.ponavljanje.animal.Dog;
import one.ponavljanje.animal.Hamster;

/**
 * TIpovi podataka:
 * <li>1. Prosti tipovi</li>
 * <li>2. Složeni tipovi podataka</li>
 */
public class Tester {
    public static void main(String[] args) {
        int number = 23;
        number = 13;

        int[] numbers = new int[5];//0, 1, 2, 3, 4
        numbers[0] = 23;
        numbers[1] = 13;
        //numbers[2] = "Dino";
        //OGRANIČENI -> svi

        Person dinoPerson = new Person();
        Cat dininaMacka = new Cat(23, "Tom");
        dinoPerson.setAnimal(dininaMacka);
        dinoPerson.setAge(33);
        int dininAge = dinoPerson.getAge();
        System.out.println(dininAge);
        dinoPerson.setName("Dino");
        dinoPerson.setSurname("Dinić");
        printPerson(dinoPerson);
        Person p2 = new Person();
        p2.setName("Amer");
        p2.setSurname("Amerić");
        p2.setAge(36);
        printPerson(p2);
        Person p3 = new Person();

        //s1 ->Student, Person
        Student s1 = new Student();
        s1.setName("Mitar");
        s1.setIndexNumber(1234);
        Dog dog = new Dog(234, "Bingo");
        s1.setAnimal(dog);
        printPerson(s1);

        Profesor profesor = new Profesor();
        Cat cat2 = new Cat(1, "Kitty Kat 2");
        profesor.setAnimal(cat2);
        Hamster hamster = new Hamster(321, "Hrčak");
        profesor.setAnimal(hamster);

    }

    static void printPerson(Person person) {
        System.out.println(person.getName() + " " + person.getSurname());
    }
}
