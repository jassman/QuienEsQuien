/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class PanelFotos extends JPanel{
    private JButton [] botones = new JButton [24];
    private String [] nombres = {"Alex", "Alfred", "Anita", "Anne", "Bernard", "Bill", "Charles", "Claire", "David", "Eric", "Frans", "George", "Herman", "Joe", "Maria", "Max", "Paul", "Peter", "Philip", "Richard", "Robert", "Sam", "Susan", "Tom"};
    private Color sinPulsar, pulsado;
    public  PanelFotos(){
        
        setLayout(new GridLayout(3,8));
        setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        sinPulsar = Color.DARK_GRAY;
        pulsado = Color.BLACK;
        for(int i = 0; i < 24; i++){
            botones[i] = new BotonPersonalizado(); 
            ImageIcon face = new ImageIcon("cara" + (i+1) + ".gif");
            botones[i].setIcon(face);
            botones[i].setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
            botones[i].setActionCommand(nombres[i]);
           
            add(botones[i]);
        }

    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListener(ActionListener a){
        for(int i = 0; i < 24; i++){
            botones[i].addActionListener(a);   
        }
    }
    
    public void eliminaSospechosos(int[] s){
        for(int i = 0; i < s.length; i++){
            ImageIcon face = new ImageIcon("reverso.gif");
            botones[s[i]].setIcon(face);
            botones[s[i]].setEnabled(false);
        }
    }
    
    class BotonPersonalizado extends JButton {

        public BotonPersonalizado() {
            this(null);
        }

        public BotonPersonalizado(String text) {
            super(text);
            super.setContentAreaFilled(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(pulsado);
            } else if (getModel().isRollover()) {
                g.setColor(sinPulsar);
            } else {
                g.setColor(getBackground());
            }
            g.fillRect(0, 0, getWidth(), getHeight());
            super.paintComponent(g);
        }

       
    }
    
    public void setColorFondo(Color c){
        this.setBackground(c);
    }
     
     public void setColorFoco(Color c){
        //pulsado = c;
        sinPulsar = c;
     }
            
}
       


     
    

  

