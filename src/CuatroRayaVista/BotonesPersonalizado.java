/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import javax.swing.JSpinner;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class BotonesPersonalizado extends JPanel{
    private JSpinner [] tipo = new JSpinner[8];
    private JSpinner inicio;
    //private String [] etiqueta = {"sexo", "pelo", "boca", "nariz", "sombrero", "gafas", "bigote", "ojos"};
    
    public BotonesPersonalizado(){
        inicio = new JSpinner();
        inicio.setValue(200);
        for(int i = 0; i < 8; i++){
            tipo[i] = new JSpinner();
            tipo[i].setValue(50);
            add(tipo[i]);
        }
        add(inicio);
    }
    
    public int getPIniciales(){
        return (int) inicio.getValue();
    }
    
}
