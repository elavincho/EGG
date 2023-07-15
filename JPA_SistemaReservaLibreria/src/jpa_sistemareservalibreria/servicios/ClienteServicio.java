/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.servicios;

import java.util.Scanner;
import jpa_sistemareservalibreria.Persistencia.ClienteDAO;
import jpa_sistemareservalibreria.entidades.Cliente;

/**
 *
 * @author elavincho
 */
public class ClienteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final ClienteDAO dao;

    public ClienteServicio() {
        this.dao = new ClienteDAO();
    }

    public Cliente cargarCliente() {
        System.out.println(">>>Cargar Cliente<<<");
        Cliente cliente = new Cliente();
        System.out.println("Ingrese el Documento del Cliente");
        cliente.setDocumento(leer.nextLong());
        System.out.println("Ingrese el Nombre del Cliente");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese el Apellido del Cliente");
        cliente.setApellido(leer.next());
        System.out.println("Ingrese el Telefono del Cliente");
        cliente.setTelefono(leer.next());

        try {
            dao.guardar(cliente);
            System.out.println("Ingreso el Cliente Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return cliente;

    }

    public void listarTodos() {
        try {
            dao.listarTodos();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void buscarPorNombre() {
       
        try {
            System.out.println("Ingrese el Nombre del Cliente que desea Buscar");
            String nombre = leer.next();
            dao.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Cliente buscarPorId() {
        Cliente cliente = new Cliente();
        try {
            System.out.println("Ingrese el Id del Cliente que desea Buscar");
            int id = leer.nextInt();
            return dao.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro Cliente para el Id Ingresado!");
        }
        return cliente;
    }
    
    public Cliente buscarPorDocumento() {
        Cliente cliente = new Cliente();
        try {
            System.out.println("Ingrese el Documento del Cliente que desea Buscar");
            long documento = leer.nextLong();
            return dao.buscarPorDocumento(documento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro Cliente para el Documento Ingresado!");
        }
        return cliente;
    }

    public void eliminarClientePorId() {
        try {
            System.out.println("Ingrese el Id del Cliente que desea Eliminar");
            int id = leer.nextInt();
            dao.eliminar(id);
            System.out.println("Elimino el Cliente Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void editarCliente() {
        try {
            System.out.println("Ingrese el Id del Cliente que desea Editar");
            int id = leer.nextInt();
            
            System.out.println("Ingrese el Nuevo Documento del Cliente");
            long editDoc = leer.nextLong();
            System.out.println("Ingrese el Nuevo Nombre del Cliente");
            String editName = leer.next();
            System.out.println("Ingrese el Nuevo Apellido del Cliente");
            String editApellido = leer.next();
            System.out.println("Ingrese el Nuevo Telefono del Cliente");
            String editPhone = leer.next();
            dao.editarCliente(id, editDoc, editName, editApellido, editPhone);
            System.out.println("Modifico el Nombre Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
