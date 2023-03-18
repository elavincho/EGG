/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
// Considera que estás desarrollando una web para una empresa que fabrica
// motores (suponemos que se trata del tipo de motor de una bomba para mover
// fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor
// entre 1 y 4. El programa debe mostrar lo siguiente:
// o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
// una bomba de agua”.
// o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
// una bomba de gasolina”.
// o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
// una bomba de hormigón”.
// o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
// una bomba de pasta alimenticia”.
// o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
// “No existe un valor válido para tipo de bomba”


        System.out.println("Elija un Opcion:");
        System.out.println("1. Bomba de Agua");
        System.out.println("2. Bomba de Gasolina");
        System.out.println("3. Bomba de Hormigon");
        System.out.println("4. Bomba de Pasta Alimenticia");
        
        Scanner leer = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese una Opcion");
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La Bomba es una Bomba de Agua");
                break;
            case 2:
                System.out.println("La Bomba es una Bomba de Gasolina");
                break;
            case 3:
                System.out.println("La Bomba es una Bomba de Hormigon");
                break;
            case 4:
                System.out.println("La Bomba es una Bomba de Pasta Alimenticia");
                break;
            default:
                System.out.println("No existe ningun valor para ese tipo de Bomba");
                break;
                
                
        }


    }
    
}
