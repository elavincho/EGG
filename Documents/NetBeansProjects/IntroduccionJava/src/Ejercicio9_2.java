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
public class Ejercicio9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // Escriba un programa que lea 20 números. Si el número leído es igual a cero se
    //debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
    //programa deberá calcular y mostrar el resultado de la suma de los números
    //leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
    //de la sentencia break.
        
    Scanner leer = new Scanner(System.in);
    int num;
    int i= 0;
    int suma = 0;
    
    do {
        System.out.println("Ingrese un numero " + i++); 
        num = leer.nextInt();
        suma = suma + num;
        
        
    }while (num != 0 && i != 20);
        {
        System.out.println("Se capturo el numero 0");
        suma += num;
        System.out.println("La suma de los numeros ingresados es: " + suma);
        
    }
    
 
    
          
    }
    
}
