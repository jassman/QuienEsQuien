/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

/**
 *
 * @author Javier
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class VistaRanking extends JFrame {
   
   //private final ImagenGameOver image;
   private JPanel contenedor;
   private final JLabel l1,l2,l3;
    
    public VistaRanking() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        pack();
        setSize(1000,700);
        setResizable(false);
        
        contenedor = new JPanel();
        //contenedor.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        l1 = new JLabel("hola");
        l2 = new JLabel("hola");
        l3 = new JLabel("hola");
        
        contenedor.add(l1);
        contenedor.add(l2);
        contenedor.add(l3);
        
        add(contenedor);
    }

    public void setActionListener(ActionListener a) {
        
    }

}
