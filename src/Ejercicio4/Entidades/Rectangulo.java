/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4.Entidades;

import Ejercicio4.Interfaces.calculoFormas;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Rectangulo implements calculoFormas {
     /*
        Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
        */
    
    protected double base;
    protected double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    Scanner leer = new Scanner(System.in);

    @Override
    public void calcularArea(double PI) {
       
        System.out.println("==========CALCULAR AREA DEL RECTANGULO==========");
        double areaRectangulo;
        System.out.println("Ingrese la base del Rectangulo");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del Rectangulo");
        this.altura = leer.nextDouble();
        areaRectangulo = base * altura;
        System.out.println("El area del Rectangulo es: " + areaRectangulo);
    }

    @Override
    public void calcularPerimetro(double PI) {
        System.out.println("==========CALCULAR PERIMETRO DEL RECTANGULO==========");
        double perimetroRectangulo;
        perimetroRectangulo = ((base + altura) * 2);
        System.out.println("El perimetro del Rectangulo es: " + perimetroRectangulo);
    }
}
