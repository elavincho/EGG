
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
public class EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /*.Realice un programa para que el usuario adivine el resultado de una
    multiplicación entre dos números generados aleatoriamente entre 0 y 10.
    El programa debe indicar al usuario si su respuesta es o no correcta. En
    caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
    su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.*/
    
    Scanner leer = new Scanner(System.in);
    
    int multiplic;
    multiplic = (int) (Math.random() * 10 * Math.random() * 10);
    
    
    boolean adivino = false;
    
    do {
        
        System.out.println("Adivine el resultado de una multiplicacion de 2 numeros entre el 0 y 10 generados aleatoriamente");
        int num = leer.nextInt();
        
        if (num == multiplic) {
            adivino = true;
            System.out.println("Felicidades!! Adivinaste!!");
        }else {
            int diferencia;
            diferencia = Math.abs(num - multiplic);
            if (diferencia <= 2) {
                System.out.println("Caliente!!");
            }else if (diferencia <= 5){
                System.out.println("Tivio!!");
            }else {
                System.out.println("Frio!!");
            }
        }
        
    } while (!adivino);

    }
    
}
