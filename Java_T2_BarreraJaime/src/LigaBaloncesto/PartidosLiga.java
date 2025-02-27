package LigaBaloncesto;

/**
 *
 * @author Jaime Barrera
 */
public class PartidosLiga extends Partidos{
    int jornada;

    public PartidosLiga() {}

    public PartidosLiga(int jornada) {
        this.jornada = jornada;
    }

   public PartidosLiga(String equipoLocal, String equipoVisitante, String fecha, int jornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada;
    }

}
