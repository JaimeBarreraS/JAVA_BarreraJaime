package Dia6;

/**
 *
 * @author Jaime Barrera
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres / 100;
        System.out.println("Nuevo saldo después de aplicar interés: " + saldo);
    }
}
