package PrincipiosSOLID.Ejercicio3;

/**
 *
 * @author Jaime Barrera
 */
import java.util.List;
import java.util.stream.Collectors;

public class FiltroPorNombre implements FiltroCliente {
    private String nombre;

    public FiltroPorNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }
}

