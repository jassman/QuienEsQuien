package CuatroRayaVista;

/**
 * @author Javier Alonso y Lucas Nicolini
 */
import CuatroRayaModelo.Jugador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class VistaRanking extends JFrame {

    private final JPanel contenedor;
    private final JPanel contenedor_b;
    private final JPanel contenedor_c;
    private final JLabel[] labels = new JLabel[5];
    private final Border emptyBorder;
    private final JLabel titulo;
    private final JButton[] botones;
    /**
     * Constructor de la vista Ranking (Estadisticas)
     *
     * @param j Jugador. Se utiliza para guardar los datos.
     */
    public VistaRanking(Jugador j) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setResizable(false);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        emptyBorder = BorderFactory.createEmptyBorder(20, 30, 20, 0);
        contenedor = new JPanel();
        contenedor_b = new JPanel();
        contenedor_c = new JPanel();
        botones = new JButton[2];

        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBackground(Color.black);

        titulo = new JLabel("RANKING PARTIDAS");
        titulo.setForeground(Color.black);
        titulo.setFont(new Font("Colibri", Font.BOLD, 20));
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 0));
        titulo.setBackground(Color.black);

        contenedor_c.setBackground(Color.BLACK);
        contenedor_c.add(titulo);

        labels[0] = new JLabel("Partidas:   " + j.getNum_partidas());
        labels[1] = new JLabel("Victorias:  " + j.getNum_victorias());
        labels[2] = new JLabel("Media:      " + j.getMedia_victorias());
        labels[3] = new JLabel("Puntos:     " + j.getPuntos());
        labels[4] = new JLabel("Media:      " + j.getMedia());

        for (JLabel l : labels) {
            l.setForeground(Color.white);
            l.setFont(new Font("Colibri", Font.BOLD, 15));
            l.setBorder(emptyBorder);
            contenedor.add(l);
        }

        botones[0] = new JButton("Volver a jugar");
        botones[1] = new JButton("Salir");

        contenedor_b.setBackground(Color.black);
        
        for (JButton b : botones) {
            b.setBackground(Color.black);
            b.setPreferredSize(new Dimension(250, 100));
            b.setFont(new Font("Colibri", Font.BOLD, 18));
            b.setForeground(Color.WHITE);
            b.setFocusPainted(false);
            b.setBorder(emptyBorder);
            b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            contenedor_b.add(b);
        }

        add(titulo, BorderLayout.NORTH);
        add(contenedor, BorderLayout.CENTER);
        add(contenedor_b, BorderLayout.SOUTH);
        
        
        ImageIcon face = new ImageIcon("signo-logo.png");
        setIconImage(face.getImage());
    }
    /**
     * Pone en la vista los datos de las estadisticas
     *
     * @param j Jugador. Se utiliza para guardar los datos.
     */
    public void setJugador(Jugador j){
        labels[0].setText("Partidas:   " + j.getNum_partidas());
        labels[1].setText("Victorias:  " + j.getNum_victorias());
        labels[2].setText("Media:      " + j.getMedia_victorias());
        labels[3].setText("Puntos:     " + j.getPuntos());
        labels[4].setText("Media:      " + j.getMedia());
    }

    public void setActionListener(ActionListener a) {
        for (JButton b : botones) {
            b.addActionListener(a);
        }
    }

}
