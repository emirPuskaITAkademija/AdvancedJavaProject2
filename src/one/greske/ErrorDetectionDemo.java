package one.greske;

/**
 *
 */
public class ErrorDetectionDemo {
    public static void main(String[] args) {
        String[] names = new String[3];//0, 1, 2
        names[0] = "Aida";
        names[1] = "Armin";
        names[2] = "Dino";
        //names[3] = "Benjamin";

        int number = 43;
        int result = number /0;

    }
}
