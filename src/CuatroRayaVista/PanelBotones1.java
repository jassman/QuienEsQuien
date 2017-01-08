package CuatroRayaVista;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class PanelBotones1 extends JPanel{
    private JButton [] botones = new JButton [8];
    private String [] etiqueta = {"Sexo", "Pelo", "Ojos", "Nariz", "Boca", "Gafas", "Sombrero", "Bigote"};
    
    public PanelBotones1(){
        
        setBackground(new Color(204,204,255));
        for(int i = 0; i < 8; i++){
            botones[i] = new JButton(); //Creacion de un JButton
            ImageIcon rasgo = new ImageIcon("boton" + (i) + ".gif"); //Cargamos la imagen para poner en el boton
            Image img = rasgo.getImage() ;  //Guardamos la imagen en una variable 
            Image newimg = img.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  //Le damos un tamaño a la imagen 
            rasgo = new ImageIcon(newimg); //Guardamos la imagen con el tamaño que queremos en una variable
            botones[i].setIcon(rasgo); //Añadimos la imagen a un boton
            botones[i].setActionCommand(etiqueta[i]); //Le damos un nombre al JButton del vector etiqueta
            botones[i].setBackground(Color.WHITE); //Le damos al fondo del boton el color blanco
            botones[i].setForeground(Color.BLACK);
            botones[i].setFocusPainted(false);
            botones[i].setBorderPainted(false);
            add(botones[i]); //Añadimos el JButton
        }
    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListener(ActionListener a){
        for(int i = 0; i < 8; i++){
            botones[i].addActionListener(a);
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
