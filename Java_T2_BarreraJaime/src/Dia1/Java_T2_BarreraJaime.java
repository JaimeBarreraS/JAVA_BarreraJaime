/*
 */
package Dia1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author Jaime Barrera
 */
public class Java_T2_BarreraJaime {

    public static void main(String[] args) {
        // creacion de datos primitivos
        String texto="Tibu";
        int num1 = 3;
        int num2 = 1;
        double num3=3.14;
        float num4=(float) 3.3;
        boolean booleanito = true;
        System.out.println(num1+num2+num3+num4+texto+booleanito);
        //Habilitar las opciones de entrada por el usuario
        Scanner maria = new Scanner(System.in);
        String textoNuevo="";
        System.out.println("Por favor ingresa tu nombre:");
        textoNuevo=maria.nextLine();
        System.out.println("Tu nombre es: "+textoNuevo);
        System.out.println("Que numerito te gusta? ");
        float numeritoFloat = maria.nextFloat();
        System.out.println("Tu numerito es: "+numeritoFloat);
        maria.close();
        // Ciclo for
        for (int i=0; i<5; i++) {
            System.out.println(i);
        }
        // Ciclo While
        while (booleanito == true) {
            System.out.println("Soy alguien verdadero!!!");
            break;
        }
        // Listas de Java
        ArrayList<String> listaNombres = new ArrayList<String>();
        //Añadir elementos a la lista 
        listaNombres.add("Zully");
        listaNombres.add("Wilmer");
        listaNombres.add("Valentina");
        listaNombres.add("Miguelito");
        
        //Si quiero insertar un dato en alguna posicion, utilizo el siguiente comando:
        listaNombres.add(0,"Camilo");
        System.out.println("listaNombres");
        
        //obtener un elemnto de la lista de acuerdo a su indice
        System.out.println("listaNombres.get(2)");
        
        //Cambiar un elemnto de acuerdo a su indice
        listaNombres.set(4,"Dieguito");
        System.out.println(listaNombres);
        
        //Para recorrer una lista Java
        for(int i=0;i<listaNombres.size();i++) {
            System.out.println(listaNombres.get(i));
        }
        
        //Eliminar un elemento de la lista
        listaNombres.remove(3);
        System.out.println(listaNombres);
    }
    
}
