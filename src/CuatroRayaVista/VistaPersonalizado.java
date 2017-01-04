/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class VistaPersonalizado extends JFrame{
    private BotonesPersonalizado botones;
    private JButton boton;
    public VistaPersonalizado(){
        setLayout(new BorderLayout());
        botones = new BotonesPersonalizado();
        boton = new JButton("Aceptar");
        
        add(botones, BorderLayout.CENTER);
        add(boton, BorderLayout.SOUTH);
        
        this.setVisible(false);
        this.setSize(400,400);
        this.setTitle("Nivel personalizado");
        
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }
    
    public void setActionListener(ActionListener a){
        boton.addActionListener(a);
    }
    
     public int getPIniciales(){
        return botones.getPIniciales();
    }
    
    public int getPSexo(){
        
        return botones.getPSexo();
    }
    
    public int getPPelo(){
        
        return botones.getPPelo();
    }
    
    public int getPNariz(){
        
        return botones.getPNariz();
    }
    
    public int getPBoca(){
        
        return botones.getPBoca();
    }
    
    public int getPGafas(){
        
        return botones.getPGafas();
    }
    
    public int getPBigote(){
        
        return botones.getPBigote();
    }
    
    public int getPSombrero(){
        
        return botones.getPSombrero();
    }
    
    public int getPOjos(){
        
        return botones.getPOjos();
    }
}


