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

    public void setActionListenerAsesino(ActionListener a) {
        fotos.setActionListener(a);
    }

    public void setActionListenerBotones1(ActionListener a) {
        botones.setActionListenerPanel1(a);
    }

    public void setActionListenerBotones2(ActionListener a) {
        botones.setActionListenerPanel2(a);
    }

    public void setActionListenerMenu(ActionListener a) {
        menu.setActionListener(a);
    }

    public void eliminaSospechosos(int[] s) {
        fotos.eliminaSospechosos(s);
    }

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

    public void setText(int s) {
        puntos.setPuntos(s);
    }

    public void bloquearBoton(String s) {
        botones.bloquearBoton(s);
    }

    public void setColorFondo(Color c) {
        botones.setColor(c);
        fotos.setColorFondo(c);
        puntos.setColor(c);
    }

    public void setColorFoco(Color c) {
        fotos.setColorFoco(c);
    }

}
