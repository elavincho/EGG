
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
public class GuiaEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
        //compañeros de equipo
        
        Scanner leer = new Scanner(System.in);
        
        String vectorEquipo[] = new String[9];
        
        //Asigno los valores mediante el for
        
        for (int i = 0; i < 9; i++) {
           
            vectorEquipo[0] = "David";
            vectorEquipo[1] = "Thiago";
            vectorEquipo[2] = "Emilio";
            vectorEquipo[3] = "Romina";
            vectorEquipo[4] = "Cristian";
            vectorEquipo[5] = "Luis";
            vectorEquipo[6] = "Gonzalo";
            vectorEquipo[7] = "Carina";
            vectorEquipo[8] = "Anancelys";
            
        }
        
        // Muestro el vector 
        
        for (int i =0; i < 9; i++) {
            System.out.println("[" + vectorEquipo[i] + "]");
        }
    }
    
}
