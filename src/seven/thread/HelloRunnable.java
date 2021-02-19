package seven.thread;

import three.collection.person.Person;

//1. implementiramo Runnable
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Vozdra raja iz drugog Threada. Njegovo je ime: " + Thread.currentThread().getName());
    }
}
