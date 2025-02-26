package Dia7.Ejercicio1;

/**
 *
 * @author Jaime Barrera
 */
public class Motocicleta extends Vehiculo {
    private String tipoManubrio;

    public Motocicleta() {}
    
   
    public Motocicleta(String marca) {
        super(marca);
    }
    
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public Motocicleta(String tipoManubrio,String marca, String modelo ) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de manubrio: " + tipoManubrio);
    }
}
