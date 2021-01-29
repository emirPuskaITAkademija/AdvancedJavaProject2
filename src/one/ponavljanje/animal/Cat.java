package one.ponavljanje.animal;

public class Cat extends Animal {

    public Cat(int id, String name){
        super(id, name);
        System.out.println("Dolazi mačka na svijet..");
    }

    @Override
    public void playSound() {
        System.out.println("Mjau mjau mjau");
    }
}
