package Dia7.Ejercicio2;

/**
 *
 * @author Jaime Barrera
 */
public class GestionEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoFijo("Carlos", 3000),
            new EmpleadoPorHoras("Ana", 2000, 170),
            new EmpleadoPorHoras("Luis", 1800, 150)
        };
        
        for (Empleado e : empleados) {
            e.mostrarInformacion();
        }
    }
}
