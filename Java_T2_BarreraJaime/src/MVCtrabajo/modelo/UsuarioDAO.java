package MVCtrabajo.modelo;

/**
 *
 * @author Jaime Barrera
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    private Conexion conexion = new Conexion();
    
    
    //LISTAR USUARIOS
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
    
    
    //AGREGAR DATOS
    public void insertUsuario(String nombre, String email) {
        String sql = "insert into usuarios (nombre,email) values (?,?)";
        try (
                Connection conexionInterna = conexion.conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
                solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            solicitud.executeUpdate();
            System.out.println("Usuario agregado correctamente.");   
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }   
    }
    
    
}

