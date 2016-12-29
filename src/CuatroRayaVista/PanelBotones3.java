/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class PanelBotones3 extends JPanel{
    private JLabel respuesta;

    
    public PanelBotones3(){
        setPreferredSize( new Dimension(900, 50) );
        respuesta = new JLabel();
        respuesta.setVisible(false);
        add(respuesta);
    }
    
    public void respuesta(boolean estado){
        if(estado){
            respuesta.setText("¡Es cierto!");
        }else{
            respuesta.setText("¡No es cierto!");
        }
        respuesta.setVisible(true);
    }
    
    public void setColor(Color c){
        this.setBackground(c);
    }
    
}
