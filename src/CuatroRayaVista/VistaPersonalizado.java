package CuatroRayaVista;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Javier Alonso y Lucas Nicolini
 */
public class VistaPersonalizado extends JFrame {

    private final BotonesPersonalizado botones;
    private final JButton boton;
    private BotonPuntos puntos;

    /**
     * Contructor de la vista personalizada
     */
    public VistaPersonalizado() {
        setLayout(new BorderLayout()); //Elegimos el tipo de contenedor de la vista
        puntos = new BotonPuntos(); //Inicializamos la clase BotonPuntos
        setVisible(false); //Ponemos la visibilidad de la vista en falso
        setSize(400, 400); //Le damos un tamaño a la vista
        setLocationRelativeTo(null);
        setTitle("Nivel personalizado"); //Ponemos un titulo a la vista
        /* Creacion de los paneles */
        botones = new BotonesPersonalizado();
        boton = new JButton("Aceptar");
        /* Añade el panel a la vista */
        add(puntos, BorderLayout.NORTH);
        add(botones, BorderLayout.CENTER);
        add(boton, BorderLayout.SOUTH);
        /* Añade icono al frame */
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }

    /**
     * @param ActionListener 
     */
    public void setActionListener(ActionListener a) {
        boton.addActionListener(a);
    }

    /**
     * @return Funcion que devuelve el numero de puntos inciales;
     */
    public int getPIniciales() {
        return puntos.getPIniciales();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del sexo
     */
    public int getPSexo() {

        return botones.getPSexo();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del pelo
     */
    public int getPPelo() {

        return botones.getPPelo();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de la nariz
     */
    public int getPNariz() {

        return botones.getPNariz();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de la boca
     */
    public int getPBoca() {

        return botones.getPBoca();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de las gafas
     */
    public int getPGafas() {

        return botones.getPGafas();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del bigote
     */
    public int getPBigote() {

        return botones.getPBigote();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         del sombrero
     */
    public int getPSombrero() {

        return botones.getPSombrero();
    }

    /**
     * @return Funcion que devuelve el valor de los puntos que resta la pregunta
     *         de los ojos
     */
    public int getPOjos() {

        return botones.getPOjos();
    }
}
