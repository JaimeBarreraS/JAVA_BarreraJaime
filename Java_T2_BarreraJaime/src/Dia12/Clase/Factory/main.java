package Dia12.Clase.Factory;

/**
 *
 * @author Jaime Barrera
 */

//Este patrón define una interfaz para crear objetos, pero permite a las subclases decidir qué 
//clase concreta instanciar. Se usa para evitar la creación directa de objetos con new.

// Interfaz Producto
interface Producto {
    void usar();
}

// Implementaciones concretas
class ProductoA implements Producto {
    public void usar() {
        System.out.println("Usando Producto A");
    }
}

class ProductoB implements Producto {
    public void usar() {
        System.out.println("Usando Producto B");
    }
}

public class main {
    // Fábrica con el método Factory
    class Factory {
        public static Producto crearProducto(String tipo) {
            if (tipo.equalsIgnoreCase("A")) {
                return new ProductoA();
            } else if (tipo.equalsIgnoreCase("B")) {
                return new ProductoB();
            }
            
            
            throw new IllegalArgumentException("Tipo desconocido");
        }
    }
    
    // Uso
    public static void main(String[] args) {
        Producto p1 = Factory.crearProducto("A");
            p1.usar();
        
        Producto p2 = Factory.crearProducto("B");
            p2.usar();
    }
}

