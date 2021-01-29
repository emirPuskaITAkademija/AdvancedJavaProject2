package one.generics;

public class Box<T> {
    private T polje;

    public Box(T field){
        polje = field;
    }

    public void setPolje(T polje) {
        this.polje = polje;
    }

    public T getPolje() {
        return polje;
    }
}
