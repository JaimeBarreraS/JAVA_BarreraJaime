package PrincipiosSOLID.Ejercicio3;

/*import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class Ej3Test {

    @Test
    public void test() {
        
        Cliente clienteA = new Cliente();
        clienteA.nombre = "A";
        clienteA.localidad = Localidad.BAHIA_BLANCA;
        clienteA.saldo = 100;
        
        Cliente clienteB = new Cliente();
        clienteB.nombre = "B";
        clienteB.localidad = Localidad.NONE;
        clienteB.saldo = 0;
        
        Cliente clienteC = new Cliente();
        clienteC.nombre = "C";
        clienteC.localidad = Localidad.TRES_ARROYOS;
        clienteC.saldo = 200;

        LogicaClientes logicaClientes = new LogicaClientes();
        logicaClientes.getClientes().add(clienteA);
        logicaClientes.getClientes().add(clienteB);
        logicaClientes.getClientes().add(clienteC);
        
        // Filtrar por localidad BAHIA_BLANCA
        List<Cliente> clientesBB = logicaClientes.filtrarClientes(new FiltroPorLocalidad(Localidad.BAHIA_BLANCA));
        assertEquals(1, clientesBB.size());
        assertEquals("A", clientesBB.get(0).nombre);
        
        // Filtrar por nombre "B"
        List<Cliente> clientesB = logicaClientes.filtrarClientes(new FiltroPorNombre("B"));
        assertEquals(1, clientesB.size());
        assertEquals("B", clientesB.get(0).nombre);
        
        // Filtrar clientes con saldo positivo
        List<Cliente> clientesSaldo = logicaClientes.filtrarClientes(new FiltroConSaldo());
        assertEquals(2, clientesSaldo.size());
        assertEquals("A", clientesSaldo.get(0).nombre);
        assertEquals("C", clientesSaldo.get(1).nombre);
    }
}*/

