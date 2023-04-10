/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio2;

import Entidad.Auxiliar;
import Entidad.Circunferencia;

/**
 *
 * @author elavincho
 */
public class POO_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
        
        //Creamos el objeto e importamos los atributos
        // Llamamos la clase Auxiliar y nombramos la clase.
        
        Auxiliar aux = new Auxiliar();
        
        // Llamamos la clase Circunferencia, la nombramos y utilizamos el parametro para hacer los calculos.
        
        Circunferencia circunferencia = aux.crearCircunferencia();
        
        // Mostramos los datos ingresados y los resultados
        
        System.out.println("El radio de la circunferencia es: " + circunferencia.getRadio());
        System.out.println("El area de la circunferencia es: " + aux.area(circunferencia));
        System.out.println("El perimero de la circunferencia es: " + aux.perimetro(circunferencia));
        
    }
    
}
