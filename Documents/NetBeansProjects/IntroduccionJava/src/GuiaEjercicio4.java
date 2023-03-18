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
public class GuiaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos la variable scanner para leer el nombre y la edad del usuario.
        Scanner leer = new Scanner(System.in);
        //creamos una variable de cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        // Se pide por pantalla que ingrese el nombre
        System.out.println("Ingrese su nombre:");
        // Leemos el nombre de la persona en la variable nombre. PD: al next hay que agregarle
        // Line (la L con mayusculas) porque es el tipo de dato, en este caso es de tipo cadena.
        nombre = leer.nextLine();
        // Creamos la variable Scanner para leer la edad
        Scanner leer1 = new Scanner(System.in);
        //Creamos la variable tipo entero (int) para leer la edad
        int edad;
        // Pedimos por pantalla al usuario que ingrese su edad
        System.out.println("Ingrese su edad");
        //Leemos la edad de la persona en la variable edad PD: al next hay que agregarle
        // Int (la i con mayusculas) porque es el tipo de dato, en este caso tipo entero.
        edad = leer1.nextInt();
        // Imprimimos el nombre y la edad por pantalla
        System.out.println("Hola " + nombre + ", sabemos que tienes " + edad + " años.");
        
        // sout + tabulador = System.out.println("");
        
    }
    
}
