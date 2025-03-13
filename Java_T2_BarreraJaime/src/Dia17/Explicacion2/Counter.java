package Dia17.Explicacion2;

/**
 *
 * @author Jaime Barrera
 */
public class Counter extends Thread{
    private int c=0;
    public synchronized void increment(){c++;}
    public synchronized void decrement(){c--;}
    public synchronized int value(){return c;}

    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            increment();
            decrement();
        }
        
    }
}
