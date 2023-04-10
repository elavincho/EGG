/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicioextra2;

import Entidad.Puntos;

/**
 *
 * @author elavincho
 */
public class POO_EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Definir una clase llamada Puntos que contendrá las coordenadas de dos
        puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
        Generar un objeto puntos usando un método crearPuntos() que le pide al
        usuario los dos números y los ingresa en los atributos del objeto.
        Después, a través de otro método calcular y devolver la distancia que
        existe entre los dos puntos que existen en la clase Puntos. Para conocer
        como calcular la distancia entre dos puntos consulte el siguiente link:
        http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/
        // Formula de distancia entre 2 puntos P1 y P2
        // d(P1,P2)=√(x2−x1)^2+(y2−y1)^2
        
        // Llamamos a la clase puntos
        Puntos puntos = new Puntos();
        puntos = puntos.crearPuntos();
        
        System.out.println("Los valores de P1 son: x1 = " + puntos.getX1() + ", x2 = " + puntos.getX2());
        System.out.println("Los valores de P2 son: y1 = " + puntos.getY1() + ", y2 = " + puntos.getY2());
        System.out.println("");
        System.out.println("La distancia entre los puntos P1 y P2 es: " + puntos.calcularDistancia(puntos));
        

    }
    
}
