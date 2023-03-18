
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
        
       // Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
        //diferente a cada una. A continuación, realizar las instrucciones
        //necesarias para que: B tome el valor de C, C tome el valor de A, A tome
        //el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
        //valores finales de cada variable. Utilizar sólo una variable auxiliar.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de A, B, C, D");
        int A = leer.nextInt();
        int B = leer.nextInt();
        int C = leer.nextInt();
        int D = leer.nextInt();
        int aux;
        System.out.println("Los valores ingresados son:");
        System.out.println("A= " + A + ", B= " + B + ", C= " + C + ", D= "+ D);
         
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Los valores cambiados son:");
        System.out.println("A= " + A + ", B= " + B + ", C= " + C + ", D= " + D);

    }
    
}
