package CuatroRayaModelo;
/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class Jugador {
    
    private int puntos, num_partidas, num_victorias;
    /* 
    * Constructor de jugador, para almacenar puntos y victorias
    */
    public Jugador(int puntos, int num_partidas, int num_victorias){
        this.puntos = puntos;
        this.num_partidas = num_partidas;
    }
    /**
     * @return media de puntos por partida
     */
    public double getMedia() {
        return puntos/num_partidas;
    }
    /**
     * @return puntos del jugador
     */
    public int getPuntos() {
        return puntos;
    }
    /**
     * @param puntos
     * @set puntos del jugador
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    /**
     * @return numeoro de partidas del jugador
     */
    public int getNum_partidas() {
        return num_partidas;
    }
    /**
     * @param num_partidas
     * @set numero de partidas
     */
    public void setNum_partidas(int num_partidas) {
        this.num_partidas = num_partidas;
    }
    /**
     * @return numero de victorias
     */
    public int getNum_victorias() {
        return num_victorias;
    }
    /**
     * @param num_victorias
     * @set numero de victorias
     */
    public void setNum_victorias(int num_victorias) {
        this.num_victorias = num_victorias;
    }
    /**
     * @return media de numero de victorias por partidas
     */
    public double getMedia_victorias() {
        return num_victorias/num_partidas;
    }

}
