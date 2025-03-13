package Dia17.Explicacion3;

/**
 *
 * @author Jaime Barrera
 */
public class main {
    public static void main(String[] args) {
        PingPongSincronizado t1 = new PingPongSincronizado("P");
        PingPongSincronizado t2 = new PingPongSincronizado("S");
        PingPongSincronizado t3 = new PingPongSincronizado("A");
        PingPongSincronizado t4 = new PingPongSincronizado("B");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        
    }
}
