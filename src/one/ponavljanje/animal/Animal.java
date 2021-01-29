package one.ponavljanje.animal;
// polja, ()
//
public abstract class Animal {
    private int id;
    private String name;

    public Animal(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void playSound();
}
