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
public class Ejercicio6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Imlementar un programa que pida dos numeros enteros al usuario y
        // determne si ambos o alguno es mayor a 25.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enterios");
        int num1, num2;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("Determinamos si los numeros ingresados son mayores o");
        System.out.println("menores a 25.");
        if (num1 < 25) {
            System.out.println("El primer numero es menor a 25.");
        } else {
            System.out.println("El primer numero es mayor a 25.");
        }
        if (num2 < 25) {
            System.out.println("El segundo numero es menor a 25.");
        } else {
            System.out.println("El segundo numero es mayor a 25.");
        }
        
        
                
    }
    
}
