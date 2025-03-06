package PrincipiosSOLID.Ejercicio5;

/**
 *
 * @author Jaime Barrera
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interfaz de solo lectura (Principio de Segregación de Interfaces - ISP)
interface IOadReadOnly<T> {
    List<T> getAll();
    T getById(int id);
}

// Interfaz completa de CRUD (Extiende la de solo lectura)
interface IOad<T> extends IOadReadOnly<T> {
    void insert(T entity);
    void update(int id, T entity);
    void delete(int id);
}

// Implementación de acceso a datos de solo lectura
class FacturaOadDatosReadOnly implements IOadReadOnly<String> {
    private List<String> facturas;

    public FacturaOadDatosReadOnly() {
        facturas = new ArrayList<>();
        facturas.add("Factura 1001");
        facturas.add("Factura 1002");
    }

    @Override
    public List<String> getAll() {
        return facturas;
    }

    @Override
    public String getById(int id) {
        return (id >= 0 && id < facturas.size()) ? facturas.get(id) : null;
    }
}

// Implementación CRUD completa
class FacturaOad implements IOad<String> {
    private List<String> facturas;

    public FacturaOad() {
        facturas = new ArrayList<>();
    }

    @Override
    public void insert(String entity) {
        facturas.add(entity);
    }

    @Override
    public void update(int id, String entity) {
        if (id >= 0 && id < facturas.size()) {
            facturas.set(id, entity);
        }
    }

    @Override
    public void delete(int id) {
        if (id >= 0 && id < facturas.size()) {
            facturas.remove(id);
        }
    }

    @Override
    public List<String> getAll() {
        return facturas;
    }

    @Override
    public String getById(int id) {
        return (id >= 0 && id < facturas.size()) ? facturas.get(id) : null;
    }
}

// Clase principal con menú 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FacturaOad facturaOad = new FacturaOad();
        FacturaOadDatosReadOnly facturaOadReadOnly = new FacturaOadDatosReadOnly();

        while (true) {
            System.out.println("\n MENÚ:");
            System.out.println("1. Insertar factura");
            System.out.println("2. Actualizar factura");
            System.out.println("3. Eliminar factura");
            System.out.println("4. Mostrar todas las facturas");
            System.out.println("5. Buscar factura por ID");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la nueva factura: ");
                    String nuevaFactura = scanner.nextLine();
                    facturaOad.insert(nuevaFactura);
                    System.out.println(" Factura insertada.");
                    break;

                case 2:
                    System.out.print("Ingrese el ID de la factura a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo valor de la factura: ");
                    String facturaActualizada = scanner.nextLine();
                    facturaOad.update(idActualizar, facturaActualizada);
                    System.out.println(" Factura actualizada.");
                    break;

                case 3:
                    System.out.print("Ingrese el ID de la factura a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    facturaOad.delete(idEliminar);
                    System.out.println(" Factura eliminada.");
                    break;

                case 4:
                    List<String> facturasReadOnly = facturaOadReadOnly.getAll();
                    List<String> facturasCRUD = facturaOad.getAll();
                    System.out.println("\n Facturas de solo lectura:");
                    for (String factura : facturasReadOnly) {
                        System.out.println("   " + factura);
                    }
                    System.out.println("\n Facturas creadas/modificadas:");
                    for (String factura : facturasCRUD) {
                        System.out.println("   " + factura);
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el ID de la factura a buscar: ");
                    int idBuscar = scanner.nextInt();
                    String factura = facturaOad.getById(idBuscar);
                    if (factura == null) {
                        factura = facturaOadReadOnly.getById(idBuscar);
                    }
                    System.out.println(" Factura encontrada: " + (factura != null ? factura : "No encontrada"));
                    break;

                case 6:
                    System.out.println(" Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println(" Opción inválida. Intente de nuevo.");
            }
        }
    }
}
