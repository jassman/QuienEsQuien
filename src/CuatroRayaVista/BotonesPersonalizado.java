/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class BotonesPersonalizado extends JPanel{
    private JSpinner [] tipo = new JSpinner[8];
    private JSpinner inicio;
    private String [] etiqueta = {"Sexo: ", "Pelo: ", "Nariz: ", "Boca: ", "Gafas: ", "Bigote: ", "Sombrero: ", "Ojos: "};
    private JLabel inicio_texto;
    private JLabel [] tipos = new JLabel[8];
    public BotonesPersonalizado(){
        setLayout(new GridLayout(10,2));
        inicio_texto = new JLabel("Puntos iniciales: ");
        inicio = new JSpinner();
        inicio.setValue(200);
        add(inicio_texto);
        add(inicio);
        for(int i = 0; i < 8; i++){
            tipo[i] = new JSpinner();
            tipo[i].setValue(50);
            tipos[i] = new JLabel(etiqueta[i]);
            add(tipos[i]);
            add(tipo[i]);
        }
        
    }
    
    public int getPIniciales(){
        return (int) inicio.getValue();
    }
    
    public int getPSexo(){
        
        return (int) tipo[0].getValue();
    }
    
    public int getPPelo(){
        
        return (int) tipo[1].getValue();
    }
    
    public int getPNariz(){
        
        return (int) tipo[2].getValue();
    }
    
    public int getPBoca(){
        
        return (int) tipo[3].getValue();
    }
    
    public int getPGafas(){
        
        return (int) tipo[4].getValue();
    }
    
    public int getPBigote(){
        
        return (int) tipo[5].getValue();
    }
    
    public int getPSombrero(){
        
        return (int) tipo[6].getValue();
    }
    
    public int getPOjos(){
        
        return (int) tipo[7].getValue();
    }
    
}
