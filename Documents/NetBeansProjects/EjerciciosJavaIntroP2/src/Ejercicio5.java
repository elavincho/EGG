
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escriba un programa en el cual se ingrese un valor limite positivo, 
        //y a continuacion solicite numeros al usuario hasta que la suma de 
        //los numeros introducidos supere el limite inicial.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limitepos = leer.nextInt();
                
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = suma + num;
            
        }while (suma <= limitepos);
        System.out.println("La suma de los numeros ingresados es: " + suma);
        
         
        

    }
    
}
