
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
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Leer la altura de N personas y determinar el promedio de estaturas que
        //se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
        //general.
        
        Scanner leer = new Scanner(System.in);
        
        int i = 0; // contador
        double sumabajo = 0;
        double sumaalto = 0;
        double nbajo = 0;
         
            System.out.println("Ingrese la cantidad de personas");
            double personas = leer.nextDouble();
           
       do {
           
           System.out.println("Ingrese la altura de la persona (Usar coma)");
           double altura = leer.nextDouble();
           
           if (altura < 1.60) {
               i = i + 1;
               sumabajo = sumabajo + altura;
               nbajo = nbajo + 1;
           }
           if (altura >= 1.60) {
               i = i + 1;
               sumaalto = sumaalto + altura;
               
           }
       }while (personas > i);
        System.out.println("El promedio de las estaturas menores a 1.60mts es: " + (sumabajo/nbajo));
        System.out.println("El promedio de las estaturas en general es: " + ((sumabajo+sumaalto)/personas));
        
    }
    
}
