/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 *
 * @author Lucas y Javier
 */
public class BotonPuntos extends JPanel{
    
    private JLabel etiqueta;
    private JSpinner inicio;
    
    public BotonPuntos(){
        etiqueta = new JLabel("Puntos iniciales: "); //Creacion de un JLabel
        inicio = new JSpinner(); //Creacion de un JSpinner
        inicio.setValue(200); //Ponemos valor inicial del JSpinner
        add(etiqueta); //Añadimos el JLabel
        add(inicio); //Añadimos el JSpinner
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos iniciales que indica 
     *         el usuario
     */
    public int getPIniciales(){
        return (int) inicio.getValue();
    }
    
}
