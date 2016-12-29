/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class BotonesInicio extends JPanel{
    private JButton  botones ;
   
    public BotonesInicio(){
        
            botones = new JButton("JUGAR");
            add(botones);
        
    }

    public void setActionListener(ActionListener a){
            botones.addActionListener(a);
       
    }
}
