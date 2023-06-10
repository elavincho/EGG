/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.Entidades.Animal;
import Ejercicio1.Entidades.Caballo;
import Ejercicio1.Entidades.Gato;
import Ejercicio1.Entidades.Perro;

/**
 *
 * @author elavincho
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
        La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
        Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
        mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
        siguiente:
        */
        
        //Declaracion del objeto perro
        Animal perro1 = new Perro("Stich", "Salchichas", 15, "Doberman");
        perro1.alimentarse();
        
        //Declaracion de otro objeto perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chiguagua");
        perro2.alimentarse();
        
        //Declaracion del objeto gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 6, "Siames");
        gato1.alimentarse();
        
        //Declaracion del objeto caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
        
        
        
    }
    
}
