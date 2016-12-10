/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaModelo;

import CuatroRayaVista.VentanaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Modelo {

    private Persona personas[] = new Persona[24];
    private int i_sospechoso, puntosIniciales, puntosRestar;
    private Persona sospechoso;
    boolean partida;

    /*
     ¡¡¡¡¡¡¡FALTA CAMBIAR EL COLOR DE LOS OJOS!!!!!!!
     */
    public Modelo() {

        partida = true;
        personas[0] = new Persona("Alex", "Chico", "Negro", "Marrones", "Pequeña", "Grande", false, false, true);
        personas[1] = new Persona("Alfred", "Chico", "Pelirrojo", "Azules", "Pequeña", "Pequeña", false, false, true);
        personas[2] = new Persona("Anita", "Chica", "Rubio", "Azules", "Pequeña", "Pequeña", false, false, false);
        personas[3] = new Persona("Anne", "Chica", "Negro", "Marrones", "Mediana", "Pequeña", false, false, false);
        personas[4] = new Persona("Bernard", "Chico", "Moreno", "Marrones", "Grande", "Mediana", false, true, false);
        personas[5] = new Persona("Bill", "Chico", "Calvo", "Marrones", "Pequeña", "Mediana", false, false, false);
        personas[6] = new Persona("Charles", "Chico", "Rubio", "Verdes", "Pequeña", "Grande", false, false, true);
        personas[7] = new Persona("Claire", "Chica", "Negro", "Marrones", "Pequeña", "Pequeña", true, true, false);
        personas[8] = new Persona("David", "Chico", "Rubio", "Verdes", "Pequeña", "Mediana", false, false, false);
        personas[9] = new Persona("Eric", "Chico", "Rubio", "Verdes", "Pequeña", "Grande", false, true, false);
        personas[10] = new Persona("Frans", "Chico", "Pelirrojo", "Marrones", "Pequeña", "Pequeña", false, false, false);
        personas[11] = new Persona("George", "Chico", "Canoso", "Marrones", "Pequeña", "Mediana", false, true, false);
        personas[12] = new Persona("Herman", "Chico", "Calvo", "Verdes", "Grande", "Mediana", false, false, false);
        personas[13] = new Persona("Joe", "Chico", "Rubio", "Azules", "Mediana", "Pequeña", true, false, false);
        personas[14] = new Persona("Maria", "Chica", "Moreno", "Marrones", "Pequeña", "Mediana", false, false, false);
        personas[15] = new Persona("Max", "Chico", "Negro", "Marrones", "Grande", "Grande", false, false, true);
        personas[16] = new Persona("Paul", "Chico", "Canoso", "Verdes", "Pequeña", "Mediana", true, false, false);
        personas[17] = new Persona("Peter", "Chico", "Canoso", "Azules", "Grande", "Grande", false, false, false);
        personas[18] = new Persona("Philip", "Chico", "Negro", "Verdes", "Pequeña", "Mediana", false, false, false);
        personas[19] = new Persona("Richard", "Chico", "Calvo", "Marrones", "Pequeña", "Mediana", false, false, true);
        personas[20] = new Persona("Robert", "Chico", "Castanyo", "Azules", "Grande", "Grande", false, false, false);
        personas[21] = new Persona("Sam", "Chico", "Calvo", "Verdes", "Pequeña", "Pequeña", true, false, false);
        personas[22] = new Persona("Susan", "Chica", "Canoso", "Verdes", "Pequeña", "Grande", false, false, false);
        personas[23] = new Persona("Tom", "Chico", "Calvo", "Azules", "Mediana", "Pequeña", true, false, false);

        i_sospechoso = (int) (Math.random() * 23);

        sospechoso = personas[i_sospechoso];

        System.out.println(sospechoso.getSexo());
        System.out.println(sospechoso.getPelo());
        System.out.println(sospechoso.getOjos());
        System.out.println(sospechoso.getNariz());
        System.out.println(sospechoso.getBoca());
        System.out.println(sospechoso.getGafas());
        System.out.println(sospechoso.getSombrero());
        System.out.println(sospechoso.getBigote());
    }

    public void Comprobar(String s) {
        if (s.equalsIgnoreCase(sospechoso.getNombre())) {
            System.out.println("HAS ACERTADO! GANASTE");
        } else {
            System.out.println("FALLASTE! PERDISTE");
        }

        partida = false;
    }

    public boolean respuesta(String tipo, String s) {

        boolean estado = false;
        boolean aux = false;

        switch (tipo) {
            case "sexo":
                if (s.equalsIgnoreCase(personas[i_sospechoso].getSexo())) {
                    estado = true;
                }
                break;

            case "pelo":
                if (s.equalsIgnoreCase(personas[i_sospechoso].getPelo())) {
                    estado = true;
                }
                break;

            case "ojos":
                if (s.equalsIgnoreCase(personas[i_sospechoso].getOjos())) {
                    estado = true;
                }
                break;

            case "boca":
                s = s.substring(1);
                if (s.equalsIgnoreCase(personas[i_sospechoso].getBoca())) {
                    estado = true;
                }
                break;

            case "nariz":
                s = s.substring(1);
                if (s.equalsIgnoreCase(personas[i_sospechoso].getNariz())) {
                    estado = true;
                }
                break;

            case "gafas":
                if (s.equalsIgnoreCase("SiGafas")) {
                    aux = true;
                }
                if (aux == personas[i_sospechoso].getGafas()) {
                    estado = true;
                }
                break;

            case "sombrero":
                if (s.equalsIgnoreCase("SiSombrero")) {
                    aux = true;
                }
                if (aux == personas[i_sospechoso].getSombrero()) {
                    estado = true;
                }
                break;

            case "bigote":
                if (s.equalsIgnoreCase("SiBigote")) {
                    aux = true;
                }
                if (aux == personas[i_sospechoso].getBigote()) {
                    estado = true;
                }
                break;
        }
        return estado;
    }

    public int[] eliminar(String tipo, String s) {
        int a[] = new int[24];
        int j = 0;
        switch (tipo) {
            case "sexo":
                if (s.equalsIgnoreCase(personas[i_sospechoso].getSexo())) {
                    for (int i = 0; i < 24; i++) {
                        if (!s.equalsIgnoreCase(personas[i].getSexo())) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (s.equalsIgnoreCase(personas[i].getSexo())) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

            case "pelo":
                if (s.equalsIgnoreCase(personas[i_sospechoso].getPelo())) {
                    for (int i = 0; i < 24; i++) {
                        if (!s.equalsIgnoreCase(personas[i].getPelo())) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (s.equalsIgnoreCase(personas[i].getPelo())) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

            case "ojos":
                if (s.equalsIgnoreCase(personas[i_sospechoso].getOjos())) {
                    for (int i = 0; i < 24; i++) {
                        if (!s.equalsIgnoreCase(personas[i].getOjos())) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (s.equalsIgnoreCase(personas[i].getOjos())) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

            case "boca":
                s = s.substring(1);
                if (s.equalsIgnoreCase(personas[i_sospechoso].getBoca())) {
                    for (int i = 0; i < 24; i++) {
                        if (!s.equalsIgnoreCase(personas[i].getBoca())) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (s.equalsIgnoreCase(personas[i].getBoca())) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

            case "nariz":
                s = s.substring(1);
                if (s.equalsIgnoreCase(personas[i_sospechoso].getNariz())) {
                    for (int i = 0; i < 24; i++) {
                        if (!s.equalsIgnoreCase(personas[i].getNariz())) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (s.equalsIgnoreCase(personas[i].getNariz())) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

            case "gafas":
                if (personas[i_sospechoso].getGafas()) {
                    for (int i = 0; i < 24; i++) {
                        if (!personas[i].getGafas()) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (personas[i].getGafas()) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

            case "sombrero":
                if (personas[i_sospechoso].getSombrero()) {
                    for (int i = 0; i < 24; i++) {
                        if (!personas[i].getSombrero()) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (personas[i].getSombrero()) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

            case "bigote":
                if (personas[i_sospechoso].getBigote()) {
                    for (int i = 0; i < 24; i++) {
                        if (!personas[i].getBigote()) {
                            a[j] = i;
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < 24; i++) {
                        if (personas[i].getBigote()) {
                            a[j] = i;
                            j++;
                        }
                    }
                }
                break;

        }

        int z[] = new int[j];
        for (int y = 0; y < j; y++) {
            z[y] = a[y];
        }

        return z;
    }

    public boolean getPartida() {
        return partida;
    }

    public void partidaFacil() {
        puntosIniciales = 20;
        puntosRestar = 1;
    }

    public void partidaMedia() {
        puntosIniciales = 20;
        puntosRestar = 3;
    }

    public void partidaDificil() {
        puntosIniciales = 20;
        puntosRestar = 5;
    }

    public int restarPuntos() {
        puntosIniciales = puntosIniciales - puntosRestar;

        return puntosIniciales;
    }

    public void partidaPersonalizada() {
        puntosIniciales = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos con los que quieres empezar "));
        puntosRestar = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste cada pregunta "));
    }

    public int getPuntos() {
        return puntosIniciales;
    }

}
