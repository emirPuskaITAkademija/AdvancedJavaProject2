package one.ponavljanje.animal;

import java.util.HashMap;

public class Hamster extends  Animal{

    public Hamster(int id, String name){
        super(id, name);
        System.out.println("Kreira se hrčak...");
    }

    @Override
    public void playSound() {
        System.out.println(" HR hR hR..");
    }
}
