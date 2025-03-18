package JDBC.Normalito;

/**
 *
 * @author Jaime Barrera
 */
import JDBC.Normalito.UsuarioDAO;
import java.util.List;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        /*usuarioDAO.insertUsuario("Pedrito",
                "pedrogomez.campus@gmail.com");
        usuarioDAO.insertUsuario("Valentina",
                "valentina.campus@gmail.com");
        usuarioDAO.insertUsuario("Zully",
                "Zully.campus@gmail.com");*/
        
        
        //Leer
        List<String> listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (String usuario : listaUsuarios){
            System.out.println(usuario);
        }
        
        // Actualizar
        usuarioDAO.actualizarUsuario(3,"Jaime",
                "jaime.campus@gmail.com");
        listaUsuarios = usuarioDAO.obtenerUsuarios();
        System.out.println("################");
        for (String usuario : listaUsuarios){
            System.out.println(usuario);
        }
        
        // Eliminar 
        usuarioDAO.eliminarUsuario(3);

        listaUsuarios = usuarioDAO.obtenerUsuarios();
        System.out.println("################");
        for (String usuario : listaUsuarios){
            System.out.println(usuario);
        }
   

        // Buscar usuario por ID
        int idBuscado = 2; // Puedes cambiar este valor para probar
        String usuarioEncontrado = usuarioDAO.buscarUsuarioPorId(idBuscado);
        System.out.println(usuarioEncontrado);
    }
}
