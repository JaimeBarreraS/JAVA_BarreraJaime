package Dia17.Explicacion3;

/**
 *
 * @author Jaime Barrera
 */
public class PingPongSincronizado extends Thread {
    
    private String word;
    public PingPongSincronizado(String s) {
        word=s;
    }

    public void run() {
        synchronized (getClass()) {//para entrar por aqui tenemos
            //que conseguir el bloqueo intrinseco de la clase 
            //PingPongSincronizado
            for (int i = 0; i < 5; i++) {
                System.out.println(word);
                System.out.flush();
                getClass().notifyAll();//Avisar a todos que ha terminado
                try{
                    getClass().wait();// Se espera al aviso
                }catch (InterruptedException e){}
                getClass().notifyAll();
            }           
        }
    }
}
        
