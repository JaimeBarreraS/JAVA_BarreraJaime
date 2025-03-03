package LigaBaloncesto;

/**
 *
 * @author Jaime Barrera
 */
public class Partidos {
    String equipoLocal;
    String equipoVisitante;
    int puntosLocal;
    int puntosVisitante;
    int tiros;
    int faltas;
    boolean finalizado;
    String fecha;

    public Partidos() {}

    public Partidos(String equipoLocal, String equipoVisitante, String fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
        this.tiros = 0;
        this.faltas = 0;
        this.finalizado = false;
        this.fecha = fecha;
    }

    //REGISTRAR PUNTOS LOCAL 
    
    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntos) {
        if (finalizado) {
            System.out.println("El partido ya ha finalizado, no se pueden registrar más puntos.");
        } else if (puntos >= 0) {
            this.puntosLocal += puntos;
        } else {
            System.out.println("No se pueden registrar puntos negativos.");
        }
    }
    
    public void registrarPuntosLocal(int puntos) {
        setPuntosLocal(puntos);
    }
    
    //REGISTRAR PUNTOS VISITANTES

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(int puntos) {
        if (finalizado) {
            System.out.println("El partido ya ha finalizado, no se pueden registrar más puntos.");
        } else if (puntos >= 0) {
            this.puntosVisitante += puntos;
        } else {
            System.out.println("No se pueden registrar puntos negativos.");
        }
    }
    
    public void registrarPuntosVisitante(int puntos) {
        setPuntosVisitante(puntos);
    }
    
    //REGISTRAR TIROS
    
    public int getTiros() {
        return tiros;
    }

    public void setTiros(int tiros) {
        this.tiros = tiros;
    }

    public void registrarTiro() {
        setTiros(getTiros() + 1);
    }
    
    //REGISTRAR FALTA

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public void registrarFalta() {
        setFaltas(getFaltas() + 1);
    }
    
    // FINALIZAR PARTIDOS

    public boolean finalizarPartido() {
        this.finalizado = true;
        return true;
    }

    // OBTENER RESULTADO
    
    public String obtenerResultado() {
        return puntosLocal + " - " + puntosVisitante;
    }

    //OBTENER GANADOR
    
    public String obtenerGanador() {
        if (puntosLocal > puntosVisitante) return equipoLocal;
        if (puntosVisitante > puntosLocal) return equipoVisitante;
        return "Empate";
    }

    //OBTENER INFORMACION
    public String obtenerInformacion() {
        return "Partido: " + equipoLocal + " vs " + equipoVisitante + "\n" +
                "Fecha: " + fecha + "\n" +
                "Resultado: " + obtenerResultado() + "\n" +
                "Ganador: " + obtenerGanador() + "\n" +
                "Tiros: " + tiros + "\n" +
                "Faltas: " + faltas + "\n" +
                "Estado: " + (finalizado ? "Finalizado" : "En juego");
    }
}



    

    


