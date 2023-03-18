


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
public class Ejercicio5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla 
        //el doble, el triple y la raíz cuadrada de ese número. 
        //Nota: investigar la función Math.sqrt().
        
        Scanner leer = new Scanner(System.in);
        int num;
        int doble;
        int triple;
        double raiz;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);

    }
    
}
