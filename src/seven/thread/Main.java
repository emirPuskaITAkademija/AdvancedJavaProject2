package seven.thread;

public class Main extends Thread {

    static int amount = 0;
    //MAIN
    public static void main(String[] args) {
        System.out.println("Thread main: " + Thread.currentThread().getName());
        Main thread = new Main();
        thread.start();// MAIN thread pokreće Thread neki..
        while (thread.isAlive()){//Thread neki ziv ...
            System.out.println("Waiting...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    @Override
    public void run() {
        System.out.println("Thread drugi; " + Thread.currentThread().getName());
        amount++;
    }
}
