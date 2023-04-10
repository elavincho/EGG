/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Rectangulo {

    /*Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
    método "calcular_area" que calcule y devuelva el área del rectángulo.
    Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
    de 4 y 6 y imprime el área del rectángulo.*/
    
    // Creamos los atributos
    
    public int lado1;
    public int lado2;
    
    // Creamos el constructor

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // Creamos el Setter

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }
    
    // Creamos la funcion
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo CrearRectangulo() {
        
        Rectangulo rectangulo = new Rectangulo();
       
        System.out.println("Ingrese el lado 1");
        rectangulo.setLado1(leer.nextInt());
        System.out.println("Ingrese el lado 2");
        rectangulo.setLado2(leer.nextInt());
        return rectangulo;
    }
    
    public int calcularArea(Rectangulo rectangulo) {
      
        int calArea = rectangulo.getLado1() * rectangulo.getLado2();
        
        return calArea;
    }
}
