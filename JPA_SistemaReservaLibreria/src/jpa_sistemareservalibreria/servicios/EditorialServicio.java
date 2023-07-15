/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.servicios;

import java.util.Scanner;
import jpa_sistemareservalibreria.Persistencia.EditorialDAO;
import jpa_sistemareservalibreria.entidades.Editorial;

/**
 *
 * @author elavincho
 */
public class EditorialServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final EditorialDAO dao;

    public EditorialServicio() {
        this.dao = new EditorialDAO();
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
            System.out.println("Ingrese el Nombre de la Editorial que desea Buscar");
            String nombre = leer.next();
            dao.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Editorial buscarPorId() {
        Editorial editorial = new Editorial();
        try {
            System.out.println("Ingrese el Id de la Editorial que desea Buscar");
        int Id = leer.nextInt();
        return dao.buscarPorId(Id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro Editorial para el Id Ingresado!");
        }
        return editorial;
    }

    public Editorial cargarEditorial() {
        System.out.println(">>>Cargar Editorial<<<");
        Editorial editorial = new Editorial();
        System.out.println("Ingrese el Nombre de la Editorial");
        editorial.setNombre(leer.next());
        editorial.setAlta(true);
        try {
            dao.guardar(editorial);
            System.out.println("Ingreso la Editorial Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return editorial;
    }

    public void eliminarEditorialPorId() {
        try {
            System.out.println("Ingrese el Id de la Editorial que desea Eliminar");
            int id = leer.nextInt();
            dao.eliminar(id);
            System.out.println("Elimino la Editorial Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void editarNombre() {
        try {
            System.out.println("Ingrese el Id de la Editorial que desea Editar");
            int id = leer.nextInt();
            System.out.println("Ingrese el Nuevo Nombre de la Editorial");
            String editName = leer.next();
            boolean alta = true;
            dao.modificarNombre(id, editName, alta);
            System.out.println("Modifico el Nombre Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
