/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpa_libreria;

import java.util.Scanner;
import jpa_libreria.servicios.AutorServicio;
import jpa_libreria.servicios.EditorialServicio;
import jpa_libreria.servicios.LibroServicio;

/**
 *
 * @author elavincho
 */
public class JPA_Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean bucle = true;
        int opcion;

        LibroServicio serviceLibro = new LibroServicio();
        AutorServicio serviceAutor = new AutorServicio();
        EditorialServicio serviceEditorial = new EditorialServicio();

        do {

            System.out.println(">>>Libreria<<<");
            System.out.println("MENU");
            System.out.println("1. Cargar Libros");
            System.out.println("2. Buscar Libro por Titulo");
            System.out.println("3. Buscar Libro por ISBN");
            System.out.println("4. Buscar Libro por Nombre del Autor");
            System.out.println("5. Buscar Libro por Nombre de la Editorial");
            System.out.println("6. Mostrar Todos los Libros");
            System.out.println("7. Eliminar Libro por ISBN");
            System.out.println("8. Editar el Nombre del Libro");
            System.out.println("9. Cargar Editorial");
            System.out.println("10. Mostrar Todas las Editoriales");
            System.out.println("11 Eliminar Editorial por Id");
            System.out.println("12. Editar Editorial por Id");
            System.out.println("13. Buscar Editorial por Nombre");
            System.out.println("14. Cargar Autor");
            System.out.println("15. Mostrar Todos los Autores");
            System.out.println("16. Eliminar Autor por Id");
            System.out.println("17. Editar Nombre del Autor por Id");
            System.out.println("18. Editar Id del Autor");
            System.out.println("19. Buscar Autor por Nombre");
            System.out.println("20. Buscar Autor por Id");
            System.out.println("30. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    serviceLibro.cargarLibro();
                    //serviceLibro.guardarLibro();
                    break;
                case 2:
                    serviceLibro.buscarPorNombre();
                    break;
                case 3:
                    serviceLibro.buscarPorISBN();
                    break;
                case 4:
                    serviceLibro.buscarLibroPorNombreDelAutor();
                    break;
                case 5:
                    serviceLibro.buscarLibroPorNombreDeLaEditorial();
                    break;
                case 6:
                    serviceLibro.listarTodos();
                    break;
                case 7:
                    serviceLibro.eliminarLibroPorISBN();
                    break;
                case 8:
                    serviceLibro.editarNombre();
                    break;
                case 9:
                    serviceEditorial.cargarEditorial();
                    break;
                case 10:
                    serviceEditorial.listarTodos();
                    break;
                case 11:
                    serviceEditorial.eliminarEditorialPorId();
                    break;
                case 12:
                    serviceEditorial.editarNombre();
                    break;
                case 13:
                    serviceEditorial.buscarPorNombre();
                    break;
                case 14:
                    serviceAutor.cargarAutor();
                    break;
                case 15:
                    serviceAutor.listarTodos();
                    break;
                case 16:
                    serviceAutor.eliminarAutorPorId();
                    break;
                case 17:
                    serviceAutor.editarNombre();
                    break;
                case 18:
                    serviceAutor.editarIdAutor();
                    break;
                case 19:
                    serviceAutor.buscarPorNombre();
                    break;
                case 20:
                    serviceAutor.buscarPorId();
                    break;
                case 30:
                    System.out.println("Desea Salir?? (S / N) ");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        bucle = false;
                    }
                    break;
                default:
                    bucle = true;
                    break;
            }

        } while (bucle);

    }

}
