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
    private int puntos, num_partidas;
    private double media;
    private String nombre;
    
    public Jugador(String nombre,int puntos, int num_partidas){
        this.nombre = nombre;
        this.puntos = puntos;
        this.num_partidas = num_partidas;
        this.media = puntos/num_partidas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
