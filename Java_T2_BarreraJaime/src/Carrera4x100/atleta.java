package Carrera4x100;

/**
 *
 * @author Jaime Barrera
 */
import java.util.Random;

public class atleta extends Thread {
    private int id;
    private Random random = new Random();
    static final Object testigo = new Object();
    static int atletaActual = 1;

    public atleta(int id) {
        this.id = id;
    }

    public void run() {
        synchronized (testigo) {
            while (atletaActual != id) {
                try {
                    testigo.wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        int tiempo = 9600 + random.nextInt(2000); 
        System.out.println("Atleta " + id +" "+ tiempo / 1000.0 + " segundos");

        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Atleta " + id + " paso el testigo");

        synchronized (testigo) {
            atletaActual++;
            testigo.notifyAll();
        }
    }
}