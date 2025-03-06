package PrincipiosSOLID.Ejercicio2;

/**
 *
 * @author Jaime Barrera
 */
public class NotificadorTransferencia {
    public void notificar(Transferencia transferencia) {
        String auditor = obtenerDireccionMailAuditor();
        String mensaje = componerMensajeAviso(transferencia);
        ConexionMail conexionMail = null;
        try {
            conexionMail = abrirConexionMail();
            conexionMail.enviar(new Mail().to(auditor).withBody(mensaje));
        } finally {
            if (conexionMail != null)
                conexionMail.cerrar();
        }
    }

    private String obtenerDireccionMailAuditor() {
        return "mail-auditor";
    }

    private String componerMensajeAviso(Transferencia transferencia) {
        return "aviso-transferencia-importante";
    }

    private ConexionMail abrirConexionMail() {
        return ConexionMail.getInstance();
    }
}

//SRP (Responsabilidad unica) y DIP (Inversion de dependencias).