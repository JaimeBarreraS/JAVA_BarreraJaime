package Dia11.SOLID.LSP;
/**
 *
 * @author Jaime Barrera
 */
public class Bad {
    //Liskov Substitution Principle (LSP) - Principio de Sustitucion de Liskov
    //Las clases derivadas deben poder sustituit a sus clases base sin alterar el compartamiento del programa.
    class Bird{
        public void fly(){
            System.out.println("Volando...");
        }
    }
    
    class Penguin extends Bird{
        @Override
        public void fly(){
            throw new UnsupportedOperationException("¡Los pinguinos no pueden volar!"); 
        }
    }
            
            
}
