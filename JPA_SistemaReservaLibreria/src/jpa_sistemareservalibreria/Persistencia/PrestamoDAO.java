/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.Persistencia;

import java.util.List;
import jpa_sistemareservalibreria.entidades.Cliente;
import jpa_sistemareservalibreria.entidades.Prestamo;

/**
 *
 * @author elavincho
 * C CREATE
 * R REED
 * U UPDATE
 * D DELETE
 * 
 */
public class PrestamoDAO extends DAO<Prestamo>{

    @Override
    public void eliminar(Prestamo entidad) {
        super.eliminar(entidad);
    }

    @Override
    public void editar(Prestamo entidad) {
        super.editar(entidad);
    }

    @Override
    public void guardar(Prestamo entidad) {
        super.guardar(entidad);
    }
    
    public void mostrarTodosLosPrestamos(){
        conectar();
        List <Prestamo> prestamos = em.createQuery("SELECT a FROM Prestamo a").getResultList();
        for (Prestamo mostrarPrestamos : prestamos) {
            System.out.println(mostrarPrestamos);
        }
        desconectar();
    }
    
     public void mostrarPrestamosPorCliente(Cliente cliente) {
        conectar();
        try {
            List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.documento = :documento")
                    .setParameter("documento", cliente.getDocumento())
                    .getResultList();
            if (prestamos.size() > 0) {
                for (Prestamo p : prestamos) {
                    System.out.println(p);
                }
            } else {
                System.out.println("No hay prestamos para este cliente");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
     public Prestamo buscarPrestamoPorID(int id) {
        conectar();
        Prestamo prestamo;
        try {
            prestamo = em.find(Prestamo.class, id);
            if (prestamo != null) {
                System.out.println(prestamo);
                return prestamo;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return null;
    }
     
    public Prestamo eliminarPrestamo(int id){
        conectar();
        Prestamo prestamo = (Prestamo)em.createQuery("SELECT a FROM Prestamo a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (prestamo != null){
            System.out.println(prestamo);
        }
        eliminar(prestamo);
        desconectar();
        return prestamo;
    }
}
