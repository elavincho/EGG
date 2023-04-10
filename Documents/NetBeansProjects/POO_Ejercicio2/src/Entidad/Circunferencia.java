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
public class Circunferencia {
    
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
           
    //Creamos los atributos 
    private double radio;
    
    // Creamos el metodo constructor. OBS: primero hay que crear un constructor
    // vacio y luego uno con los parametros.
    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // Creamos el metodo Get
    public double getRadio() {
        return radio;
    }
    
    // Creamos el metodo Set
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
