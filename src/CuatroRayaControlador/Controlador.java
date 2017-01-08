package CuatroRayaControlador;

import CuatroRayaModelo.Jugador;
import CuatroRayaModelo.Modelo;
import CuatroRayaVista.ElegirColor;
import CuatroRayaVista.VentanaPrincipal;
import CuatroRayaVista.VistaDificultad;
import CuatroRayaVista.VistaGanar;
import CuatroRayaVista.VistaInicio;
import CuatroRayaVista.VistaPerder;
import CuatroRayaVista.VistaPersonalizado;
import CuatroRayaVista.VistaRanking;
import cuatroenraya.QuienEsQuien;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 * @author Javier Alonso y Lucas Nicolini
 */
public class Controlador {

    private final VentanaPrincipal vista;
    private final Modelo modelo;
    private final Jugador j;
    private int puntos, ok;
    private final VistaInicio inicio;
    private final VistaDificultad d;
    private final VistaGanar v_ganar;
    private final VistaPerder v_perder;
    private final VistaRanking v_ranking;
    private ElegirColor color;
    private Color c, g;
    private final VistaPersonalizado personalizado;

    public Controlador(Modelo modelo, VentanaPrincipal vista, VistaInicio inicio, VistaDificultad d, Jugador j, VistaPersonalizado personalizado) {
        this.vista = vista;
        this.modelo = modelo;
        this.inicio = inicio;
        this.d = d;
        this.j = j;
        this.personalizado = personalizado;
        /**
         * Crea vistas auxiliares
         */
        v_ganar = new VistaGanar();
        v_perder = new VistaPerder();
        v_ranking = new VistaRanking(j);

        /**
         * Añade listeners a las vistas
         */
        v_ranking.setActionListener(new ListenerVistaPerder());
        v_ganar.setActionListener(new ListenerVistaPerder());
        v_perder.setActionListener(new ListenerVistaPerder());
        vista.setActionListenerAsesino(new Comprobacion());
        vista.setActionListenerBotones1(new Opciones());
        vista.setActionListenerBotones2(new SubOpciones());
        vista.setActionListenerMenu(new Menu());
        vista.addWindowListener(new WindowListener());
        inicio.setActionListenerPrincipal(new Principal());
        inicio.addWindowListener(new WindowListener());
        d.setActionListener(new Dificultad());
        d.addWindowListener(new WindowListener());
        personalizado.setActionListener(new Personalizado());
        personalizado.addWindowListener(new WindowListener());
    }

    /**
     * Validacion de los puntos de la partida, y determina si pierde (Puede ir
     * en Jugador)
     */
    public void validaPartida() {
        if (puntos <= 0) { //Si los puntos son iguales o menos a cero pasa lo siguiente
            vista.setVisible(false); //Ponemos la vista de juego a falso
            v_perder.setVisible(true); //Ponemos la vista de perdedor a verdadero
        }
    }
    
