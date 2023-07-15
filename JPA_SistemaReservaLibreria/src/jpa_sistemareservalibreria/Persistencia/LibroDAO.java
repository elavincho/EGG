/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.Persistencia;

import java.util.List;
import jpa_sistemareservalibreria.entidades.Libro;

/**
 *
 * @author elavincho
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void eliminar(Libro entidad) {
        super.eliminar(entidad);
    }

    @Override
    public void editar(Libro entidad) {
        super.editar(entidad);
    }

    @Override
    public void guardar(Libro entidad) {
        super.guardar(entidad);
    }
    
    public Libro buscar(String nombre){
        conectar();
        Libro libro = (Libro)em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();
        if (libro != null){
            System.out.println(libro);
        }
        desconectar();
        return libro;
    }
    
    public Libro buscarPorISBN(long isbn){
        conectar();
        Libro libro = (Libro)em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        if (libro != null){
            System.out.println(libro);
        }
        desconectar();
        return libro;
    }
    
    public void buscarLibroPorNombreDelAutor(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT a FROM Libro a WHERE a.autor.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getResultList();
        desconectar();
        if (libros.size() == 0) {
            System.out.println("No se encontro ningun libro para el autor ingresado!");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
        
    }
    
    public void buscarLibroPorDeLaEditorial(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT a FROM Libro a WHERE a.editorial.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getResultList();
        desconectar();
        if (libros.size() == 0) {
            System.out.println("No se encontraron libros con esa editorial");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    
    public Libro modificarNombre(long isbn, String editName){
        conectar();
        Libro libro = (Libro)em.createQuery("SELECT a FROM Libro a WHERE a.isbn = :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        if (libro != null){
            System.out.println(libro);
        }
        libro.setTitulo(editName);
        editar(libro);
        System.out.println(libro);
        desconectar();
        return libro;
    }
    
    public Libro eliminar(long isbn){
        conectar();
        Libro libro = (Libro)em.createQuery("SELECT a FROM Libro a WHERE a.isbn = :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        if (libro != null){
            System.out.println(libro);
        }
        eliminar(libro);
        desconectar();
        return libro;
    }
    
    public void listarTodos(){
        conectar();
        List <Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        for (Libro mostrarLibros : libros) {
            System.out.println(mostrarLibros);
        }
        desconectar();
    }
}
