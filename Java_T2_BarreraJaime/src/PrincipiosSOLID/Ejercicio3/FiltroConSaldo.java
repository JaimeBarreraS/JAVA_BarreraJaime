package PrincipiosSOLID.Ejercicio3;

/**
 *
 * @author Jaime Barrera
 */
import java.util.List;
import java.util.stream.Collectors;

public class FiltroConSaldo implements FiltroCliente {
    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getSaldo() > 0)
                .collect(Collectors.toList());
    }
}

