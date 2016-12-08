/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

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
}
