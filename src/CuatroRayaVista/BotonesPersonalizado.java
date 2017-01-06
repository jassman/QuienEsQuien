/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPanel;

/**
 *
 * @author Lucas y Javier
 */
public class BotonesPersonalizado extends JPanel{
    private JSpinner [] tipo = new JSpinner[8];
    private JButton [] botones = new JButton[8];
    private String [] etiqueta = {"Sexo: ", "Pelo: ", "Ojos: ", "Nariz: ", "Boca: ", "Gafas: ", "Sombrero: ", "Bigote: "};
    private JLabel [] tipos = new JLabel[8];
    public BotonesPersonalizado(){
        setLayout(new GridLayout(8,2,100,5));
        
        for(int i = 0; i < 8; i++){
            botones[i] = new JButton(); //Creacion de un JButton
            ImageIcon rasgo = new ImageIcon("boton" + (i) + ".gif"); //Cargamos la imagen para poner en el boton
            Image img = rasgo.getImage() ; //Guardamos la imagen en una variable 
            Image newimg = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;  //Le damos un tamaño a la imagen 
            rasgo = new ImageIcon(newimg); //Guardamos la imagen con el tamaño que queremos en una variable
            botones[i].setIcon(rasgo); //Añadimos la imagen a un boton
            botones[i].setBackground(Color.WHITE); //Le damos al fondo del boton el color blanco
            botones[i].setForeground(Color.BLACK); 
            add(botones[i]); //Añadimos el JButton
            tipo[i] = new JSpinner(); //Creacion del JSpinner
            tipo[i].setValue(50); //Ponemos valor inicial de JSpinner a 50
            add(tipo[i]); //Añadimos el JSpinner
        }
        
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del sexo
     */
    public int getPSexo(){
        
        return (int) tipo[0].getValue();
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del pelo
     */
    public int getPPelo(){
        
        return (int) tipo[1].getValue();
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de la nariz
     */
    public int getPNariz(){
        
        return (int) tipo[3].getValue();
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de la boca
     */
    public int getPBoca(){
        
        return (int) tipo[4].getValue();
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de las gafas
     */
    public int getPGafas(){
        
        return (int) tipo[5].getValue();
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del bigote
     */
    public int getPBigote(){
        
        return (int) tipo[7].getValue();
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del sombrero
     */
    public int getPSombrero(){
        
        return (int) tipo[6].getValue();
    }
    
    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de los ojos
     */
    public int getPOjos(){
        
        return (int) tipo[2].getValue();
    }
    
}
