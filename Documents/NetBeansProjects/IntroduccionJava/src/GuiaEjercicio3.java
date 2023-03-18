/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author elavincho
 */
public class GuiaEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Operadores Aritmeticos
        // Operador suma
        System.out.println("Los valores de num1 = 21 y num2 = 65");
        System.out.println("Operadores Aritmeticos");
        int num1, num2;
        num1 = 21;
        num2 = 65;
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " = " + suma);
        
        // Operador Multiplicacion
        
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicacion de " + num1 + " x " + num2 + " = " + multiplicacion);
        
        // Operadores Unitarios
      
        System.out.println("Operadores Unitarios");
        num1++;
        num2++;
        System.out.println("Operador de incremento  " + num1);
        System.out.println("Operador de Decremento  " + num2);
        
        // Operadores de Igualdal y Relacional
        System.out.println("Operadores Igualdad y Relacional");
        //Operador Distinto
        boolean relacional;
        relacional = num1 != num2;
        System.out.println("Operador Distinto. num1 != num2 ??  " + relacional);
        //Operador Desigualdad
        boolean desigualdad; 
        desigualdad = num1 < num2;
        System.out.println("Operador Desigualdad. num1 < num2 ??  " + desigualdad);
        
        
        
        
    }
    
}
