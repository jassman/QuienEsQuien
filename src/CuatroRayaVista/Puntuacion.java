/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class Puntuacion extends JPanel{
    private JLabel puntos;
    
    public Puntuacion(){
        puntos = new JLabel("Puntos: ");
        
        add(puntos);
    }
    
    public void setPuntos(int i){
        String s = String.valueOf(i);
        
        puntos.setText("Puntos: " + s);
    }
    
    public void setColor(Color c){
        this.setBackground(c);
        
    }
}
