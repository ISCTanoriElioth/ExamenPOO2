public class Impar implements Runnable {
    public static void start() {
    }//Implementamos Runnable.
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Mostrando los números Impares: " + i);
            }
        }
    }
}

