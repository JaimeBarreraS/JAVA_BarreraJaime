package Dia7.Ejercicio2;

/**
 *
 * @author Jaime Barrera
 */
class EmpleadoFijo extends Empleado {

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }
    
    @Override
    public double calcularBonificacion() {
        return getSalario() * 0.20;
    }
}
