package Dia6.Clase;

import Dia6.Clase.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Jaime Barrera
 */
public class Encapsulamiento {
    
    //ENCAPSULAMIENTO
    //Se refiere a la restriccion del acceso algunos de los componentes de un objeto
    //especialmente a los atributos, con el fin de prevenir modificaciones no autorizadas.
    
    public static void main(String[] args) {
        
        Persona p1= new Persona();
        
        Scanner sc = new Scanner (System.in);
        
        p1.setNombre("Alejandra");
        p1.setEdad(21);
        
        System.out.println(p1.getNombre());
        
        CuentaBancaria c1 = new CuentaBancaria("AVHWEB284624BF",10000000);
        
        System.out.println(c1.getSaldo());
        
        c1.depositar(2500000);
        System.out.println(c1.getSaldo());
        
        c1.retirar(9000000);
        System.out.println(c1.getSaldo());
        
    }
}
