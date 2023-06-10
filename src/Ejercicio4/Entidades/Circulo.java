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
public class Circulo implements calculoFormas {

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
    
    protected double radio;
    protected double diametro;
    

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

     Scanner leer = new Scanner(System.in);
     
    @Override
    public void calcularArea(double PI) {
        System.out.println("==========CALCULAR AREA DEL CIRCULO==========");
        //potencia: Math. pow(base, exponente)
        double areaCirculo;
        System.out.println("Ingrese el radio del Circulo");
        double radio = leer.nextDouble();
        areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del Circulo es: " + areaCirculo);
    }

    @Override
    public void calcularPerimetro(double PI) {
        System.out.println("==========CALCULAR PERIMETRO DEL CIRCULO==========");
        //potencia: Math. pow(base, exponente)
        double perimetroCirculo;
        System.out.println("Ingrese el diametro del Circulo");
        double diametro = leer.nextDouble();
        perimetroCirculo = (Math.PI * diametro);
        System.out.println("El perimetro del Circulo es: " + perimetroCirculo);
    }
}
