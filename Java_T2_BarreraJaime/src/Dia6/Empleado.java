package Dia6;

/**
 *
 * @author Jaime Barrera
 */
public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    //Getter y Setters
    
    //Getter nombre
    public String getNombre() {
        return nombre;
    }
    
    //Setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter id
    public int getId() {
        return id;
    }

    //Getter Salario
    public double getSalario() {
        return salario;
    }
    
    //Setter Salario
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;    
        }else{
            System.out.println("El salario no puede ser negativo");
        }
    }
    
    
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", ID: " + id + ", Salario: " + salario);
    }
}
