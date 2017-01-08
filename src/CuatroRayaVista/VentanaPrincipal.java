package CuatroRayaVista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author Javier Alonso y Lucas Nicolini
 */
public class VentanaPrincipal extends JFrame {

    private final PanelFotos fotos;
    private final PanelBotones botones;
    private final Puntuacion puntos;
    private final MenuConfiguracion menu;
    private final int xSize;
    private final int ySize;

    /**
     * Constructor del la Ventana Principal
     */
    public VentanaPrincipal() {
        setLayout(new BorderLayout());
        /* Tamaño de la ventana segun el tamaño de pantalla */
        Toolkit tk = Toolkit.getDefaultToolkit();
        xSize = (int) (Math.round(tk.getScreenSize().getWidth() * 0.7));
        ySize = (int) (Math.round(tk.getScreenSize().getHeight() * 0.9));
        setSize(xSize, ySize);
        setLocationRelativeTo(null);//Centrar la ventana
        /* Genera los paneles */
        fotos = new PanelFotos();
        botones = new PanelBotones();
        puntos = new Puntuacion();
        menu = new MenuConfiguracion();
        /* Añade los paneles al frame */
        add(puntos, BorderLayout.NORTH);
        add(fotos, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
        setJMenuBar(menu);
        
        /* Icono de la ventana*/
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }
    
    /**
     * @param a 
     */
    public void setActionListenerAsesino(ActionListener a) {
        fotos.setActionListener(a);
    }
    
    /**
     * @param a 
     */
    public void setActionListenerBotones1(ActionListener a) {
        botones.setActionListenerPanel1(a);
    }
    
    /**
     * @param ActionListener 
     */
    public void setActionListenerBotones2(ActionListener a) {
        botones.setActionListenerPanel2(a);
    }

    /**
     * @param ActionListener 
     */
    public void setActionListenerMenu(ActionListener a) {
        menu.setActionListener(a);
    }

     /**
     * @param s posicion en el vector de los personajes
     * Funcion que elimina los sospechosos segun las preguntas del usuario
     */
    public void eliminaSospechosos(int[] s) {
        fotos.eliminaSospechosos(s);
    }

    /**
     * @param estado estado de cada personaje
     * Funcion que le pasa a otra funcion el estado del personaje
     */
    public void respuesta(boolean estado) {
        botones.respuesta(estado);
    }

    public void opSexo() {
        botones.opSexo();
    }

    public void opPelo() {
        botones.opPelo();
    }

    public void opOjos() {
        botones.opOjos();
    }

    public void opNariz() {
        botones.opNariz();
    }

    public void opBoca() {
        botones.opBoca();
    }

    public void opGafas() {
        botones.opGafas();
    }

    public void opSombrero() {
        botones.opSombrero();
    }

    public void opBigote() {
        botones.opBigote();
    }

    /**
     * @param s 
     * Funcion que le pasa a otra funcion un string
     */
    public void setText(int s) {
        puntos.setPuntos(s);
    }

    /**
     * @param s 
     * Funcion que le pasa a otra funcion un string
     */
    public void bloquearBoton(String s) {
        botones.bloquearBoton(s);
    }

    /**
     * @param c Color que queremos que sea el fondo
     * Funcion que le pasa a otras funciones el color
     */
    public void setColorFondo(Color c) {
        botones.setColor(c);
        fotos.setColorFondo(c);
        puntos.setColor(c);
    }

    /**
     * @param c Color que queremos que sea el fondo
     * Funcion que le pasa a otra funcion el color
     */
    public void setColorFoco(Color c) {
        fotos.setColorFoco(c);
    }

}
