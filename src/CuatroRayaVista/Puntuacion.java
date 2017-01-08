/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lucas y Javier
 */
public class Puntuacion extends JPanel{
    private JLabel puntos;
    
    public Puntuacion(){
        puntos = new JLabel("Puntos: "); //Creacion de un JLabel
        setBackground(new Color(204,204,255));
        puntos.setFont(new Font("Colibri", Font.BOLD, 16));
        add(puntos); //Añadimos el JLabel
    }
    
    /**
     * @param i Puntos que tiene el jugador, los guardamos y los mostramos
     */
    public void setPuntos(int i){
        String s = String.valueOf(i);
        
        puntos.setText("Puntos: " + s);
    }
    
    /**
     * @param c Color que queremos que sea el fondo 
     */
    public void setColor(Color c){
        this.setBackground(c);
        
    }
}
