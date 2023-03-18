/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintrop3subprogramas;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crea una aplicación que le pida dos números al usuario y este pueda 
        //elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        //tener una función para cada operación matemática y deben devolver sus 
        //resultados para imprimirlos en el main.
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        int opcion;
        boolean bucle = true;
        String respuesta;
        respuesta = "N";
        
        int retornosuma = sumar(num1, num2);
        int retornoresta = restar(num1, num2);
        int retornomultiplicacion = multiplicar(num1, num2);
        double retornodivision;
        retornodivision = dividir(num1, num2);
        
        do {
            
            System.out.println("Ingrese la operacion que desea realizar");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multipicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + retornosuma); //hacer funcion suma e imprimimos la funcion
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + retornoresta); // hacer funcion resta e imprimimos la funcion
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + retornomultiplicacion); // hacer funcion multiplicacion e imprimimos la funcion
                    break;
                case 4:
                    System.out.println("La division de los numeros es: " + retornodivision); // hacer la funcion division e imprimimos la funcion
                    break;
                case 5:
                    System.out.println("Estas seguro que desea salir del programa? (S/N)");
                        respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Salio del programa");
                        bucle = false;
                    }
                    break;
            }
            
        }while(bucle);
     
    }

public static int sumar(int num1, int num2) {
    
    int suma;
    suma = num1 + num2;
    return suma;
}

public static int restar(int num1, int num2) {
    int resta;
    resta = num1-num2;
    return resta;
}

public static int multiplicar(int num1, int num2) {
    int multiplicacion;
    multiplicacion = num1*num2;
    return multiplicacion;
}

public static double dividir(int num1, int num2) {
    double division;
    division = (num1/num2);
    return division;
}
    
}
    


