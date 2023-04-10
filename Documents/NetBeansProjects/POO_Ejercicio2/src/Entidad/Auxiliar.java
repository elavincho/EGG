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
    
    /*Declarar una clase llamada Circunferencia que tenga como atributo
    privado el radio de tipo real. A continuación, se deben crear los
    siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda
    en el atributo del objeto.
    d) Método area(): para calcular el área de la circunferencia (Area=〖
    π*radio〗^2).
    e) Método perimetro(): para calcular el perímetro
    (Perimetro=2*π*radio).*/
    
    Scanner leer = new Scanner(System.in);
    
    // Creamos el metodo para la circunsferencia
        
    public Circunferencia crearCircunferencia() {
        Circunferencia circunf = new Circunferencia();
        
        System.out.println("ingrese el radio de la circunferencia");
        circunf.setRadio(leer.nextDouble());
        return circunf;
    }
    
    // Creamos el metodo area
    public double area(Circunferencia circunferencia) {
     return Math.pow((circunferencia.getRadio() * Math.PI),2);
    }
    
    // Creamos el metodo perimetro
    public double perimetro(Circunferencia circunferencia) {
    return circunferencia.getRadio() * 2 * Math.PI;
    }
}
