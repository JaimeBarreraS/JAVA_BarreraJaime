package MVC.vista;

import MVC.modelo.Usuario;

import java.util.List;
import java.util.Scanner;

/*Vista*/
/*La vista maneja la interacción con el usuario.*/
public class UsuarioVista {

    public void mostrarUsuarios(List<Usuario> usuarios){
        System.out.println("Lista de usuarios:");
        for (Usuario u:usuarios){
            System.out.println(u);
        }
    }

    public Usuario agregarUsuario(){
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre:");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        return new Usuario(nombre,email);
    }

    public Usuario actualizarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        return new Usuario(id,nombre,email);
    }

    public int eliminarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Usuario eliminado");
        return id;
    }

    public Usuario buscarUsuario(int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID");
        return null;
    }
}
