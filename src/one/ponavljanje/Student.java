package one.ponavljanje;


import one.ponavljanje.animal.Cat;

public class Student  extends Person {
    private int indexNumber;


    public Student(){
        System.out.println("Kreiram studenta...");
    }
    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }


}
