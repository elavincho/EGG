
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
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Simular la división usando solamente restas. Dados dos números enteros
        mayores que uno, realizar un algoritmo que calcule el cociente y el
        residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
        obtener un resultado menor que el divisor, este resultado es el residuo, y
        el número de restas realizadas es el cociente.
        
        Por ejemplo: 50 / 13:
        
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
        3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas
        sucesivas.*/
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        do {
            
            System.out.println("Ingrese 2 numeros enteros mayores a 1.");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            
        }while (num1 < 0 || num2 < 0);
            int cociente = 0;
            
        while (num1 > num2) {
            num1 -= num2;
            cociente++;
            System.out.println(num1 + " - " + num2 + " = " + num1);
        }
        
        System.out.println("Dado que " + num1 + " es menor que " + num2 + " el residuo es " + num1 + " y el cociente es " + cociente + ".");

        
    }
    
}
