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
public class CargarLibro {
    
    //    Crear una clase llamada Libro que contenga los siguientes atributos:
    //    ISBN, Título, Autor, Número de páginas, y un constructor con todos los
    //    atributos pasados por parámetro y un constructor vacío. Crear un
    //    método para cargar un libro pidiendo los datos al usuario y luego
    //    informar mediante otro método el número de ISBN, el título, el autor del
    //    libro y el número de páginas.
    
        Scanner leer = new Scanner(System.in);
    
        public Libro generarLibro() {
           Libro libro = new Libro();
            System.out.println("Ingrese el numero de ISBN del Libro");
            libro.setISBN(leer.nextLine());
            System.out.println("Ingrese el Titulo del Libro");
            libro.setTitulo(leer.nextLine());
            System.out.println("Ingrese el Autor del Libro");
            libro.setAutor(leer.nextLine());
            System.out.println("Ingrese el Numero de Paginas del Libro");
            libro.setNroDePaginas(leer.nextInt());
            return libro;
        }
}
