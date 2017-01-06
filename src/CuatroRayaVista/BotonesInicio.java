/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author Lucas y Javier
 */
public class BotonesInicio extends JButton{
    private final Border emptyBorder;
   
    public BotonesInicio(){

        super("JUGAR"); //Constructor
        emptyBorder = BorderFactory.createEmptyBorder(50,0,1,0); //Creacion del borde
        setOpaque(false); //Hacemos que no sea opaco
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFont(new Font("Colibri", Font.BOLD, 18));
        setForeground(Color.WHITE);
        setBorder(emptyBorder);
        
    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListener(ActionListener a){
            this.addActionListener(a);
    }
}
