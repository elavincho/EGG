/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio1;

import Entidad.Libro;
import Entidad.CargarLibro;


/**
 *
 * @author elavincho
 */
public class POO_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //    Crear una clase llamada Libro que contenga los siguientes atributos:
        //    ISBN, Título, Autor, Número de páginas, y un constructor con todos los
        //    atributos pasados por parámetro y un constructor vacío. Crear un
        //    método para cargar un libro pidiendo los datos al usuario y luego
        //    informar mediante otro método el número de ISBN, el título, el autor del
        //    libro y el número de páginas.
        
        //Creamos el objeto e importamos los atributos
        // Llamamos la clase CargarLibro y nombramos la clase.
        CargarLibro carLib = new CargarLibro();
        // Llamamos la clase Libro, la nombramos y utilizamos el parametro para llenar los datos del libro.
        Libro libroX = carLib.generarLibro();
        // Mostramos los datos ingresados.
        System.out.println("El libro cargado es: " + libroX.toString());
    }
}
