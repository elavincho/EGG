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
public class GuiaEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Creamos la variable tipo scanner para ingresar los datos del usuario
        Scanner leer = new Scanner(System.in);
        // Pedimos al usuario que ingrese dos numeros
        System.out.println("Ingrese 2 numeros");
        // Definimos los numeros
        int num1, num2;
        // Leemos los datos ingresados por el usuario
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        // Determinamos si los numeros son mayores a 25
        System.out.println("Determinamos si los numeros ingresados son mayores a 25");
        if (num1 > 25) {
            System.out.println("El " + num1 + " es mayor a 25.");
        } else {
            System.out.println("El " + num1 + " es menor a 25.");
        }
        
        if (num2 > 25) {
            System.out.println("El " +num2 + " es mayor a 25.");
        } else {
            System.out.println("El " + num2 + " es menor a 25.");
        }
        System.out.println("OTRO METODO");
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("El " + num1 + " y " + num2 + " son mayores a 25!!");
        } else if (num1 < 25 && num2 < 25) {
            System.out.println("El " + num1 + " y " + num2 +  " son menores a 25!! ");
        } else if (num1 > 25 && num2 < 25) {
            System.out.println("El " + num1 + " es mayor a 25 y el " + num2 + " es menor a 25");
        } else if (num1 < 25 && num2 >  25) {
            System.out.println("El " + num1 + " es menor a 25 y el " + num2 + " es mayor a 25");
        } 
        
    }
    
}
