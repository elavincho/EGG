
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
public class EjercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene
        una M cantidad de hijos. Escriba un programa que pida la cantidad de
        familias y para cada familia la cantidad de hijos para averiguar la media
        de edad de los hijos de todas las familias.*/

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Familias");
        int familias = leer.nextInt();
        
        int contadorFamilias = 0;
        int contadorHijos = 0;
        int contadorEdad = 0;
        double media = 0;
        int i, j;
        
        for (i = 0; i < familias; i++) {
            
            System.out.println("Ingrese la cantidad de hijos que tiene la familia "+ (i+1));
            int hijos = leer.nextInt();
            contadorHijos += hijos;
            
            for (j = 0; j < hijos; j++) {
                
                System.out.println("Ingrese la edad del hijo " + (j+1));
                int edad = leer.nextInt();
                contadorEdad += edad; 
            }
        }
        media = contadorEdad / contadorHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + media);
    }
}
