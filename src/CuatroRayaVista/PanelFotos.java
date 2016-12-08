/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
    public  PanelFotos(){
        
        setLayout(new GridLayout(3,8));
        
        for(int i = 0; i < 24; i++){
            botones[i] = new JButton(); 
            ImageIcon face = new ImageIcon("cara" + (i+1) + ".gif");
            botones[i].setIcon(face);
            botones[i].setActionCommand(nombres[i]);
            add(botones[i]);
        }

    }
    
    public void setActionListener(ActionListener a){
        for(int i = 0; i < 24; i++){
            botones[i].addActionListener(a);   
        }
    }
    
    
    
    
    
    
    
}
