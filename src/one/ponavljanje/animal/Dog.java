package one.ponavljanje.animal;

public class Dog extends  Animal {


    public Dog(int id, String name){
        super(id, name);
    }

    @Override
    public void playSound() {
        System.out.println("AV AV AV");
    }
}
