package one.ponavljanje;

import one.ponavljanje.animal.Animal;
import one.ponavljanje.animal.Cat;
import one.ponavljanje.animal.Dog;

import java.io.Serializable;

/**
 * <li>1. Enkapsullacija</li>
 * <li>2. Nasljeđivanje</li>
 * <li>3. Polimorfizam</li>
 * <li>4. Apstrakcije(apstraktne klase ili interfejsi )</li>
 */
public class Person implements Serializable {

    private String name;
    private String surname;
    private int age;
    //Cat -> Dog  -> Fish -> Hrcak
    private Animal animal;

    public Person(){

    }

    public void setAge(int godine){
        if(godine>=0){
            age = godine;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
