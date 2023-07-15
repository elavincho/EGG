/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.servicios;

import java.util.Scanner;
import jpa_sistemareservalibreria.Persistencia.AutorDAO;
import jpa_sistemareservalibreria.entidades.Autor;

/**
 *
 * @author elavincho
 */
public class AutorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final AutorDAO dao;

    public AutorServicio() {
        this.dao = new AutorDAO();
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
            System.out.println("Ingrese el Nombre del Autor que desea Buscar");
            String nombre = leer.next();
            dao.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Autor buscarPorId() {
        Autor autor = new Autor();
        try {
            System.out.println("Ingrese el Id del Autor que desea Buscar");
            int id = leer.nextInt();
            return dao.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontro Autor para el Id Ingresado!");
        }
        return autor;
    }

    public Autor cargarAutor() {
        System.out.println(">>>Cargar Autor<<<");
        Autor autor = new Autor();
        System.out.println("Ingrese el Nombre del Autor");
        autor.setNombre(leer.next());
        autor.setAlta(true);

        try {
            dao.guardar(autor);
            System.out.println("Ingreso el Autor Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return autor;

    }

    public void eliminarAutorPorId() {
        try {
            System.out.println("Ingrese el Id del Autor que desea Eliminar");
            int id = leer.nextInt();
            dao.eliminar(id);
            System.out.println("Elimino el Autor Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void editarNombre() {
        try {
            System.out.println("Ingrese el Id del Autor que desea Editar");
            int id = leer.nextInt();

            System.out.println("Ingrese el Nuevo Nombre del Autor");
            String editName = leer.next();
            boolean alta = true;
            dao.modificarNombre(id, editName, alta);
            System.out.println("Modifico el Nombre Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void editarIdAutor() {
        try {
            System.out.println("Ingrese el Id del Autor que desea Editar");
            int id = leer.nextInt();

            System.out.println("Ingrese el Nuevo Id del Autor");
            Autor autor = new Autor();
            int idNuevo = leer.nextInt();

            String editName = leer.next();
            boolean alta = true;
            dao.modificarId(id, idNuevo);
            System.out.println("Modifico el Id Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
