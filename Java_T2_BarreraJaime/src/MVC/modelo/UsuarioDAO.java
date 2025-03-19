package MVC.modelo;

/**
 *
 * @author Jaime Barrera
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    private Conexion conexion = new Conexion();
    
    public List<Usuario> listar() {
        String sql = "select * from usuarios";
        List<Usuario> datos = new ArrayList<>();
        try (
                Connection conexionInterna = conexion.conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery();) {
            while (resultado.next()) {
                Usuario p=new Usuario();
                p.setId(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setEmail(resultado.getString(3));
                datos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }
}

