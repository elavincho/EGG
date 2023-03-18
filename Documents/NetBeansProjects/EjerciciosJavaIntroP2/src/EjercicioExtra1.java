
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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
        //ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
        //equivalente: 1 día, 2 horas.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int minuto = leer.nextInt();
        int dias = (minuto/1440);
        int horas = ((minuto-(dias*1440))/60);
        System.out.println("Los minutos ingresados corresponden a: ");
        System.out.println(dias + " dia/dias " + horas + " horas ");
        
        
    }
    
}
