


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
public class Ejercicio2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        
        Scanner leer = new Scanner(System.in);
        String nombre;
       
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Hola " + nombre + " espero que tengas un gran dia!!");
    }
    
}
