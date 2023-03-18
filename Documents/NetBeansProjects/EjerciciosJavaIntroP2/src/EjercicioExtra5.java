
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
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Una obra social tiene tres clases de socios:
        //○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
        //descuento en todos los tipos de tratamientos.
        //○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
        //descuento para los mismos tratamientos que los socios del tipo A.
        //○ Los socios que menos aportan, los de tipo ‘C’, no reciben
        //descuentos sobre dichos tratamientos.
        //○ Solicite una letra (carácter) que representa la clase de un socio, y
        //luego un valor real que represente el costo del tratamiento (previo
        //al descuento) y determine el importe en efectivo a pagar por dicho
        //socio.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio (A - B - C)");
        String socio = leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        
        
        double valorDesc;
        socio = socio.toUpperCase();
        
        switch (socio) {
            case "A":
                valorDesc = (costo - (costo*0.5));
                System.out.println("El importe a pagar con descuento es: $ " + valorDesc);
                break;
            case "B":
                valorDesc = (costo-(costo*0.35));
                System.out.println("El importe a pagar con descuento es: $ " + valorDesc);
                break;
            case "C":
                System.out.println("El importe a pagar es: $ " + costo);
                break;
        }
        
    

        
    }
    
}
