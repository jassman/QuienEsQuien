/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

/**
 *
 * @author Javier
 */
import CuatroRayaModelo.Jugador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class VistaRanking extends JFrame {

    //private final ImagenGameOver image;
    private final JPanel contenedor;
    private final JPanel contenedor_b;
    private final JPanel contenedor_c;
    private final JLabel[] labels = new JLabel[5];
    private final Border emptyBorder;
    private final JLabel titulo;
    private final JButton[] botones;

    public VistaRanking(Jugador j) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        pack();
        setSize(1000, 700);
        setResizable(false);
        setSize(1000, 700);

        emptyBorder = BorderFactory.createEmptyBorder(20, 30, 20, 0);
        contenedor = new JPanel();
        contenedor_b = new JPanel();
        contenedor_c = new JPanel();
        botones = new JButton[2];

        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBackground(Color.black);

        titulo = new JLabel("RANKING PARTIDAS");
        titulo.setForeground(Color.white);
        titulo.setFont(new Font("Colibri", Font.BOLD, 20));
        titulo.setBorder(BorderFactory.createEmptyBorder(30, 30, 60, 0));
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
    }

    public void setActionListener(ActionListener a) {
        for (JButton b : botones) {
            b.addActionListener(a);
        }
    }

}
