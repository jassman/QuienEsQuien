package CuatroRayaModelo;
/**
 *
 * @author Javier Alonso y Lucas Nicolini
 */
public class Modelo {

    private final Persona personas[] = new Persona[24];//Contiene las personas de las fotos
    private final int i_sospechoso; //Numero del sospechoso
    private  int puntosIniciales, puntosRestar, 
            pSexo, pOjos, pPelo, pBoca, pNariz, pSombrero, pGafas, pBigote;
    private final Persona sospechoso;
    boolean partida, facil, medio, dificil, personalizado;

    public Modelo() {
        partida = true;
        personas[0] = new Persona("Alex", "Chico", "Moreno", "Marrones", "Pequeña", "Grande", false, false, true);
        personas[1] = new Persona("Alfred", "Chico", "Pelirrojo", "Azules", "Pequeña", "Pequeña", false, false, true);
        personas[2] = new Persona("Anita", "Chica", "Rubio", "Azules", "Pequeña", "Pequeña", false, false, false);
        personas[3] = new Persona("Anne", "Chica", "Moreno", "Marrones", "Mediana", "Pequeña", false, false, false);
        personas[4] = new Persona("Bernard", "Chico", "Castanyo", "Marrones", "Grande", "Mediana", false, true, false);
        personas[5] = new Persona("Bill", "Chico", "Calvo", "Marrones", "Pequeña", "Mediana", false, false, false);
        personas[6] = new Persona("Charles", "Chico", "Rubio", "Verdes", "Pequeña", "Grande", false, false, true);
        personas[7] = new Persona("Claire", "Chica", "Moreno", "Marrones", "Pequeña", "Pequeña", true, true, false);
        personas[8] = new Persona("David", "Chico", "Rubio", "Verdes", "Pequeña", "Mediana", false, false, false);
        personas[9] = new Persona("Eric", "Chico", "Rubio", "Verdes", "Pequeña", "Grande", false, true, false);
        personas[10] = new Persona("Frans", "Chico", "Pelirrojo", "Marrones", "Pequeña", "Pequeña", false, false, false);
        personas[11] = new Persona("George", "Chico", "Canoso", "Marrones", "Pequeña", "Mediana", false, true, false);
        personas[12] = new Persona("Herman", "Chico", "Calvo", "Verdes", "Grande", "Mediana", false, false, false);
        personas[13] = new Persona("Joe", "Chico", "Rubio", "Azules", "Mediana", "Pequeña", true, false, false);
        personas[14] = new Persona("Maria", "Chica", "Castanyo", "Marrones", "Pequeña", "Mediana", false, true, false);
        personas[15] = new Persona("Max", "Chico", "Moreno", "Marrones", "Grande", "Grande", false, false, true);
        personas[16] = new Persona("Paul", "Chico", "Canoso", "Verdes", "Pequeña", "Mediana", true, false, false);
        personas[17] = new Persona("Peter", "Chico", "Canoso", "Azules", "Grande", "Grande", false, false, false);
        personas[18] = new Persona("Philip", "Chico", "Moreno", "Verdes", "Pequeña", "Mediana", false, false, false);
        personas[19] = new Persona("Richard", "Chico", "Calvo", "Marrones", "Pequeña", "Mediana", false, false, true);
        personas[20] = new Persona("Robert", "Chico", "Castanyo", "Azules", "Grande", "Grande", false, false, false);
        personas[21] = new Persona("Sam", "Chico", "Calvo", "Verdes", "Pequeña", "Pequeña", true, false, false);
        personas[22] = new Persona("Susan", "Chica", "Canoso", "Verdes", "Pequeña", "Grande", false, false, false);
        personas[23] = new Persona("Tom", "Chico", "Calvo", "Azules", "Mediana", "Pequeña", true, false, false);

        i_sospechoso = (int) (Math.random() * 23);//Genera un sospechoso aleatorio

        sospechoso = personas[i_sospechoso]; //Guardamos al sospechoso principal
    }

    public boolean Comprobar(String s) {
        partida = false;
        return s.equalsIgnoreCase(sospechoso.getNombre());
    }
    /**
     * @param tipo de pregunta
     * @param s valor de la presgunta
     * @return Acierto o error en la pregunta
     */
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
    /**
     * @param tipo Tipo de pregunta
     * @param s Valor de la pregunta
     * @return Array con el numero de sospechosos actuales
     */
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

        int z[] = new int[j];//Generamos un array con el numero de valores resultante
        System.arraycopy(a, 0, z, 0, j);//Copiamos el array generado

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
 
    public int restarPuntos(){
        puntosIniciales = puntosIniciales - puntosRestar;
        return puntosIniciales;
    }

    public void partidaPersonalizada(){
        /*
        puntosIniciales = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos con los que quieres empezar " ));
        pSexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre el sexo " ));
        pPelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre el pelo " ));
        pOjos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre los ojos " ));
        pBoca = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre la boca " ));
        pNariz = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre la nariz " ));
        pSombrero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre el sombrero " ));
        pGafas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre las gafas " ));
        pBigote = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de puntos que quieres que reste la pregunta sobre el bigote " ));
*/
        
        
    }

    public int getPuntos() {
        return puntosIniciales;
    }

    public void setFacil(boolean facil) {
        this.facil = facil;
    }

    public void setMedio(boolean medio) {
        this.medio = medio;
    }

    public void setDificil(boolean dificil) {
        this.dificil = dificil;
    }

    public void setPersonalizado(boolean personalizado) {
        this.personalizado = personalizado;
    }
    
    public int restarPuntosSexo(){
        
        puntosIniciales = puntosIniciales - pSexo;
        
        return puntosIniciales;
    }
    
    public int restarPuntosPelo(){
        
        puntosIniciales = puntosIniciales - pPelo;
        
        return puntosIniciales;
    }
    
    public int restarPuntosNariz(){
        
        puntosIniciales = puntosIniciales - pNariz;
        
        return puntosIniciales;
    }
    
    public int restarPuntosBoca(){
        
        puntosIniciales = puntosIniciales - pBoca;
        
        return puntosIniciales;
    }
    
    public int restarPuntosGafas(){
        
        puntosIniciales = puntosIniciales - pGafas;
        
        return puntosIniciales;
    }
    
    public int restarPuntosBigote(){
        
        puntosIniciales = puntosIniciales - pBigote;
        
        return puntosIniciales;
    }
    
    public int restarPuntosSombrero(){
        
        puntosIniciales = puntosIniciales - pSombrero;
        
        return puntosIniciales;
    }
    
    public int restarPuntosOjos(){
        
        puntosIniciales = puntosIniciales - pOjos;
        
        return puntosIniciales;
    }

    public boolean getPersonalizado() {
        return personalizado;
    }
    
    public void puntuaciones(int i, int s, int p, int n, int b, int g, int bi, int som, int o){
        puntosIniciales = i;
        pSexo = s;
        pPelo = p;
        pNariz = n;
        pBoca = b;
        pGafas = g;
        pBigote = bi;
        pSombrero = som;
        pOjos = o;
    }
    
}
