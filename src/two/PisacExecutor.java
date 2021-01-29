package two;

import java.io.IOException;

public class PisacExecutor {
    public static void main(String[] args) {

        //ako sve prođe smoothly samo ide try BLOK KODA bez catch
        //finally -> mene ne zanima jel prošlo smoothly ili nije ..ja se moram izvršavati
        //try-catch-finally
        //try with resource

        try(NasPisac nasPisac= new NasPisac();) {

        }catch (IOException exc){
            System.err.println(exc.getMessage());
        }
    }
}
