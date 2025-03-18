package JDBC.Normalito;

/**
 *
 * @author Jaime Barrera
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
        
public class UsuarioDAO {
    private String URL = "jdbc:mysql://b2gnlisqmwqjairhhzd0-mysql.services.clever-cloud.com:3306/b2gnlisqmwqjairhhzd0";
    private String USUARIO = "upzrzmxomn7dslkx";
    private String PASSWORD = "zb3jcKYwUTSXWmcmrhfm";
    
    private Connection conectar() throws SQLException {
       return DriverManager.getConnection(URL, USUARIO, PASSWORD); 
    }
    
    
    public void insertUsuario(String nombre, String email) {
        String sql = "insert into usuarios (nombre,email) values (?,?)";
        try (
                Connection conexionInterna = conectar();
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
    
    public List<String> obtenerUsuarios() {
        String sql = "select * from usuarios";
        List<String> listaUsuarios = new ArrayList<>();
        try (
                Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery();) {
            while (resultado.next()) {
                listaUsuarios.add(resultado.getInt("id") + 
                        " - " + resultado.getString("nombre") + " - " + 
                        resultado.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  listaUsuarios;
    }
    
    // Actualizar
    public void actualizarUsuario(int id, String nombre,String email){
    String sql = "update usuarios set nombre=?, email=? where id= ?";
    try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
        //Asignando valores a las incógnitas
        solicitud.setString(1, nombre);
        solicitud.setString(2, email);
        solicitud.setInt(3, id);
        //Ejecución de la solicitud
        int filas = solicitud.executeUpdate();
        if(filas > 0){
            System.out.println("Usuario actualizado exitosamente!");
        }else{
            System.out.println("No se pudo actualizar el usuario con ID "+id);
        }
    }
    catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
    // Eliminar
    public void eliminarUsuario(int id) {
        String sql = "delete from usuarios where id = ?";
        try (
                Connection conexionInterna = conectar();
             PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            solicitud.setInt(1, id);
            int filas = solicitud.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario eliminada correctamente.");
            } else {
                System.out.println("No se pudo eliminar el usuario con ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String buscarUsuarioPorId(int id) {
    String sql = "select * from usuarios where id = ?";
    try (
        Connection conexionInterna = conectar();
        PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
        
        solicitud.setInt(1, id);
        ResultSet resultado = solicitud.executeQuery();

        if (resultado.next()) {
            return resultado.getInt("id") + " - " +
                   resultado.getString("nombre") + " - " +
                   resultado.getString("email");
        } else {
            return "No se encontró ningún usuario con ID " + id;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return "Error al buscar el usuario.";
    }
}
}
    
