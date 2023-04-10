/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio4;

import Entidad.Auxiliar;
import Entidad.Rectangulo;

/**
 *
 * @author elavincho
 */
public class POO_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crear una clase Rectángulo que modele rectángulos por medio de un
        atributo privado base y un atributo privado altura. La clase incluirá un
        método para crear el rectángulo con los datos del Rectángulo dados por
        el usuario. También incluirá un método para calcular la superficie del
        rectángulo y un método para calcular el perímetro del rectángulo. Por
        último, tendremos un método que dibujará el rectángulo mediante
        asteriscos usando la base y la altura. Se deberán además definir los
        métodos getters, setters y constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2.*/
        
        // Llamamos al auxiliar y nombramos la clase 
        Auxiliar aux = new Auxiliar();
        
        // Llamamos al rectangulo
        Rectangulo rectang = aux.crearRectangulo();
        
        // Mostamos los datos
        System.out.println("La base del rectangulo es: " + rectang.getBase());
        System.out.println("La altura del rectangulo es: " + rectang.getAltura());
        System.out.println("");
        System.out.println("La superficie del rectangulo es: " + aux.calcularSuperficie(rectang));
        System.out.println("El perimetro del rectangulo es: " + aux.calcularPerimetro(rectang));
        System.out.println("");
        System.out.println("El dibujo del rectangulo es:");
        aux.dibujarRectangulo(rectang);
        
                
        

    }
    
}
