/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dia6;

/**
 *
 * @author Jaime Barrera
 */
public class CuentaAhorroTest {
    public static void main(String[] args) {
        CuentaAhorro cuenta = new CuentaAhorro("Jaime", 500.000, 2);
        cuenta.depositar(100.000);
        cuenta.retirar(200.000);
        cuenta.aplicarInteres();
    }
}
