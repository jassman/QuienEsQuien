/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaModelo;

/**
 *
 * @author Javier
 */
public class Jugador {
    private int puntos, num_partidas,num_victorias;

    public Jugador(int puntos, int num_partidas,int num_victorias){
        this.puntos = puntos;
        this.num_partidas = num_partidas;
    }

    public double getMedia() {
        return puntos/num_partidas;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getNum_partidas() {
        return num_partidas;
    }

    public void setNum_partidas(int num_partidas) {
        this.num_partidas = num_partidas;
    }
    public int getNum_victorias() {
        return num_victorias;
    }
    public void setNum_victorias(int num_victorias) {
        this.num_victorias = num_victorias;
    }
    public double getMedia_victorias() {
        return num_victorias/num_partidas;
    }

}
