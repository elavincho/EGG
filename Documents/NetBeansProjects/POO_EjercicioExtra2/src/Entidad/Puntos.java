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
public class Puntos {
    
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
    
        Scanner leer = new Scanner(System.in);

    // Creamos los atributos
    public double x1;
    public double x2;
    public double y1;
    public double y2;
    
    //Creamos el constructor

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    // Creamos el Setter

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    // Creamos el Getter

    public Scanner getLeer() {
        return leer;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public Puntos crearPuntos() {
        Puntos puntos = new Puntos();
        System.out.println("Ingrese los valores de P1 (x1, x2)");
        puntos.setX1(leer.nextInt());
        puntos.setX2(leer.nextInt());
        System.out.println("Ingrese los valores de P2 (y1, y2)");
        puntos.setY1(leer.nextInt());
        puntos.setY2(leer.nextInt());
        return puntos;
    }
    
    public double calcularDistancia(Puntos puntos) {
        // d(P1,P2)=√(x2−x1)^2+(y2−y1)^2
        double distancia = Math.sqrt(Math.pow((puntos.x2-puntos.x1),2)+(Math.pow((puntos.y2-puntos.y1),2)));
        return distancia;
    }
}
