package Dia7.Ejercicio2;

/**
 *
 * @author Jaime Barrera
 */
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    
    public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularBonificacion() {
        double porcentaje = (horasTrabajadas > 160) ? 0.15 : 0.10;
        return getSalario() * porcentaje;
    }
}
