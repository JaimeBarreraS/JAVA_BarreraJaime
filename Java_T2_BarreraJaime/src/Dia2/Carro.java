package Dia2;
/**
 *
 * @author Jaime Barrera
 */

// primera parte de una clase : nombre
public class Carro {
    // Atributos ("caracteristicas")
    String marca;
    String modelo;
    int ano;
    String tipoCombustible;
    int caballosFuerza; 
    int puertas; 
    int asientos;
    int motor;
    int cilindraje;
    String color;
    int cantLlantas;
    
    // contructor
    public Carro (){}
    public Carro (String marca, String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.caballosFuerza=140;
        this.puertas=5;
        this.asientos=5;
        this.motor=2800;
        this.color="Negro";
        this.cantLlantas=4;
    }
    
    
    public Carro(String marca, String modelo, int ano, String tipoCombustible, int caballosFuerza, int puertas, int asientos, int motor, int cilindraje, String color, int cantLlantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustible = tipoCombustible;
        this.caballosFuerza = caballosFuerza;
        this.puertas = puertas;
        this.asientos = asientos;
        this.motor = motor;
        this.cilindraje = cilindraje;
        this.color = color;
        this.cantLlantas = cantLlantas;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tipoCombustible=" + tipoCombustible + ", caballosFuerza=" + caballosFuerza + ", puertas=" + puertas + ", asientos=" + asientos + ", motor=" + motor + ", cilindraje=" + cilindraje + ", color=" + color + ", cantLlantas=" + cantLlantas + '}';
    }
    
}
