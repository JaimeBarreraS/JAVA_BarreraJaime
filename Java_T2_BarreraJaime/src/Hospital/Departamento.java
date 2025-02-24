package Hospital;

import java.util.List;

/**
 *
 * @author Jaime Barrera
 */
public class Departamento {
    int id;
    String nombre;
    List<Empleados> empleados;

    public Departamento(int id, String nombre, List<Empleados> empleados) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = empleados;
    }


    public void agregarEmpleado(Empleados empleado){
    empleados.add(empleado);
    }
    
    @Override
    public String toString() {
        return "Departamento = " + "ID :" + id + ", Nombre :" + nombre + ", Empleados :" + empleados.size() ;
    }
     
}
