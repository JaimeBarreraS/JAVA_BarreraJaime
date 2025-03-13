package Dia17.Explicacion2;
/**
 *
 * @author Jaime Barrera
 */
public class main {
    public static void main(String[] args) {
        Counter t1 = new Counter();
        Counter t2 = new Counter();
        t1.start();
        t2.start();
        
        System.out.println(t1.value());
        System.out.println(t2.value());
    }
}
