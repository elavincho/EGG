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
public class Ejercicio8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        // Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
        // y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
        
       Scanner leer = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        
        while (nota > 0 && nota <= 10) { 
            
        System.out.println("La nota es correcta");
            
        break;    
            
        } 
        while (nota > 10 || nota < 0) {
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
            
        }
            System.out.println("Bien ahi!!");
            System.out.println("Finalizo el programa");
    }
        
         
        
        
            
 }
        