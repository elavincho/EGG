/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.Persistencia;

import java.util.List;
import jpa_sistemareservalibreria.entidades.Autor;


/**
 *
 * @author elavincho
 */
public class AutorDAO extends DAO <Autor>{

    @Override
    public void eliminar(Autor entidad) {
        super.eliminar(entidad);
    }

    @Override
    public void editar(Autor entidad) {
        super.editar(entidad);
    }

    @Override
    public void guardar(Autor entidad) {
        super.guardar(entidad);
    }
    
    public Autor buscarPorNombre(String nombre){
        conectar();
        Autor autor = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();
        if (autor != null){
            System.out.println(autor);
        }
        desconectar();
        return autor;
    }
    
    public Autor buscarPorId(int id){
        conectar();
        Autor autor = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (autor != null){
            System.out.println(autor);
        }
        desconectar();
        return autor;
    }
    
    public Autor modificarNombre(int id, String editName, boolean alta){
        conectar();
        Autor autor = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (autor != null){
            System.out.println(autor);
        }
        autor.setNombre(editName);
        autor.setAlta(alta);
        editar(autor);
        System.out.println(autor);
        desconectar();
        return autor;
    }
    
    public Autor modificarId(int id, int idNuevo){
        conectar();
        Autor autor = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (autor != null){
            System.out.println(autor);
        }
        autor.setId(idNuevo);
        editar(autor);
        System.out.println(autor);
        desconectar();
        return autor;
    }
    
    public Autor eliminar(int id){
        conectar();
        Autor autor = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (autor != null){
            System.out.println(autor);
        }
        eliminar(autor);
        desconectar();
        return autor;
    }
    
    public void listarTodos(){
        conectar();
        List <Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        for (Autor mostrarAutores : autores) {
            System.out.println(mostrarAutores);
        }
        desconectar();
    }
    
    
}
