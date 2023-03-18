
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
public class EjercicioExtra7_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realice un programa que calcule y visualice el valor máximo, el valor
        //mínimo y el promedio de n números (n>0). El valor de n se solicitará al
        //principio del programa y los números serán introducidos por el usuario.
        //Realice dos versiones del programa, una usando el bucle “while” y otra
        //con el bucle “do - while”.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea calcular");
        int n = leer.nextInt();
        
        int valorMaximo = 0;
        int valorMinimo = 0;
        double promedio = 0;
        int contador = 0;
        
        while (contador < n) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (num > 0) {
                
                if (contador == 0) {
                    valorMaximo = num;
                    valorMinimo = num;
                }
            
                if (valorMaximo < num) {
                    valorMaximo = num;
                }else if (valorMinimo > num) {
                    valorMinimo = num;
                }
            }
            
            promedio += num;
            contador ++;
            
        }
            promedio /= n;
            System.out.println("El valor maximo es: " + valorMaximo);
            System.out.println("El valor minimo es: " + valorMinimo);
            System.out.println("El promedio es: " + promedio);
    }
    
}
