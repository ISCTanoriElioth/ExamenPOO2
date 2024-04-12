public class Main {
    public static void main(String[] args) {
        //Declaramos Arreglos de Hilos.
        Thread Par = new Thread(new Par(), "Hilo Par");
        Thread Impar = new Thread(new Impar(), "Hilo Impar");

        //Creamos objetos Par e Impar.
        Hiloprincipal HiloPar = new Hiloprincipal();
        Hiloprincipal hiloImpar = new Hiloprincipal();
        //Iniciamos Start().
        Par.start();
        Impar.start();

    }
}