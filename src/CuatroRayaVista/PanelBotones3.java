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
        setPreferredSize( new Dimension(900, 50) ); //Le damos un tamaño al panel
        respuesta = new JLabel(); //Creamos un JLabel
        respuesta.setVisible(false); //Ponemos la visibilidad del JLabel en falso
        add(respuesta); //Añadimos el JLabel
    }
    
    /**
     * @param estado Estado del personaje
     * Funcion que le pasamos el estado del personaje y nos dice si una pregunta es verdadera o falso
     */
    public void respuesta(boolean estado){
        if(estado){
            respuesta.setText("¡Es cierto!");
        }else{
            respuesta.setText("¡No es cierto!");
        }
        respuesta.setVisible(true); //Ponemos la visibilidad del JLabel en verdadero
    }
    
    /**
     * @param c Color que queremos que sea el fondo
     * Funcion que pone el color de fondo de pantalla del color que le pasamos
     */
    public void setColor(Color c){
        this.setBackground(c);
    }
    
}
