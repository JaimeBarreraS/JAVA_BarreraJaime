package Dia10.Clase;

/**
 *
 * @author Jaime Barrera
 */
public class trycatch {
    //Manejo de excepciones (Try-catch)
    //en java, el bloque try-catch se usa para manejar excepciones, con el 
    //fin de evitar que un error detenga abruotamente la ejecucion
    //del programa.
    public static void main(String[] args) {
        try{
            int numero1 = 10;
            int numero2 = 0;
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        }
        catch(Exception e){
            System.out.println("Error: no se te olvide que no puedes dividir por cero:" +e.getMessage());
        }finally{
            System.out.println("Fin del programa");
        }
        
    }
}
