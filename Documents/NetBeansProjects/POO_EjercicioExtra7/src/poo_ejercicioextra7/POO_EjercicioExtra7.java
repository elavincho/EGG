/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicioextra7;

import Entidad.Rectangulo;
import Entidad.Rectangulo1;

/**
 *
 * @author elavincho
 */
public class POO_EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
        método "calcular_area" que calcule y devuelva el área del rectángulo.
        Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
        de 4 y 6 y imprime el área del rectángulo.*/ 
        
        // Llamamos a la clase rectangulo
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("RECTANGULO");
        
        rectangulo = rectangulo.CrearRectangulo();
        
        System.out.println("El lado 1 es: " + rectangulo.getLado1());
        System.out.println("El lado 2 es: " + rectangulo.getLado2());
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea(rectangulo));
        System.out.println("");
        
        // Llamamos a la clse rectangulo1
        Rectangulo1 rectangulo1 = new Rectangulo1();
        
        System.out.println("RECTANGULO 1");
        System.out.println("El lado 1 del rectangulo 1 es: " + rectangulo1.lado1);
        System.out.println("El lado 2 del rectangulo 1 es: " + rectangulo1.lado2);
        System.out.println("El area del rectangulo 1 es: " + rectangulo1.calcularArea(rectangulo1));
        
        
        
    }
    
}
