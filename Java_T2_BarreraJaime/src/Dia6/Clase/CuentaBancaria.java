package Dia6.Clase;

/**
 *
 * @author Jaime Barrera
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria() {}

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    
    //No voy a crear un setter para el numero de cuenta
    //Razon: Para que no se modifique despues de haberse creado
    
    //Getter para el 'saldo'

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo=saldo+cantidad;
            System.out.println("El deposito fue realizado");
        }else{
            System.out.println("La cantidad a depositar debe ser positiva");
        }
    }
    
    //metodo para retirar plata con validacion

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Su retiro fue realizado");
        }else if(cantidad > saldo){
            System.out.println("No tiene fondos suficientes");
        }else{
            System.out.println("Debes ingresar una cantidad suficiente");
        }
        
    }
    
    
    
    
    
}
