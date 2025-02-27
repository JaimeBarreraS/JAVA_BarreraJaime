package LigaBaloncesto;

/**
 *
 * @author Jaime Barrera
 */
public class PartidoPlayOffs extends Partidos {
    String ronda;

    public PartidoPlayOffs() {}

    public PartidoPlayOffs(String ronda) {
        this.ronda = ronda;
    }

    public PartidoPlayOffs(String ronda, String equipoLocal, String equipoVisitante, String fecha) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }

    @Override
    public boolean finalizarPartido() {
        if (puntosLocal != puntosVisitante) {
            this.finalizado = true;
            return true;
        }
        System.out.println("El partido no puede finalizar en empate.");
        return false;
    }

}
