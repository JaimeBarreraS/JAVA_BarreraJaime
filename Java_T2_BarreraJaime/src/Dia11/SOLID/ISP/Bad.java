package Dia11.SOLID.ISP;

/**
 *
 * @author Jaime Barrera
 */
public class Bad { 
    // Violacion Principio de Segregacion de Interfases (ISP) - Principio de Segregación
    // Las interfases deben ser especificas y no forzar a una clase a implementar métodos que no necesita.
    interface Worker { // Interface Worker
        void work(); // Metodo work
        void eat(); // Metodo eat
    }

    class Robot implements Worker { // Clase Robot implementa Worker
        public void work() { // Metodo work
            System.out.println("Trabajando...");
        }

        public void eat() { // Metodo eat
            throw new UnsupportedOperationException("Un robot no come!"); // Excepcion
        }
    }
}
