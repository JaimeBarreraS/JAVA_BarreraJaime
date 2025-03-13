package Dia16;

/**
 *
 * @author Jaime Barrera
 */
public class NewClass implements Runnable {

    private static final int META = 100;
    private static final int NUM_CORREDORES = 5;
    private String nombre;


    @Override
    public void run() {
        for (int i = 0; i <= META; i += 10) {
            System.out.println(nombre + " va en el paso " + i);
            try {
                // Simula el tiempo que tarda el corredor en avanzar
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " ha cruzado la línea de meta!");
    }

    public static void main(String[] args) {
        Thread[] corredores = new Thread[NUM_CORREDORES];

        for (int i = 0; i < NUM_CORREDORES; i++) {
            corredores[i] = new Thread(new Carrera("Corredor " + (i + 1)));
            corredores[i].start();
        }

        // Espera a que todos los corredores crucen la meta antes de continuar
        for (Thread corredor : corredores) {
            try {
                corredor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("La carrera ha terminado!");
    }
}
