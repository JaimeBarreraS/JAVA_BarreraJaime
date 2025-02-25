package Dia6.Clase;

/**
 *
 * @author Jaime Barrera
 */
public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    
    //Constructores
    public Persona(){}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getter y Settrer
    //Son metodos que permiten obtener o modificar atributos privados de una clase.

    //Obtener dato    
    public String getNombre(){
        return "Tu nombre es: " + nombre;
    }
    
    //Enviar dato
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    //Obtener
    public int getEdad(){
        return edad;
    }
    
    //Enviar
    public void setEdad(int edad){
        if (edad > 0) {
            this.edad = edad;
        } else{
            System.out.println("La edad no es validad. Pues debe ser mayor");
        }
    }  
}
