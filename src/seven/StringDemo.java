package seven;

public class StringDemo {

    public static void main(String[] args) {

        int number = 23;
        String name = "Amila";//String literal
        String name1 = new String("Amila");//konstruktor
        String name2 = "Amila";
        System.out.println(name == name1);//false
        System.out.println(name == name2);//true
        System.out.println();
        System.out.println(name.equals(name1));//true
        System.out.println(name.equals(name2));//true
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
    }
}
