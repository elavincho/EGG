
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
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
        //trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
        //la función equals() de la clase String.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
         
        if (letra.equalsIgnoreCase("A")){
            System.out.println("Es una vocal");
        }else if (letra.equalsIgnoreCase("E")){
            System.out.println("Es una vocal");
        }else if (letra.equalsIgnoreCase("I")){
            System.out.println("Es una vocal");
        }else if (letra.equalsIgnoreCase("O")){
            System.out.println("Es una vocal");
        }else if (letra.equalsIgnoreCase("U")){
            System.out.println("Es una vocal");
        }else {
            System.out.println("Es una consonante");
        }
    }
    
}
