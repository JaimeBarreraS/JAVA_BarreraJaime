package MVC.controlador;

import MVC.modelo.Usuario;
import MVC.modelo.UsuarioDAO;
import MVC.vista.UsuarioVista;

import java.util.List;
import java.util.Scanner;

//Controlador
//Permite manejar los datos
// entre el modelo y la vista
public class UsuarioControlador {
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.scanner = scanner = new Scanner(System.in);
    }

    public void iniciar(){
        while (true){
            System.out.println("Menu principal ");
            System.out.println("1. Crear usuario");
            System.out.println("2. Listar usuario");
            System.out.println("3. actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Buscar usuario por ID");
            System.out.println(":");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.insertar(nuevoUsuario);
                    System.out.println("Usuario Agregado!");
                    break;
                case 2:
                    usuarioVista.mostrarUsuarios(usuarioDAO.obtenerTodos());
                    break;
                case 3:
                    usuarioDAO.actualizar(usuarioVista.actualizarUsuario());
                    break;
                case 4:
                    usuarioDAO.eliminar(usuarioVista.eliminarUsuario());
                    break;
                case 5:
                    usuarioDAO.buscarUsuarioPorId(usuarioVista.buscarUsuario());
            }

        }
    }
}
