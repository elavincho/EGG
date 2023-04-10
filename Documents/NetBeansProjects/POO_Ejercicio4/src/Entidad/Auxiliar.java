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
public class Auxiliar {
    
    /*Crear una clase Rectángulo que modele rectángulos por medio de un
        atributo privado base y un atributo privado altura. La clase incluirá un
        método para crear el rectángulo con los datos del Rectángulo dados por
        el usuario. También incluirá un método para calcular la superficie del
        rectángulo y un método para calcular el perímetro del rectángulo. Por
        último, tendremos un método que dibujará el rectángulo mediante
        asteriscos usando la base y la altura. Se deberán además definir los
        métodos getters, setters y constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2.*/
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        rectangulo.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        rectangulo.setAltura(leer.nextInt());
        return rectangulo;
    }
    
    // Calculamos la superficie
    public int calcularSuperficie(Rectangulo rectangulo) {
        int superficie = rectangulo.getBase() * rectangulo.getAltura();
        return superficie;
    }
    
    // Calculamos el perimetro
    public int calcularPerimetro(Rectangulo rectangulo) {
        int perimetro = ((rectangulo.getBase() + rectangulo.getAltura()) * 2);
        return perimetro;
    }
    
    //Dibujamos el rectangulo de asteriscos 
    
    public void dibujarRectangulo(Rectangulo rectangulo) {
        
        
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0) {
                    System.out.print(" * ");
                }else if (i == rectangulo.getAltura()-1){
                    System.out.print(" * ");
                }else if (j == 0) {
                    System.out.print(" * ");
                }else if (j == rectangulo.getBase()-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
