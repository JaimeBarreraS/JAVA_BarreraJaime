package Dia.PersistenciaArchivoObjeto;

/**
 *
 * @author Jaime Barrera
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDPersistencia {

    // Crear
    public static void agregarPersona(int id, String nombre, int edad) {
        String sql = "INSERT INTO personas (id, nombre, edad) VALUES (?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, nombre);
            stmt.setInt(3, edad);
            stmt.executeUpdate();
            System.out.println("Persona agregada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar persona: " + e.getMessage());
        }
    }

    // Leer
    public static void listarPersonas() {
        String sql = "SELECT * FROM personas";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getInt("edad") + " años");
            }
        } catch (SQLException e) {
            System.err.println("Error al listar personas: " + e.getMessage());
        }
    }

    // Actualizar
    public static void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        String sql = "UPDATE personas SET nombre = ?, edad = ? WHERE id = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nuevoNombre);
            stmt.setInt(2, nuevaEdad);
            stmt.setInt(3, id);
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Persona actualizada correctamente.");
            } else {
                System.out.println("No se encontró una persona con ID " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar persona: " + e.getMessage());
        }
    }

    // Eliminar
    public static void eliminarPersona(int id) {
        String sql = "DELETE FROM personas WHERE id = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Persona eliminada correctamente.");
            } else {
                System.out.println("No se encontró una persona con ID " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar persona: " + e.getMessage());
        }
    }
}
