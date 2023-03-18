
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
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
        //muestre su equivalente en romano.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        int num = leer.nextInt();
        
        if (num == 1)  {
            System.out.println("El numero " + num + " en numeros Romanos es: I");
        }else if (num == 2) {
            System.out.println("El numero " + num + " en numeros Romanos es: II");
        }else if (num == 3) {
            System.out.println("El numero " + num + " en numeros Romanos es: III");
        }else if (num == 4) {
            System.out.println("El numero " + num + " en numeros Romanos es: IV");
        }else if (num == 5) {
            System.out.println("El numero " + num + " en numeros Romanos es: V");
        }else if (num == 6) {
            System.out.println("El numero " + num + " en numeros Romanos es: VI");
        }else if (num == 7) {
            System.out.println("El numero " + num + " en numeros Romanos es: VII");
        }else if (num == 8) {
            System.out.println("El numero " + num + " en numeros Romanos es: VIII");
        }else if (num == 9) {
            System.out.println("El numero " + num + " en numeros Romanos es: IX");
        }else if (num == 10) {
            System.out.println("El numero " + num + " en numeros Romanos es: X");
        }
    }
    
}
