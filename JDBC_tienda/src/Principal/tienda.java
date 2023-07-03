package Principal;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author elavincho
 */
public class tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ProductoService serviceProducto = new ProductoService();
        FabricanteService serviceFabricante = new FabricanteService();
        Scanner leer = new Scanner(System.in);

        boolean bucle = true;
        String opcion;
        String respuesta;

        do {
            System.out.println("MENU");
            System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("b) Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("c) Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("d) Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("e) Listar el nombre y el precio del producto más barato.");
            System.out.println("f) Ingresar un producto a la base de datos.");
            System.out.println("g) Ingresar un fabricante a la base de datos");
            System.out.println("h) Editar un producto con datos a elección.");
            System.out.println("i) Salir");
            System.out.println("Ingrese una Opcion");
            opcion = leer.nextLine();

            switch (opcion) {
                case "a":
                    serviceProducto.listarNombreDeProductos();
                    break;
                case "b":
                    serviceProducto.listarNombreYPrecioDeProductos();
                    break;
                case "c":
                    serviceProducto.listarProductoEntre120y202(0, 0);
                    break;
                case "d":
                    serviceProducto.listarTodosLosPortatiles();
                    break;
                case "e":
                    serviceProducto.productoMasBarato();
                    break;
                case "f":
                    serviceProducto.ingresarProducto();
                    break;
                case "g":
                    serviceFabricante.insertarFabricante();
                    break;
                case "h":
                    serviceProducto.modificarProducto();
                    break;
                case "i":
                    System.out.println("Desea Salir (S / N)");
                    respuesta = leer.nextLine();
                    if (respuesta.equalsIgnoreCase("S")) {
                        bucle = false;
                    }
                    break;
                default:
                    System.out.println("Ingrese una Opcion Valida");
                    bucle = true;
                    break;
            }
        } while (bucle);
    }

}
