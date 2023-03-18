
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        //Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        //lo siguiente:
        //  * * * *
        //  *     *
        //  *     *
        //  * * * *

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int tamano = leer.nextInt();
        
        for (int i=0; i<tamano; i++) {
            for (int j=0; j<tamano; j++) {
                if (i == 0) {
                    System.out.print("*");
                }else if (i == tamano-1) {
                    System.out.print("*");
                }else if (j == 0) {
                    System.out.print("*");
                }else if (j == tamano-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
        
    }
    
}
 