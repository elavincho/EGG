
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
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escriba un programa que averigüe si dos vectores de N enteros son
        //iguales (la comparación deberá detenerse en cuanto se detecte alguna
        //diferencia entre los elementos).

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del Vector. Max 10.");
        int tamano = leer.nextInt();
        
        int[] vector1 = new int[tamano];
        int[] vector2 = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            vector1[i] = (int)((Math.random())*10);
            vector2[i] = (int)((Math.random())*10);
        }
        
        System.out.println("Vector 1");
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        
        System.out.println("");
        
        System.out.println("Vector 2");
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + vector2[i] + "]");
        }
        
        System.out.println("");
        
        for (int i = 0; i < tamano; i++) {
            if (vector1[i] == vector2[i]) {
                System.out.println("En la posicion " + i + " los vectores son iguales.");
                System.out.println("");
            }else {
                System.out.println("En la posicion " + i + " los vectores son diferentes");
                break;
            }
        }
    }
}
