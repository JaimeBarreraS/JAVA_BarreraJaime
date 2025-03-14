package Dia.PersistenciaArchivoObjeto;

/**
 *
 * @author Jaime Barrera
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/crud_personas";
    private static final String USUARIO = "root"; // Cambia si tienes otro usuario
    private static final String CONTRASEÑA = "campus2023";  // Cambia si tienes una contraseña

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}

