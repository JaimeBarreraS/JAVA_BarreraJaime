package PrincipiosSOLID.Ejercicio3;

/**
 *
 * @author Jaime Barrera
 */
import java.util.List;
import java.util.stream.Collectors;

public class FiltroPorLocalidad implements FiltroCliente {
    private Localidad localidad;

    public FiltroPorLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getLocalidad() == localidad)
                .collect(Collectors.toList());
    }
}

