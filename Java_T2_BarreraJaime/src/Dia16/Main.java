package Dia16;

/**
 *
 * @author Jaime Barrera
 */
public class Main implements Runnable {

    private String documento;

    public Main(String documento) {
        this.documento = documento;
    }

    @Override
    public void run() {
        System.out.println("Imprimiendo el documento: " + documento);
        try {
            // Simula el tiempo que tarda la impresora en imprimir
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Impresión completada: " + documento);
    }

    public static void main(String[] args) {
        String[] documentos = {"Contrato", "Informe", "Carta", "Presentación", "Foto"};

        for (String doc : documentos) {
            Thread hiloUsuario = new Thread(new Main(doc));
            hiloUsuario.start();
        }
    }
}
