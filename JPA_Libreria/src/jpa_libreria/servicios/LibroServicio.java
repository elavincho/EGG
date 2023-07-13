/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_libreria.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import jpa_libreria.Persistencia.LibroDAO;
import jpa_libreria.entidades.Autor;
import jpa_libreria.entidades.Editorial;
import jpa_libreria.entidades.Libro;


/**
 *
 * @author elavincho
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final LibroDAO dao;

    public LibroServicio() {
        this.dao = new LibroDAO();
    }

    public void cargarLibro() {

        
        System.out.println("Ingrese el ISBN del Libro");
        long isbn = leer.nextLong();
        System.out.println("Ingrese el Titulo del Libro");
        String titulo = leer.next();
        System.out.println("Ingrese la Cantidad de Ejemplares");
        int ejemplares = leer.nextInt();
        System.out.println("Ingrese el Año de Publicacion");
        int anio = leer.nextInt();
        int ejemplaresPrestados = 0;
        int ejemplaresRestantes = (ejemplares - ejemplaresPrestados);
        boolean alta = true;

        AutorServicio serviceAutor = new AutorServicio();
        Autor autor = serviceAutor.buscarPorId();

        EditorialServicio serviceEditorial = new EditorialServicio();
        Editorial editorial = serviceEditorial.buscarPorId();
        
        Libro libro = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial);
       
        try {
            dao.guardar(libro);
            System.out.println("Se Guardo el Libro Correctamente!!");

//            if (libro.getAutor() == null && libro.getEditorial() == null) {
//                System.out.println("No se encontro el Id del Autor y la Editorial");
//                System.out.println("Se Generaron Automaticamente");
//                System.out.println("Debe Editar el Autor y la Editorial!!");
//            } else {
//                System.out.println("No se Guardo el Libro!");
//
//            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error! No se Guardo el Libro!");
        }
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
            System.out.println("Ingrese el Nombre del Libro que desea Buscar");
            String nombre = leer.next();
            dao.buscar(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void buscarPorISBN() {
        try {
            System.out.println("Ingrese el ISBN del Libro que desea Buscar");
            long isbn = leer.nextLong();
            dao.buscarPorISBN(isbn);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void buscarLibroPorNombreDelAutor() {
        try {
            System.out.println("Ingrese el Nombre del Autor del Libro que desea Buscar");
            String nombre = leer.next();
            dao.buscarLibroPorNombreDelAutor(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void buscarLibroPorNombreDeLaEditorial() {
        try {
            System.out.println("Ingrese el Nombre de la Editorial del Libro que desea Buscar");
            String nombre = leer.next();
            dao.buscarLibroPorDeLaEditorial(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void guardarLibro() {
        Libro libro = new Libro();

        System.out.println("Ingrese Titulo:");
        libro.setTitulo(leer.nextLine());

        int anio = 0;
        while (true) {
            try {
                System.out.println("Ingrese año:");
                anio = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para el año.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setAnio(anio);

        // Repite el proceso de validación para los otros campos numéricos
        int ejemplares = 0;
        while (true) {
            try {
                System.out.println("Ingrese ejemplares:");
                ejemplares = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para los ejemplares.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setEjemplares(ejemplares);

        int ejemplaresPrestados = 0;
        while (true) {
            try {
                System.out.println("Ingrese ejemplares prestados:");
                ejemplaresPrestados = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para los ejemplares prestados.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setEjemplaresPrestados(ejemplaresPrestados);

        int ejemplaresRestantes = 0;
        while (true) {
            try {
                System.out.println("Ingrese ejemplares restantes:");
                ejemplaresRestantes = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para los ejemplares restantes.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setEjemplaresRestantes(ejemplaresRestantes);

        System.out.println("Ingrese id del autor:");
        libro.setAutor(new AutorServicio().buscarPorId());

        System.out.println("Ingrese id de la editorial:");
        libro.setEditorial(new EditorialServicio().buscarPorId());
        try {
            if (libro.getAutor() != null && libro.getEditorial() != null) {
                dao.guardar(libro);
                System.out.println("Se cargó el libro correctamente.");
            } else {
                System.out.println("No se pudo cargar el libro.");
                System.out.println("Por favor, verifique los datos e intente nuevamente.");
                cargarLibro();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se pudo cargar el libro.");
        }
    }

    public void eliminarLibroPorISBN() {
        try {
            System.out.println("Ingrese el ISBN del Libro que desea Eliminar");
            long isbn = leer.nextLong();
            dao.eliminar(isbn);
            System.out.println("Elimino el Libro Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void editarNombre() {
        try {
            System.out.println("Ingrese el ISBN del Libro que desea Editar");
            long isbn = leer.nextLong();

            System.out.println("Ingrese el Nuevo Nombre del Libro");
            String editName = leer.next();
            dao.modificarNombre(isbn, editName);
            System.out.println("Modifico el Nombre Correctamente!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
