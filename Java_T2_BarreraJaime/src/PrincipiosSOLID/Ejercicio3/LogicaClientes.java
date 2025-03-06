package PrincipiosSOLID.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class LogicaClientes {
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Cliente> filtrarClientes(FiltroCliente filtro) {
        return filtro.filtrar(clientes);
    }
}

