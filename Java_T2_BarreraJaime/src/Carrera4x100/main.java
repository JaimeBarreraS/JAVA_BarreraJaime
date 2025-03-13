package Carrera4x100;



/**
 *
 * @author Jaime Barrera
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        atleta[] atletas = new atleta[5];

        for (int i = 0; i < 5; i++) {
            atletas[i] = new atleta(i);
            atletas[i].start();
        }
        
        synchronized (atleta.testigo) {
            atleta.testigo.notifyAll();
        } 
        
        for (atleta a : atletas) {
            a.join();
        }
    }
}
