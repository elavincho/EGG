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
public class Libro {
    
    //    Crear una clase llamada Libro que contenga los siguientes atributos:
    //    ISBN, Título, Autor, Número de páginas, y un constructor con todos los
    //    atributos pasados por parámetro y un constructor vacío. Crear un
    //    método para cargar un libro pidiendo los datos al usuario y luego
    //    informar mediante otro método el número de ISBN, el título, el autor del
    //    libro y el número de páginas.
    
    //Creamos los atributos
    
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NroDePaginas;
    
    // Creamos un constructor vacio

    public Libro() {
    }
    
    // Creamos un constructor con todos los atributos

    public Libro(String ISBN, String Titulo, String Autor, int NroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NroDePaginas = NroDePaginas;
    }
        // Creamos los Setter
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNroDePaginas(int NroDePaginas) {
        this.NroDePaginas = NroDePaginas;
    }
            // Creamos los Getter
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNroDePaginas() {
        return NroDePaginas;
    }
    
    // Creamos el toString

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NroDePaginas=" + NroDePaginas + '}';
    }
    
    
    
}
