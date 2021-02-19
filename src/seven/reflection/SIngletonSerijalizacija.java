package seven.reflection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SIngletonSerijalizacija {

    public static void main(String[] args) throws Exception{
        Singleton s1 = Singleton.getSingleton();
        System.out.println(s1.hashCode());
        //Serijalizacija

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("s1.ser"));
        outputStream.writeObject(s1);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s1.ser"));

         Singleton s2 = (Singleton) ois.readObject();
        System.out.println(s2.hashCode());
    }
}
