public class Par implements Runnable {//Implementamos con Runnable.
    public void run() {//Recorremos posiciones de Pares.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Mostrando los número Pares: " + i);
        }
    }
}