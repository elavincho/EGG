
import java.util.Random;
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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Recorrer un vector de N enteros contabilizando cuántos números son de 
        //1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        
        Scanner leer = new Scanner(System.in);
        Random llenar = new Random();
        
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        
        int[] vector = new int[tamano];
        // Creamos el vector
        for (int i = 0; i < tamano; i++) {
            vector[i] = llenar.nextInt(15000); //aleatorio hasta 15000
        }
        //Mostramos el vector 
        for (int i= 0; i < tamano; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        //Contabilizamos la cantidad de digitos
        String cantDigitos;
        int unDig = 0;
        int dosDig = 0;
        int tresDig = 0;
        int cuatroDig = 0;
        int cincoDig = 0;
        
        for (int i = 0; i < tamano; i++) {
            cantDigitos = String.valueOf(vector[i]);
            switch (cantDigitos.length()) {
                case 1:
                    unDig += 1;
                    break;
                case 2:
                    dosDig += 1;
                    break;
                case 3:
                    tresDig += 1;
                    break;
                case 4:
                    cuatroDig += 1;
                    break;
                case 5:
                    cincoDig += 1;
                    break;
                    
            }
        }
        System.out.println("");
        System.out.println("La cantidad de numeros de 1 digito es: " + unDig);
        System.out.println("La cantidad de numeros de 2 digitos es: " + dosDig);
        System.out.println("La cantidad de numeros de 3 digitos es: " + tresDig);
        System.out.println("La cantidad de numeros de 4 digitos es: " + cuatroDig);
        System.out.println("La cantidad de numeros de 5 digotos es: " + cincoDig);
    }
}
