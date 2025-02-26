package Dia7.Ejercicio1;

/**
 *
 * @author Jaime Barrera
 */
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(4,"Toyota", "Corolla");
        Motocicleta moto = new Motocicleta("Deportivo","Yamaha", "R3");
        
        coche.mostrarDetalles();
        System.out.println();
        moto.mostrarDetalles();
    }
}
