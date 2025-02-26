package Dia7.Ejercicio1;

/**
 *
 * @author Jaime Barrera
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() {}
    
    public Vehiculo(String marca) {
        this.marca = marca;
    }
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
