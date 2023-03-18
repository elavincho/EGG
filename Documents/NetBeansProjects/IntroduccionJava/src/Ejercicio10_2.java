/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
        //imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        //5 *****
        //3 ***
        //11 ***********
        //2 **

        
        Scanner leer = new Scanner(System.in);
        int i = 0;
        
        do { 
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            
            if (num > 1 && num < 20) {
                System.out.print(num); // Imprimimos el nro sin el salto de linea
                for (int j = 0; j < num; j++) {
                    System.out.print("*");} // imprimimos el asterisco sin el salto de linea
                    System.out.println("");
                    i = i + 1;
                } else {
                continue;
            }
        }while (i < 4);
         
    }
    
}
