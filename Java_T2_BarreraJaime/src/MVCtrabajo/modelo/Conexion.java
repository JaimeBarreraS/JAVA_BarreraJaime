
package MVCtrabajo.modelo;

/**
 *
 * @author Jaime Barrera
 */

import java.sql.*; 

public class Conexion {
    private String URL = "jdbc:mysql://b2gnlisqmwqjairhhzd0-mysql.services.clever-cloud.com:3306/b2gnlisqmwqjairhhzd0";
    private String USUARIO = "upzrzmxomn7dslkx";
    private String PASSWORD = "zb3jcKYwUTSXWmcmrhfm";
    
    Connection conectar() throws SQLException {
       return DriverManager.getConnection(URL, USUARIO, PASSWORD); 
    }
}
