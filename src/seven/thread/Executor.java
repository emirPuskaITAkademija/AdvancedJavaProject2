package seven.thread;

public class Executor {

    public static void main(String[] args) {
        System.out.println("Vozdra kaže : " + Thread.currentThread().getName());
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread noviThread = new Thread(helloRunnable);
        System.out.println("Prije poziva run funkcije...");
        noviThread.start();//on pozove run  metodu

        new HelloThread().start();

    }
}
