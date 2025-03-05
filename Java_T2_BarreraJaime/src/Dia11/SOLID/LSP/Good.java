package Dia11.SOLID.LSP;

/**
 *
 * @author Jaime Barrera
 */
abstract class Bird{}
public class Good {
    class FlyingBird extends Bird {
        public void fly(){
            System.out.println("Volando...");
        }
    }
    
    class Penguin extends Bird {
        public void swim(){
            System.out.println("Nadando..");
        }
    }
    
}
