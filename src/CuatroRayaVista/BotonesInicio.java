/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Lucas
 */
public class BotonesInicio extends JButton{
    private final Border emptyBorder;
   
    public BotonesInicio(){
        //setBackground(Color.BLACK);
        super("JUGAR");
        emptyBorder = BorderFactory.createEmptyBorder(50,0,0,0);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFont(new Font("Colibri", Font.BOLD, 18));
        setForeground(Color.WHITE);
        setBorder(emptyBorder);
        
    }

    public void setActionListener(ActionListener a){
            this.addActionListener(a);
    }
}
