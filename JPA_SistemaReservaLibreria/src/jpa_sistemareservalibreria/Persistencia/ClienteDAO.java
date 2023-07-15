/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.Persistencia;

import java.util.List;
import jpa_sistemareservalibreria.entidades.Cliente;

/**
 *
 * @author elavincho
 */
public class ClienteDAO extends DAO<Cliente> {

    @Override
    public void eliminar(Cliente entidad) {
        super.eliminar(entidad);
    }

    @Override
    public void editar(Cliente entidad) {
        super.editar(entidad);
    }

    @Override
    public void guardar(Cliente entidad) {
        super.guardar(entidad);
    }
    
    public Cliente buscarPorNombre(String nombre){
        conectar();
        Cliente cliente = (Cliente)em.createQuery("SELECT a FROM Cliente a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();
        if (cliente != null){
            System.out.println(cliente);
        }
        desconectar();
        return cliente;
    }
    
    public Cliente buscarPorId(int id){
        conectar();
        Cliente cliente = (Cliente)em.createQuery("SELECT a FROM Cliente a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (cliente != null){
            System.out.println(cliente);
        }
        desconectar();
        return cliente;
    }
    
    public Cliente buscarPorDocumento(long documento){
        conectar();
        Cliente cliente = (Cliente)em.createQuery("SELECT a FROM Cliente a WHERE a.documento = :documento")
                .setParameter("documento", documento).getSingleResult();
        if (cliente != null){
            System.out.println(cliente);
        }
        desconectar();
        return cliente;
    }
    
    public Cliente editarCliente(int id, long editDoc, String editName, String editApellido, String editPhone){
        conectar();
        Cliente cliente = (Cliente)em.createQuery("SELECT a FROM Cliente a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (cliente!= null){
            System.out.println(cliente);
        }
        cliente.setDocumento(editDoc);
        cliente.setNombre(editName);
        cliente.setApellido(editApellido);
        cliente.setTelefono(editPhone);
        editar(cliente);
        System.out.println(cliente);
        desconectar();
        return cliente;
    }
    
   
    
    public Cliente eliminar(int id){
        conectar();
        Cliente cliente = (Cliente)em.createQuery("SELECT a FROM Cliente a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (cliente != null){
            System.out.println(cliente);
        }
        eliminar(cliente);
        desconectar();
        return cliente;
    }
    
    public void listarTodos(){
        conectar();
        List <Cliente> clientes = em.createQuery("SELECT a FROM Cliente a").getResultList();
        desconectar();
        for (Cliente mostrarClientes : clientes) {
            System.out.println(mostrarClientes);
        }
        desconectar();
    }
    
    
    
}
