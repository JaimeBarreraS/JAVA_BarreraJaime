package MVC;

import MVC.controlador.UsuarioControlador;
import MVC.modelo.UsuarioDAO;
import MVC.vista.UsuarioVista;
import java.nio.file.attribute.UserPrincipal;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioVista usuarioVista = new UsuarioVista();
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDAO,usuarioVista);

        usuarioControlador.iniciar();
    }
}
