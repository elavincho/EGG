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
public class GuiaEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos la variable scanner para ingresar los datos del usuario
        Scanner leer = new Scanner(System.in);
        // Definimos la opcion como entero
        int tipoMotor;
        //Mostramos por pantalla las opciones disponibles
        System.out.println("Seleccione el tipo de motor");
        System.out.println("1. Bomba de Agua");
        System.out.println("2. Bomba de Gasolina");
        System.out.println("3. Bomba de Hormigon");
        System.out.println("4. Bomba de Pasta Alimenticia");
        
        // Leemos la opcion del usuario
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba seleccionada es una Bomba de Agua");
                break;
            case 2:
                System.out.println("La bomba seleccionada es una Bomba de Gasolina");
                break;
            case 3:
                System.out.println("La bomba seleccionada es una Bomba de Hormigon");
                break;
            case 4:
                System.out.println("La bomba seleccionada es una Bomba de Pasta Alimenticia");
                break;
            default:
                System.out.println("No existe un valor para ese tipo de Bomba");
                break;
        }
        
    }
    
}