    /**
     * Clase para parar la ejecucion del programa al cerrar las ventanas
     */
    class WindowListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println(" QEQ : Cerrar ventana.");
            System.exit(0); //Para la ejecucion del programa cuando le damos a cerrar ventana
        }
    }

    /*
     * Listeners para la vista Perder
     */
    class ListenerVistaPerder implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();
            switch (opcion) {
                case "Volver a jugar":
                    j.setNum_partidas(j.getNum_partidas() + 1); //Aumentamos en uno el numero de partidas
                    v_perder.setVisible(false); //Ponemos la vista de perdedor a falso
                    v_ranking.setVisible(false); //Ponemos la vista de ganador a falso
                    v_ganar.setVisible(false);
                    QuienEsQuien q = new QuienEsQuien(j); //Creamos una nueva partida llamando a la clase principal
                    break;
                case "Ver Ranking":
                    v_perder.setVisible(false); //Ponemos la vista de perdedor a falso
                    v_ranking.setJugador(j); //Le pasamos al ranking del jugador j
                    v_ranking.setVisible(true); //Ponemos la vista del ranking a verdadero
                    break;
                case "Salir":
                    System.exit(0); //Paramos la ejecucion del programa
                    break;
            }

        }
    }

    /**
     * Clase que comprueba si la solucion es la correcta
     */
    class Comprobacion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();
            ok = JOptionPane.showConfirmDialog(null,
                    "Estas seguro que esta es tu respuesta final?",
                    "Seleccione la opcion deseada",
                    JOptionPane.YES_NO_OPTION); //Mensaje que aparece al pincharle a un sospechoso

            if (ok == 0) { //Si el usuario le da a que si ocurre lo siguiente
                vista.setVisible(false); //Ponemos la vista de juego a false
                if (modelo.Comprobar(opcion)) { //Comprobamos la opcion si has acertado ocurre lo siguiente
                    j.setNum_victorias(j.getNum_victorias() + 1); //Aumentamos en uno el numero de victorias
                    j.setPuntos(j.getPuntos() + puntos); //Se suman los puntos de esta partida a los acumulados de las partidas ganadas anteriormente
                    v_ganar.setVisible(true); //Ponemos la vista de ganador a verdadero
                } else { //Sino
                    v_perder.setVisible(true); //Ponemos la vista de perdedor a verdadero
                }

            }
        }
    }
    
    /**
     * Listeners de las opciones de las preguntas 
     */
    class Opciones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();

            switch (opcion) {
                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Sexo":
                    vista.opSexo();
                    break;
                    
                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Pelo":
                    vista.opPelo();
                    break;

                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Ojos":
                    vista.opOjos();
                    break;

                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Nariz":
                    vista.opNariz();
                    break;

                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Boca":
                    vista.opBoca();
                    break;

                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Gafas":
                    vista.opGafas();
                    break;

                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Sombrero":
                    vista.opSombrero();
                    break;

                /**
                * Al pinchar en una opcion muestra sus subopciones
                */
                case "Bigote":
                    vista.opBigote();
                    break;
            }
        }
    }

    /**
     * Clase para elegir la dificultad del juego
     */
    class Dificultad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();

            switch (opcion) {
                /**
                * Ponemos el nivel de partida
                * Guardamos los puntos en una variable
                * Le pasamos a la vista los puntos para que los muestre
                * Ponemos todas las otras dificultades que no hemos elegido a falso
                * Ponemos a falso la vista de la dificultad
                * Ponemos a verdadero la vista de juego
                */
                case "Facil":
                    modelo.partidaFacil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    modelo.setFacil(true);
                    modelo.setMedio(false);
                    modelo.setDificil(false);
                    modelo.setPersonalizado(false);
                    d.setVisible(false);
                    vista.setVisible(true);

                    break;
                
                /**
                * Ponemos el nivel de partida
                * Guardamos los puntos en una variable
                * Le pasamos a la vista los puntos para que los muestre
                * Ponemos todas las otras dificultades que no hemos elegido a falso
                * Ponemos a falso la vista de la dificultad
                * Ponemos a verdadero la vista de juego
                */
                case "Media":
                    modelo.partidaMedia();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    modelo.setFacil(false);
                    modelo.setMedio(true);
                    modelo.setDificil(false);
                    modelo.setPersonalizado(false);
                    d.setVisible(false);
                    vista.setVisible(true);

                    break;
                
                /**
                * Ponemos el nivel de partida
                * Guardamos los puntos en una variable
                * Le pasamos a la vista los puntos para que los muestre
                * Ponemos todas las otras dificultades que no hemos elegido a falso
                * Ponemos a falso la vista de la dificultad
                * Ponemos a verdadero la vista de juego
                */
                case "Dificil":
                    modelo.partidaDificil();
                    puntos = modelo.getPuntos();
                    vista.setText(puntos);
                    modelo.setFacil(false);
                    modelo.setMedio(false);
                    modelo.setDificil(true);
                    modelo.setPersonalizado(false);
                    d.setVisible(false);
                    vista.setVisible(true);
                    break;
                
                /**
                * Ponemos el nivel de partida
                * Guardamos los puntos en una variable
                * Le pasamos a la vista los puntos para que los muestre
                * Ponemos todas las otras dificultades que no hemos elegido a falso
                * Ponemos a falso la vista de la dificultad
                * Ponemos a verdadero la vista de juego
                */
                case "Personalizada":

                    personalizado.setVisible(true);
                    d.setVisible(false);
                    modelo.setFacil(false);
                    modelo.setMedio(false);
                    modelo.setDificil(false);
                    modelo.setPersonalizado(true);
                    d.setVisible(false);

                    break;

            }
        }
    }

    /**
     * Listener para Vista Principal de PanelBotones3 (Botones de eleccion de eliminacion de personas)
     */
    class SubOpciones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();
            int[] eliminados;
            switch (opcion) {
                case "Chico":
                case "Chica":
                    vista.respuesta(modelo.respuesta("sexo", opcion));//Generamos un Cierto o Falso
                    vista.eliminaSospechosos(modelo.eliminar("sexo", opcion));//Elimina sospechosos de la vista
                    vista.bloquearBoton(opcion);//Bloquea botones que no deben ser pulsados ya
                    /* Cargamos los puntos por defecto o personalizado */
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosSexo();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    vista.bloquearBoton("Chico");
                    vista.bloquearBoton("Chica");
                    validaPartida();//Validamos los puntos de partida

                    break;

                case "Rubio":
                case "Moreno":
                case "Castaño":
                case "Pelirrojo":
                case "Canoso":
                case "Calvo":
                    vista.respuesta(modelo.respuesta("pelo", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("pelo", opcion));
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosPelo();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    vista.bloquearBoton(opcion);
                    validaPartida();
                    break;

                case "Azules":
                case "Verdes":
                case "Marrones":

                    vista.respuesta(modelo.respuesta("ojos", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("ojos", opcion));
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosOjos();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    vista.bloquearBoton(opcion);
                    validaPartida();

                    break;

                case "NGrande":
                case "NMediana":
                case "NPequeña":

                    vista.respuesta(modelo.respuesta("nariz", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("nariz", opcion));
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosNariz();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }

                    vista.bloquearBoton(opcion);
                    validaPartida();
                    break;

                case "BGrande":
                case "BMediana":
                case "BPequeña":

                    vista.respuesta(modelo.respuesta("boca", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("boca", opcion));
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosBoca();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }

                    vista.bloquearBoton(opcion);
                    validaPartida();
                    break;

                case "SiGafas":
                case "NoGafas":

                    vista.respuesta(modelo.respuesta("gafas", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("gafas", opcion));
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosGafas();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    vista.bloquearBoton("SiGafas");
                    vista.bloquearBoton("NoGafas");
                    validaPartida();
                    break;

                case "SiSombrero":
                case "NoSombrero":

                    vista.respuesta(modelo.respuesta("sombrero", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("sombrero", opcion));
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosSombrero();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    vista.bloquearBoton("SiSombrero");
                    vista.bloquearBoton("NoSombrero");
                    validaPartida();
                    break;

                case "SiBigote":
                case "NoBigote":
                    vista.respuesta(modelo.respuesta("bigote", opcion));
                    vista.eliminaSospechosos(modelo.eliminar("bigote", opcion));
                    if (modelo.getPersonalizado()) {
                        puntos = modelo.restarPuntosBigote();
                        vista.setText(puntos);
                    } else {
                        puntos = modelo.restarPuntos();
                        vista.setText(puntos);
                    }
                    vista.bloquearBoton("SiBigote");
                    vista.bloquearBoton("NoBigote");
                    validaPartida();
                    break;
            }
        }
    }
    
    /**
     * Listener para empezar a jugar 
     */
    class Principal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();
            switch (opcion) {

                case "JUGAR":
                    vista.setVisible(false); //Ponemos la vista de juego a falso
                    d.setVisible(true); //Ponemos la vista de el nivel de dificultad a true
                    inicio.setVisible(false); //Ponemos la vista de inicio a falso
                    break;
            }
        }
    }
    
    /**
     * Listeners de los menus 
     */
    class Menu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();

            switch (opcion) {
                case "Ayuda":
                    /**
                    * Mostramos mensaje de ayuda
                    */
                    JOptionPane.showMessageDialog(null, "-El usuario debe jugar el rol de detective, haciendo preguntas al sistema sobre "
                            + "los rasgos físicos del asesino. \n" + "-Cada pregunta que haga el usuario será respondida por un SI o un NO por "
                            + "el sistema. \n" + "-Conforme el sistema va "
                            + "respondiendo las preguntas, se van eliminando automáticamente los sospechosos que no concuerdan con "
                            + "los rasgos del asesino.\n" + "-Cada pregunta que haga el usuario implica un descuento de puntos. \n" + "-El jugador solo "
                            + "gana si descubre al asesino con más de 0 puntos en su cuenta. \n");

                    break;

                case "Volver a empezar":
                    vista.setVisible(false); //Ponemos la vista del juego en falso
                    j.setNum_partidas(j.getNum_partidas()+1); //Aumentamos el numero de partidas en 1
                    v_perder.setVisible(false); //Ponemos la vista de perdedor en falso
                    QuienEsQuien q = new QuienEsQuien(j); //Creamos nueva partida
                    break;

                case "Cambiar color de fondo":
                    color = new ElegirColor(); //Elegimos el color que queremos en una paleta
                    c = color.getColor(); //Guardamos el color en una variable
                    vista.setColorFondo(c); //Le pasamos el color a la vista para que se cambie de color el fondo
                    break;

                case "Cambiar color de foco":
                    color = new ElegirColor(); //Elegimos el color que queremos en una paleta
                    g = color.getColor(); //Guardamos el color en una variable
                    vista.setColorFoco(g); //Le pasamos el color a la vista para que se cambie de color del foco
                    break;

                case "Salir":
                    System.exit(0); //Para la ejecucion del programa
                    break;

            }
        }
    }
    
    /**
     * Clase para juego personalizado 
     */
    class Personalizado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String opcion = a.getActionCommand();

            switch (opcion) {
                case "Aceptar":
                    /**
                    * Guardamos las puntuaciones de cada pregunta en variables
                    */
                    int iniciales = personalizado.getPIniciales();
                    int sexo = personalizado.getPSexo();
                    int pelo = personalizado.getPPelo();
                    int nariz = personalizado.getPNariz();
                    int boca = personalizado.getPBoca();
                    int gafas = personalizado.getPGafas();
                    int bigote = personalizado.getPBigote();
                    int sombrero = personalizado.getPSombrero();
                    int ojos = personalizado.getPOjos();
                    /**
                    * Pasamos esas variables al modelo
                    */
                    modelo.puntuaciones(iniciales, sexo, pelo, nariz, boca, gafas, bigote, sombrero, ojos);
                    puntos = modelo.getPuntos(); //Guardamos en una variable los puntos de inicio
                    vista.setText(puntos); //Le pasamos a la vista el numeno de puntos de inicio
                    personalizado.setVisible(false); //Ponemos la ventana de dificultad personalizada a falso
                    vista.setVisible(true); //Ponemos la ventana de juego a true
                    break;
            }
        }
    }

}
