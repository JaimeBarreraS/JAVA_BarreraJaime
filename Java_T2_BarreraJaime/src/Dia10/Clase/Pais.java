package Dia10.Clase;

/**
 *
 * @author Jaime Barrera
 */
public enum Pais {
    //Enamuradores
    //U enumerador es una clase especial que restringe la creacion de objetos a los valores especificamentes
    //definidos en su implementacion.
    ESPANA("España", "Madrid"),
    FRANCIA("Francia", "París"),
    ITALIA("Italia", "Roma"),
    ALEMANIA("Alemania", "Berlín"),
    REINO_UNIDO("Reino Unido", "Londres");
    
    // Variables de instancia para nombre y capital del país
   private String nombre;
   private String capital;
    
    // Constructor privado para inicializar las variables de instancia
    private Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }


    // Método para obtener el nombre del país
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la capital del país
    public String getCapital() {
        return capital;
    }

}
