package Dia7.Ejercicio1;

/**
 *
 * @author Jaime Barrera
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche() {}
    
    public Coche(String marca) {
        super(marca);
    }
    
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Coche(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
