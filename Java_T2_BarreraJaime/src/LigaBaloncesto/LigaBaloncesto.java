package LigaBaloncesto;

/**
 *
 * @author Jaime Barrera
 */
import java.util.Scanner;

public class LigaBaloncesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Partidos partido = null;
        
        while (true) {
            System.out.println("1. Registrar partido de liga");
            System.out.println("2. Registrar partido de playOff");
            System.out.println("3. Registrar puntos");
            System.out.println("4. Registrar tiro");
            System.out.println("5. Registrar falta");
            System.out.println("6. Finalizar partido");
            System.out.println("7. Mostrar información del partido");
            System.out.println("8. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Equipo local: ");
                    String local = scanner.nextLine();
                    System.out.print("Equipo visitante: ");
                    String visitante = scanner.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();
                    System.out.print("Jornada: ");
                    int jornada = scanner.nextInt();
                    partido = new PartidosLiga(local, visitante, fecha, jornada);
                    break;
                case 2:
                    System.out.print("Equipo local: ");
                    local = scanner.nextLine();
                    System.out.print("Equipo visitante: ");
                    visitante = scanner.nextLine();
                    System.out.print("Fecha: ");
                    fecha = scanner.nextLine();
                    System.out.print("Ronda: ");
                    String ronda = scanner.nextLine();
                    partido = new PartidoPlayOffs(ronda, local, visitante, fecha);
                    break;
                case 3:
                    if (partido != null) {
                        System.out.print("Puntos para local: ");
                        int pLocal = scanner.nextInt();
                        partido.registrarPuntosLocal(pLocal);
                        System.out.print("Puntos para visitante: ");
                        int pVisitante = scanner.nextInt();
                        partido.registrarPuntosVisitante(pVisitante);
                    } else {
                        System.out.println("No hay partido registrado.");
                    }
                    break;
                case 4:
                    if (partido != null) partido.registrarTiro();
                    else System.out.println("No hay partido registrado.");
                    break;
                case 5:
                    if (partido != null) partido.registrarFalta();
                    else System.out.println("No hay partido registrado.");
                    break;
                case 6:
                    if (partido != null) partido.finalizarPartido();
                    else System.out.println("No hay partido registrado.");
                    break;
                case 7:
                    if (partido != null) System.out.println(partido.obtenerInformacion());
                    else System.out.println("No hay partido registrado.");
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
