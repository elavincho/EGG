/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.EjerciciosGuia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author elavincho
 */
public class EjercicioColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* LISTAS:*/
        System.out.println("LISTAS");
        
        ArrayList<Integer> numerosA = new ArrayList(); //Lista de tipo Integer
        int x = 20;
        numerosA.add(x);    //Agregamos el numero 20 a la lista en la posicion 0
        System.out.println("numerosA = " + numerosA);
        System.out.println("Eliminamos el elemento");
        numerosA.remove(0); // Eliminamos por indice
        
        ArrayList<Double> numerosB = new ArrayList();
        double b = 10.86;
        numerosB.add(b);
        System.out.println("numerosB = " + numerosB);
        System.out.println("Eliminamos el elemento");
        numerosB.remove(10.86); // Eliminamos por elemento
        System.out.println("");
        
        ArrayList<Long> numerosC = new ArrayList();
        long c = 43344334;
        numerosC.add(c);
        System.out.println("numerosC = " + numerosC);
        System.out.println("Eliminamos el elemento");
        numerosC.remove(c); //Eliminamos por elemento
        System.out.println("");
        
        ArrayList<Character> letraD = new ArrayList();
        char d = 'a';
        letraD.add(d);
        System.out.println("LetraD = " + letraD);
        System.out.println("Eliminamos el elemento");
        letraD.remove(0); // Eliminamos por indice
        System.out.println("");
        
        ArrayList<Boolean> logicoE = new ArrayList();
        boolean e = true;
        logicoE.add(e);
        System.out.println("logicoE = " + logicoE);
        System.out.println("Eliminamos el elemento");
        logicoE.remove(0); // Eliminamos por indice
        System.out.println("logicoE = " + logicoE);
        System.out.println("");
        
        //CONJUNTOS
        System.out.println("CONJUNTOS");
        System.out.println("");    
        
        HashSet<Integer> numerosF = new HashSet();
        Integer f = 20;
        numerosF.add(f);
        System.out.println("numerosF = " + numerosF);
        System.out.println("Eliminamos el elemento");
        numerosF.remove(20); // Los conjuntos solo se puede eliminar por elemento
        System.out.println("numerosF = " + numerosF);
        System.out.println("");
        
        HashSet<Double> numerosG = new HashSet();
        Double g = 19.43;
        numerosG.add(g);
        System.out.println("numerosG = " + numerosG);
        System.out.println("Eliminamos el elemento");
        numerosG.remove(19.43); // Los conjuntos solo se pueden eliminar por elemento
        System.out.println("numerosG = " + numerosG);
        System.out.println("");
        
        HashSet<Long> numerosH = new HashSet();
        long h = 6556545;
        numerosH.add(h);
        System.out.println("numerosH = " + numerosH);
        System.out.println("Eliminamos el elemento");
        numerosH.remove(6556545); // Los conjuntos solo se puede eliminar por elemento
        System.out.println("numerosH = " + numerosH);
        System.out.println("");
        
        HashSet<Character> letraI = new HashSet();
        Character i = 'a';
        letraI.add(i);
        System.out.println("letraI = " + letraI);
        System.out.println("Eliminamos el elemento");
        letraI.remove('a'); // Los conjuntos solo se pueden eliminar por elemento
        System.out.println("letraI = " + letraI);
        System.out.println("");
        
        HashSet<Boolean> logicoJ = new HashSet();
        Boolean j = true;
        logicoJ.add(j);
        System.out.println("logicoJ = " + logicoJ);
        System.out.println("Eliminamos el elemento");
        logicoJ.remove(true); //Los conjuntos solo se pueden eliminar por elemento
        System.out.println("logicoJ = " + logicoJ);
        System.out.println("");
        
        //Mapas
        System.out.println("MAPAS");
        System.out.println("");
        
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 1234567;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        System.out.println("alumnos = " + alumnos);
        System.out.println("Eliminamos el elemento");
        alumnos.remove(1234567); // En los mapas solo se puede eliminar la llave
        System.out.println("alumnos = " + alumnos);
        System.out.println("");
        
        HashMap<Double, Character> depto = new HashMap();
        double uf = 10.0;
        char letra = 'A';
        depto.put(uf, letra);
        System.out.println("depto = " + depto);
        System.out.println("Eliminamos el elemento");
        depto.remove(10.0); //En los mapas solo se puede eliminar la llave
        System.out.println("depto = " + depto);
        System.out.println("");
        
        HashMap<Long, Boolean> nroReal = new HashMap();
        long nro = 2345;
        boolean real = true;
        nroReal.put(nro, real);
        System.out.println("nroReal = " + nroReal);
        System.out.println("Eliminamos el elemento");
        depto.remove(nro, real); //En los mapas solo se puede eliminar la llave **
        System.out.println("nroReal = " + nroReal);
        System.out.println("");
        
        
        
        
        
        
    }
    
}
