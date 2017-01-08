package CuatroRayaVista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class PanelBotones extends JPanel{
    private PanelBotones1 botones1;
    private PanelBotones2 botones2;
    private PanelBotones3 botones3;
    
    public PanelBotones(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        botones1 = new PanelBotones1();
        botones2 = new PanelBotones2();
        botones3 = new PanelBotones3();
        
        add(botones1);
        add(botones2);
        add(botones3);
    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListenerPanel1(ActionListener a){
        botones1.setActionListener(a);
    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListenerPanel2(ActionListener a){
        botones2.setActionListener(a);
    }
    
    /**
     * @param estado estado del personaje
     * Funcion que le pasa a otra funcion el estado del personaje
     */
    public void respuesta(boolean estado){
        botones3.respuesta(estado);
    }
    
    
    public void opSexo(){
        botones2.opSexo();
    }
    
    public void opPelo(){
        botones2.opPelo();
    }
    
    public void opOjos(){
        botones2.opOjos();
    }
    
    public void opNariz(){
        botones2.opNariz();
    }
    
    public void opBoca(){
        botones2.opBoca();
    }
    
    public void opGafas(){
        botones2.opGafas();
    }
    
    public void opSombrero(){
        botones2.opSombrero();
    }
    
    public void opBigote(){
        botones2.opBigote();
    }
    /**
     * @param s Nombre del boton que hay que bloquear
     * Funcion que bloquea los botones de las opciones segun se vayan pulsando
     */
    public void bloquearBoton(String s){
        botones2.bloquearBoton(s);
    }
    
    /**
     * @param c Color que queremos que sea el fondo
     * Funcion que le pasa a otras funciones el color
     */
    public void setColor(Color c){
        botones1.setColor(c);
        botones2.setColor(c);
        botones3.setColor(c);
        
    }
}
