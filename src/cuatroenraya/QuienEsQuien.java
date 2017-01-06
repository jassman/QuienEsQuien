package cuatroenraya;

import CuatroRayaControlador.Controlador;
import CuatroRayaModelo.Jugador;
import CuatroRayaModelo.Modelo;
import CuatroRayaVista.VentanaPrincipal;
import CuatroRayaVista.VistaDificultad;
import CuatroRayaVista.VistaInicio;
import CuatroRayaVista.VistaPersonalizado;

/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class QuienEsQuien {

    /**
     * Constructor del Juego
     *
     * @param j Jugador. Se utiliza para guardar los datos.
     */
    public QuienEsQuien(Jugador j) {
        VentanaPrincipal v = new VentanaPrincipal();
        VistaDificultad d = new VistaDificultad();
        VistaInicio inicio = new VistaInicio();
        VistaPersonalizado person = new VistaPersonalizado();
        Modelo m = new Modelo();
        Controlador c = new Controlador(m, v, inicio, d, j, person);
        inicio.setVisible(true);
        inicio.setSize(1000, 700);
        d.setVisible(false);
        d.setTitle("Dificultad");
        d.setSize(400, 500);
        person.setVisible(false);
        person.setTitle("Nivel personalizado");
        person.setSize(400, 400);
        v.setVisible(false);
        v.setTitle("QUIEN ES QUIEN");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        VistaDificultad d = new VistaDificultad();
        VistaInicio inicio = new VistaInicio();
        VistaPersonalizado person = new VistaPersonalizado();
        Modelo m = new Modelo();
        Jugador j = new Jugador(0, 1, 0);
        Controlador c = new Controlador(m, v, inicio, d, j, person);
        inicio.setVisible(true);
        inicio.setSize(1000, 700);
        d.setVisible(false);
        d.setTitle("Dificultad");
        d.setSize(400, 500);
        person.setVisible(false);
        person.setTitle("Nivel personalizado");
        person.setSize(400, 400);
        v.setVisible(false);
        v.setTitle("QUIEN ES QUIEN");
    }

}
