/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_sistemareservalibreria.servicios;

import java.util.Date;
import java.util.Scanner;
import jpa_sistemareservalibreria.Persistencia.PrestamoDAO;
import jpa_sistemareservalibreria.entidades.Cliente;
import jpa_sistemareservalibreria.entidades.Libro;
import jpa_sistemareservalibreria.entidades.Prestamo;

/**
 *
 * @author elavincho
 */
public class PrestamoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final PrestamoDAO dao;

    public PrestamoServicio() {
        this.dao = new PrestamoDAO();
    }

    public void cargarPrestamo() {

        Libro libro;
        while (true) {
            try {
                libro = (new LibroServicio()).buscarPorISBN();
                if (libro != null) {
                    System.out.println("Libro encontrado!!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!");
                leer.next();
            }
        }

        if (libro.getEjemplaresRestantes() == 0) {
            System.out.println("No hay ejemplares disponibles!");
            return;
        }

        Cliente cliente;
        while (true) {
            try {
                cliente = (new ClienteServicio()).buscarPorDocumento();
                if (cliente != null) {
                    System.out.println("Cliente encontrado!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!");
                leer.next();
            }
        }

        Date fechaPrest;
        Date fechaDev;
        while (true) {
            try {
                fechaPrest = new Date();

                System.out.println("Ingrese el Dia de Devolucion");
                int dia = leer.nextInt();
                System.out.println("Ingrese el Mes de Devolucion");
                int mes = leer.nextInt();
                System.out.println("Ingrese el Año de Devolucion");
                int anio = leer.nextInt();
                fechaDev = new Date(anio - 1900, mes - 1, dia);
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!");
            }
        }

        if (libro.getEjemplaresRestantes() == 0) {
            System.out.println("No hay mas ejemplares disponibles!");
        } else {
            LibroServicio serviceLibro = new LibroServicio();
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
            serviceLibro.editar(libro);
            Prestamo prestamo = new Prestamo();
            prestamo.setFechaPrestamo(fechaPrest);
            prestamo.setFechaDevolucion(fechaDev);
            prestamo.setLibro(libro);
            prestamo.setCliente(cliente);
            dao.guardar(prestamo);
            System.out.println("El Prestamo se Realizo con Exito!");
        }
    }

    public void mostrarTodosLosPrestamos() {
        try {
            dao.mostrarTodosLosPrestamos();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarPrestamosPorCliente() {
        Cliente cliente = (new ClienteServicio()).buscarPorDocumento();
        if (cliente == null) {
            System.out.println("El cliente no existe!");
        } else {
            dao.mostrarPrestamosPorCliente(cliente);
        }
    }

    public void eliminarPrestamoPorId() {
        try {
            System.out.println("Ingrese el Id del Prestamo que desea Eliminar");
            int id = leer.nextInt();
            dao.eliminarPrestamo(id);
            System.out.println("Elimino el Prestamo Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void devolverPrestamo() {
        Cliente cliente = (new ClienteServicio()).buscarPorDocumento();
        if (cliente == null) {
            System.out.println("El cliente no existe!");
        } else {
            dao.mostrarPrestamosPorCliente(cliente);
        }
        System.out.println("Ingrese id  del prestamo que desea devolver:");
        int id = leer.nextInt();
        Prestamo prestamo = dao.buscarPrestamoPorID(id);
        if (prestamo == null) {
            System.out.println("El prestamo no existe!");
        } else {
            LibroServicio serviceLibro = new LibroServicio();
            Libro libro = prestamo.getLibro();
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
            serviceLibro.editar(libro);
            dao.eliminar(prestamo);
            System.out.println("Prestamo devuelto!!");
            System.out.println("Muchas Gracias!!");
        }
    }

    public void editar(Prestamo prestamo) {
        dao.editar(prestamo);
    }
}
