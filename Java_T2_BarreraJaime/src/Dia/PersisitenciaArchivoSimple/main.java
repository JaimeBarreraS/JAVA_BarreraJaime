package Dia.PersisitenciaArchivoSimple;

/**
 *
 * @author Jaime Barrera
 */
public class main {
    public static void main(String[] args) {
        PersistenciaFile.guardarDatos("T2 es el mejor grupo de Campuslands");
        PersistenciaFile.leerDatos();
    }
}
