/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_libreria.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author elavincho
 */
public abstract class DAO<T> {

    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_LibreriaPU");
    protected EntityManager em = emf.createEntityManager();
    
    public void conectar(){
        if (!em.isOpen()){
            em = emf.createEntityManager();
        }
    }
    
    public void desconectar(){
        if(em.isOpen()){
            em.close();
        }
    }
    
    public void guardar(T entidad){
        conectar();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        desconectar();
    }
    
    public void editar(T entidad){
        //conectar();
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
        //desconectar();
    }
    
    public void eliminar(T entidad){
        //conectar();
        em.getTransaction().begin();
        em.remove(entidad);
        em.getTransaction().commit();
        //desconectar();
    }

}
