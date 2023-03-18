
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          // TODO code application logic here
        
        //Realizar un programa que pida dos números enteros positivos por teclado 
        //y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
        //opción y el programa deberá mostrar el resultado por pantalla y luego 
        //volver al menú. El programa deberá ejecutarse hasta que se elija la 
        //opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
        //en vez de salir del programa directamente, se debe mostrar el siguiente 
        //mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
        //Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
        //contrario se vuelve a mostrar el menú.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int opcion;
        String respuesta;
        respuesta = "N";
        boolean bucle = true;
  
        
        do {
           System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt(); 
            
            switch(opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Estas seguro que deseas salir del programa? (S/N)");
                    respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")){
                        System.out.println("Salio del programa");
                        bucle = false;
                    }
                    break;
                }
                
        }while (bucle);
            
                
            
    }
}
                