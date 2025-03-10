package Dia12.Clase.Builder;

/**
 *
 * @author Jaime Barrera
 */
// Builder
// Se usa para construir objetos complejos paso a paso.
// Es útil cuando hay muchas configuraciones posibles para un objeto.

public class main { // Cambio de 'main' a 'Main'
    static class Computadora {
        private String procesador;
        private int ram;
        private boolean tarjetaGrafica;

        // Constructor privado
        private Computadora(Builder builder) {
            this.procesador = builder.procesador;
            this.ram = builder.ram;
            this.tarjetaGrafica = builder.tarjetaGrafica;
        }

        public void mostrarConfiguracion() {
            System.out.println("Computadora con " + procesador + 
                ", RAM: " + ram + "GB, Tarjeta gráfica: " + tarjetaGrafica);
        }
    }

    // Clase Builder interna
    public static class Builder {
        private String procesador;
        private int ram;
        private boolean tarjetaGrafica;

        public Builder setProcesador(String procesador) {
            this.procesador = procesador;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setTarjetaGrafica(boolean tarjetaGrafica) {
            this.tarjetaGrafica = tarjetaGrafica;
            return this;
        }

        public Computadora build() {
            return new Computadora(this);
        }
    }
}

// Uso (Debe estar fuera de la clase Main)
class BuilderDemo {
    public static void main(String[] args) {
        main.Computadora pc = new main.Builder()
            .setProcesador("Intel i7")
            .setRam(16)
            .setTarjetaGrafica(true)
            .build();

        pc.mostrarConfiguracion();
    }
}




