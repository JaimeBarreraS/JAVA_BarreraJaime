package PrincipiosSOLID.Ejercicio2;

public class AuditTransfMonet {
    private final NotificadorTransferencia notificador;

    public AuditTransfMonet(NotificadorTransferencia notificador) {
        this.notificador = notificador;
    }

    public void transferenciaRealizada(Transferencia transferencia) {
        if (esTransferenciaImportante(transferencia)) {
            notificador.notificar(transferencia);
        }
    }

    private boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }
}
// SRP (responsabilidad unica)