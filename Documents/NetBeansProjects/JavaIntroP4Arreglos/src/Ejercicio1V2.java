/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elavincho
 */
public class Ejercicio1V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realizar un algoritmo que llene un vector con los 100 primeros números 
        //enteros y los muestre por pantalla en orden descendente.
        
        int[] vector = new int[100];
        
        // Creamos el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 100-i;
        }
        
        // Mostramos el vector 
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }
    
}
