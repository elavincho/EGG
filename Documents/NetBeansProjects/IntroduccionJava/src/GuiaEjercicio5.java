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
public class GuiaEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Variable tipo boolean y double");
        
        // Creamos la variable tipo scanner para ingresar los datos del usuario
        Scanner leer = new Scanner(System.in);
        System.out.println("La variable tipo double es un numero decimal de presicion doble");
        //Pedimos por pantalla al usuario que ingrese 2 numeros
        System.out.println("Ingrese dos numeros");
        // Creamos las variables de tipo entero
        double num1, num2;
        //Leemos los numeros ingresados por el usuario
        num1 = leer.nextDouble();
        num2 = leer.nextDouble();
        // Definimos la variable tipo boolean
        boolean igualdad;
        igualdad = num1 == num2;
        //Imprimimos los valores por pantalla
        System.out.println("La variable tipo boolean(logico) da solo valores verdadero y falso");
        System.out.println("El numero " + num1 + " = " + num2 + " ?? "+ igualdad);
        System.out.println("Nota: Los numeros al estar definidos como double el sistema los convierte automaticamente");
        // Variable tipo char. La variable tipo char es un SOLO caracter.
        // que va entre comillas simples
        
        System.out.println("Variable tipo Char");
        
        char caracter = 'a';
        char caracter2 = 'b';
        char caracter3 = 'c';
        
        System.out.println("La variable tipo char es un SOLO caracter");
        System.out.println(caracter);
        System.out.println(caracter2);
        System.out.println(caracter3);
        
        
     
        
        
    }
    
}
