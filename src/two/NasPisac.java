package two;

import java.io.Closeable;
import java.io.IOException;

public class NasPisac implements Closeable {

    public NasPisac() throws IOException {
        System.out.println("Kreiramo našeg pisca..");
    }

    @Override
    public void close(){
        System.out.println("POZIVA SE CLOSE metoda od našeg pisca...");
    }
}
