package Dia6;

/**
 *
 * @author Jaime Barrera
 */

public class InventarioTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001", "Laptop", 10, 1500);
        Producto p2 = new Producto("P002", "Mouse", 20, 25);
        
        p1.actualizarStock(-3);
        p2.actualizarStock(5);
        
        System.out.println("Stock final de Laptop: " + p1.getCantidad());
        System.out.println("Stock final de Mouse: " + p2.getCantidad());
    }
}