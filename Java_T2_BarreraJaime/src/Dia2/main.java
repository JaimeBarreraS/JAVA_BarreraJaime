package Dia2;

import java.util.ArrayList;
/**
 *
 * @author Jaime Barrera
 */
public class main {
    /** 
     P.O.O: es un paradigma de programación que parte del concepto de “objetos” 
     * como base, conteniendo información en forma de campos y código en forma de método.
     */
    public static void main(String[] args) {
        Carro carrito1 = new Carro();
        Carro carrito2 = new Carro("Audi","A4",2010);
        
        Carro carrito3 = new Carro("Toyota","Tundra",2025,"Diesel",1000,5,4,5,1000,"Petrol Black",5);
        System.out.println(carrito1);
        System.out.println(carrito2);
        System.out.println(carrito3);
        
        ArrayList<Carro> listaCarro = new ArrayList<>();
        
        System.out.println(listaCarro);
        listaCarro.add(carrito1);
        listaCarro.add(carrito2);
        listaCarro.add(carrito3);
        // [carrito1][carrito2][carrito3]
        System.out.println(listaCarro);
        System.out.println(listaCarro.get(2));
        Carro carroTemporal= new Carro();
        carroTemporal=listaCarro.get(2);
        System.out.println("\n");
        System.out.println(carroTemporal.marca);
        for (int i = 0; i < listaCarro.size(); i++) {
            System.out.println(listaCarro.get(i).marca);
            
        }
    }
}

