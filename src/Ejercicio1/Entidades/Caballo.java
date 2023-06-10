/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Entidades;

/**
 *
 * @author elavincho
 */
/*
        Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
        La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
        Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
        mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
        siguiente:
        */
public class Caballo extends Animal{
    
    /*
    En la clase caballo que es una subclase de la clase animal solo tenemos que 
    agregar el constructor de la clase perro con los atritutos de la clase madre
    y el override con la funcion alimentase modificando lo que pide el ejercicio.
    */
    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        //super.alimentarse(); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("El Caballo " + nombre + " y le gusta comer " + alimento);
    }

   
    
    
}
