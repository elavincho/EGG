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
public class Cancion {
    
    /*Desarrollar una clase Cancion con los siguientes atributos: título y autor.
        Se deberá́definir además dos constructores: uno vacío que inicializa el
        título y el autor a cadenas vacías y otro que reciba como parámetros el
        título y el autor de la canción. Se deberán además definir los métodos
        getters y setters correspondientes.*/
    
    Scanner leer = new Scanner(System.in);
    
    // Creamos los atributos
    public String titulo;
    public String autor;
    
    // Creamos el constructor

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Creamos el Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    // Creamos el Getter 
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
 
    
    public Cancion crearCancion() {
        
        Cancion cancion = new Cancion();
        System.out.println("Ingrese el titulo de la cancion");
        cancion.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion");
        cancion.setAutor(leer.nextLine());
        return cancion;
    }
    
}
