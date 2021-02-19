package seven.reflection;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton SINGLETON = null;

    private Singleton(){
        System.out.println("Poziva se Singleton constructor....");
    }

    //koji je preduvjet poziva ??
    //Singleton s1 = new Singleton();
    // s1.getSingleton()
    public static  Singleton getSingleton(){
        //samo prvi put ulazimo u ovaj blok koda
        if(SINGLETON == null){
            SINGLETON = new Singleton();
        }
        return SINGLETON;
    }
}
