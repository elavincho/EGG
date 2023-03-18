
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elavincho
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realizar un programa que simule el funcionamiento de un dispositivo
        //RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
        //cadenas deben llegar con un formato fijo: tienen que ser de un máximo
        //de 5 caracteres de largo, el primer carácter tiene que ser X y el último
        //tiene que ser una O.
        //Las secuencias leídas que respeten el formato se consideran correctas,
        //la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
        //FDE), y toda secuencia distinta de FDE, que no respete el formato se
        //considera incorrecta.
        //Al finalizar el proceso, se imprime un informe indicando la cantidad de
        //lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
        //deberá investigar cómo se utilizan las siguientes funciones de Java
        //Substring(), Length(), equals().
        
        Scanner leer = new Scanner(System.in);
        
        boolean bollong;
        boolean bolini;
        boolean bolfin;
        boolean bolcorrec;
        
        String palabra;
        int contadorbien = 0;
        int contadormal = 0;
        
        System.out.println("Dispositivo RS232");
        System.out.println("CONDICIONES:");
        System.out.println("Hasta 5 caracteres.");
        System.out.println("Primer caracter: X ");
        System.out.println("Ultimo caracter: O ");
        System.out.println("Salir: &&&&& ");
        
        do { 
            System.out.println("Ingrese una palabra");
            palabra = leer.next();
            int longitud = palabra.length();
            bollong = longitud <= 5;
            bolini = palabra.startsWith("X");
            bolfin = palabra.endsWith("O");
            
            if (bollong && bolini && bolfin) {
                System.out.println("La cadena es correcta");
                contadorbien = contadorbien + 1;
            }else {
                System.out.println("La cadena es incorrecta");
                contadormal = contadormal + 1;
            }
            continue;
        }while (!(palabra.equals("&&&&&")));
        System.out.println("La cantidad de ingresos correctos es: " + contadorbien);
        System.out.println("La cantidad de ingresos incorrectos es: " + contadormal);
        System.out.println("Salio del programa");
        
    }
    
}
