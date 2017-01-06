/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class ElegirColor extends JFrame{
    private JColorChooser elegir;
    private Color color;
    public ElegirColor(){
        elegir = new JColorChooser(); //Creacion de la paleta de colores
        color = elegir.showDialog(null, "Seleccione un Color", Color.gray); //Guardamos el color seleccionado en una variable
    }
    
    /**
     * @return Funcion que devuelve el color elegido;
     */
    public Color getColor(){
        return color;
    }
}
