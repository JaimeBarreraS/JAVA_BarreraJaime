package Hospital;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jaime Barrera
 */
public class Operaciones extends Empleados {
    boolean esDoctor;

    public Operaciones(boolean esDoctor, LocalDate fechaVinculacion, float salario, Departamento departamento, int id, String titulo, String primerNombre, String segundoNombre, String apellido, String direccion, List<Hospital> hospitalesAsociados) {
        super(fechaVinculacion, salario, departamento, id, titulo, primerNombre, segundoNombre, apellido, direccion, hospitalesAsociados);
        this.esDoctor = esDoctor;
    }

    

    @Override
    public String toString() {
        return "Operaciones = " + NombreCompleto() + ", Cargo: " + (esDoctor ? "Doctor" : "Enfermero") +", Departamento: " + departamento.nombre;
    }
}
