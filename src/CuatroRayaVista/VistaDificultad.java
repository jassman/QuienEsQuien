/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class VistaDificultad extends JFrame{
    private BotonesDificultad botones;
        public VistaDificultad(){
            botones = new BotonesDificultad();
            Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
            int height = pantalla.height;
            int width = pantalla.width;
            setSize(width/2, height/2);
            setLocationRelativeTo(null);
            add(botones);
            ImageIcon face = new ImageIcon("signo-logo.png");
            setIconImage(face.getImage());
        }
        
        public void setActionListener(ActionListener a){
            botones.setActionListener(a);
        }
}
