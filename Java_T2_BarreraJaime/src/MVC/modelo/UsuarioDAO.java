package MVC.modelo;

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

    // Insertar usuario
    public void insertar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obtener todos los usuarios
    public List<Usuario> obtenerTodos() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("email")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Actualizar usuario
    public void actualizar(Usuario usuario) {
        String sql = "UPDATE usuarios SET nombre = ?, email = ? WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.setInt(3, usuario.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar usuario
    public void eliminar(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
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
