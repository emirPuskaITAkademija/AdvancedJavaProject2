package seven.thread;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Vozdra raja iz trećeg Threada: " + Thread.currentThread().getName());
    }
}
