package CuatroRayaVista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class VistaDificultad extends JFrame{
    private BotonesDificultad botones;
        public VistaDificultad(){
            botones = new BotonesDificultad(); //Inicializamos la clase BotonesDificultad
            Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize(); //Guardamos en una variable la dimension de la pantalla
            int height = pantalla.height; //Guardamos la altura
            int width = pantalla.width; //Guardamos la anchura
            setSize(width/2, height/2); //Ponemos esas medidas entre dos
            setLocationRelativeTo(null);
            add(botones); //Añadimos a la vista la clase BotonesDificultad
            ImageIcon face = new ImageIcon("signo-logo.png"); //Guardamos la imagen del logo
            setIconImage(face.getImage()); //Ponemos la imagen del logo en la vista
        }
        
        /**
        * @param a 
        */
        public void setActionListener(ActionListener a){
            botones.setActionListener(a);
        }
}
