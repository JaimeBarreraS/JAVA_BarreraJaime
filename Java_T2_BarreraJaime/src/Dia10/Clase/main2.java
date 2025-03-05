package Dia10.Clase;

/**
 *
 * @author Jaime Barrera
 */
public class main2 {
    static void verificarEdad(int edad){
        if (edad<18){
            throw new ArithmeticException("Acceso es denegado - Debes ser mayoria de edad.");
        }else{
            System.out.println("Acceso autorizado!!!");
        }
    }
    
    public static boolean usarEdad(int edad){
        try{
        verificarEdad(edad);
        return true;
        }
        catch(Exception e){
            System.out.println("El programa tuvo un error: "+e.getMessage());
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(usarEdad(66));
    }
    
}
