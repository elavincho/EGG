/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintrop3subprogramas;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class GuiaEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que procese una secuencia de caracteres ingresada 
        //por teclado y terminada en punto, y luego codifique la palabra o frase 
        //ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
        //que se indica en la tabla y el resto de los caracteres (incluyendo a las 
        //vocales acentuadas) se mantienen sin cambios.
        //a   e   i   o   u
        //@   #   $   %   *

        //Realice un subprograma que reciba una secuencia de caracteres y retorne 
        //la codificación correspondiente. Utilice la estructura “según” para la transformación. 
        //Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
        //La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        
        Scanner leer = new Scanner(System.in);
        String texto = " ";
        do {
            System.out.println("Ingrese una frase que termine en un punto");
            texto = leer.nextLine();
            
        }while (!(texto.substring(texto.length()-1).equals(".")));
        
        System.out.println(cambioDigito(texto)); // imprimimos la funcion
        
    }
    public static String cambioDigito (String texto) {
        String concatenar  = " ";
        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i+1).toLowerCase();
            switch (letra) {
                case "a":
                    concatenar += "@";
                    break;
                case "e":
                    concatenar += "#";
                    break;
                case "i":
                    concatenar += "$";
                    break;
                case "o":
                    concatenar += "%";
                    break;
                case "u":
                    concatenar += "*";
                    break;
                default:
                    concatenar = concatenar + letra;
            
        }
        }
        return concatenar;
    }
}
