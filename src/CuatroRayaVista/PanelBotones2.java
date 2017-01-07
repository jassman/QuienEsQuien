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
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class PanelBotones2 extends JPanel{
    private JButton [] botones = new JButton [23];
    //private ButtonGroup [] opciones = new ButtonGroup [8];
    private String [] subopciones = {
        "Chico", 
        "Chica", 
        "Rubio", 
        "Moreno", 
        "Castaño", 
        "Pelirrojo", 
        "Canoso", 
        "Calvo", 
        "Azules", 
        "Verdes", 
        "Marrones", 
        "NGrande", 
        "NMediana", 
        "NPequeña", 
        "BGrande", 
        "BMediana", 
        "BPequeña", 
        "SiGafas", 
        "NoGafas", 
        "SiSombrero", 
        "NoSombrero", 
        "SiBigote", 
        "NoBigote"};
    
    public PanelBotones2(){
        
        setPreferredSize( new Dimension(900, 50) );
        
        for(int i = 0; i < 23; i++){
            botones[i] = new JButton(subopciones[i]);  
        }
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
            add(botones[i]);
        }
        
    }
    
    public void opSexo(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 0; i < 2; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void opPelo(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 2; i < 8; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void opOjos(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 8; i < 11; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void opNariz(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 11; i < 14; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void opBoca(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 14; i < 17; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void opGafas(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 17; i < 19; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void opSombrero(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 19; i < 21; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void opBigote(){
        for(int i = 0; i < 23; i++){
            botones[i].setVisible(false);
        }
        
        for(int i = 21; i < 23; i++){
            botones[i].setVisible(true);
        }
    }
    
    public void setActionListener(ActionListener a){
        for(int i = 0; i < 23; i++){
            botones[i].addActionListener(a);
        }
    }
    
    public void bloquearBoton(String s){
        for(int i = 0; i < 23; i++){
            if (botones[i].getActionCommand() == s){
                botones[i].setEnabled(false);
            }
        }
    }
    
    /**
     * @param c Color que queremos que sea el fondo
     * Funcion que pone el color de fondo de pantalla del color que le pasamos
     */
    public void setColor(Color c){
        this.setBackground(c);
    }
}
