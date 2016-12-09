/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class VentanaPrincipal extends JFrame{
    private PanelFotos fotos;
    private PanelBotones botones;
    private Puntuacion puntos;
    
    public VentanaPrincipal(){
        
        setLayout(new BorderLayout ());
        fotos = new PanelFotos();
        botones = new PanelBotones();
        puntos = new Puntuacion();
        
        add(puntos, BorderLayout.NORTH);
        add(fotos, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
    }
    
    public void setActionListenerAsesino(ActionListener a){
        fotos.setActionListener(a);
    }
    
    public void setActionListenerBotones1(ActionListener a){
        botones.setActionListenerPanel1(a);
    }
    
    public void setActionListenerBotones2(ActionListener a){
        botones.setActionListenerPanel2(a);
    }
    
    public void eliminaSospechosos(int[] s){
        fotos.eliminaSospechosos(s);
    }
    
            
    public void opSexo(){
        botones.opSexo();
    }
    
    public void opPelo(){
        botones.opPelo();
    }
    
    public void opOjos(){
        botones.opOjos();
    }
    
    public void opNariz(){
        botones.opNariz();
    }
    
    public void opBoca(){
        botones.opBoca();
    }
    
    public void opGafas(){
        botones.opGafas();
    }
    
    public void opSombrero(){
        botones.opSombrero();
    }
    
    public void opBigote(){
        botones.opBigote();
    }
    
    
    
}
