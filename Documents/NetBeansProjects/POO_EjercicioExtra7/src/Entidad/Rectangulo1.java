/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author elavincho
 */
public class Rectangulo1 {
    
    /*Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
        método "calcular_area" que calcule y devuelva el área del rectángulo.
        Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
        de 4 y 6 y imprime el área del rectángulo.*/
    
    public int lado1 = 4;
    public int lado2 = 6;
    
    
    
    // Creamos la funcion
    
    public Rectangulo1 crearRectangulo1() {
        Rectangulo1 rectangulo1 = new Rectangulo1();
        
        
        
        return rectangulo1;
    }
    
    public int calcularArea(Rectangulo1 rectangulo1) {
        
        int calcArea = rectangulo1.lado1* rectangulo1.lado2;
        
        return calcArea;
    }
}
