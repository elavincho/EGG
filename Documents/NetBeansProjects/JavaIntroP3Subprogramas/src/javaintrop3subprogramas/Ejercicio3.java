/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintrop3subprogramas;

import java.util.Scanner;

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
        
        //Crea una aplicación que a través de una función nos convierta una 
        //cantidad de euros introducida por teclado a otra moneda, estas pueden 
        //ser a dólares, yenes o libras. La función tendrá como parámetros, 
        //la cantidad de euros y la moneda a convertir que será una cadena, 
        //este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
            //El cambio de divisas es:
            //* 0.86 libras es un 1 €
            //* 1.28611 $ es un 1 €
            //* 129.852 yenes es un 1 €

        
        Scanner leer = new Scanner(System.in);
        double euro;
        String moneda;
        System.out.println("Introduzca la cantidad de euros a convertir");
        euro = leer.nextDouble();
        System.out.println("Introduzca la moneda en la cual desea convertir");
        System.out.println("Dolar, Yenes, Libras");
        moneda = leer.next();
        
        conversor(euro, moneda);
        
    }
    public static void conversor(double euro, String moneda) {
        double aux;
        switch (moneda){
            case "Dolar":
                aux = (euro*1.28611);
                System.out.println("La cantidad de Dolares es: " + aux);
                break;
            case "Libra":
                aux = (euro*0.86);
                System.out.println("La cantidad de Libras es: "+ aux);
                break;
            case "Yenes":
                aux = (euro*129.852);
                System.out.println("la Cantidad de Yenes es: " + aux);
                break;
            default:
                System.out.println("La moneda ingresada no es correcta");
        }
        
    
    }
}
