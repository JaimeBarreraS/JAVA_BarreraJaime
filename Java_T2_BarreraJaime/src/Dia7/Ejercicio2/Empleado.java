package Dia7.Ejercicio2;

/**
 *
 * @author Jaime Barrera
 */
public class Empleado {
    private String nombre;
    private double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public double calcularBonificacion() {
        return 0;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario + ", Bonificación: " + calcularBonificacion());
    }
}
