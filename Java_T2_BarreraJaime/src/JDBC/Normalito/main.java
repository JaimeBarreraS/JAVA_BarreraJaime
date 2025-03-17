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
        
        List<String> listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (String usuario : listaUsuarios){
            System.out.println(usuario);
        }
        
        usuarioDAO.actualizarUsuario(3,"Jaime",
                "jaime.campus@gmail.com");
        listaUsuarios = usuarioDAO.obtenerUsuarios();
        System.out.println("################");
        for (String usuario : listaUsuarios){
            System.out.println(usuario);
        }
    }
}
