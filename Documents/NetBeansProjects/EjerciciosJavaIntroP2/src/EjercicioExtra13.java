
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
public class EjercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crear un programa que dibuje una escalera de números, donde cada
        línea de números comience en uno y termine en el número de la línea.
        Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
        ingresa el número 3:
        1
        12
        123*/ 

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera de numeros");
        int num = leer.nextInt();
        
        int i;
        int j;
        
        for (i = 0; i < num; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}
