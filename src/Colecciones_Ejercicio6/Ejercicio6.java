/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ejercicio6;

import Colecciones_Ejercicio6.TiendaServicio.TiendaServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
        productos que venderemos y el precio que tendrán. Además, se necesita que la
        aplicación cuente con las funciones básicas.
        Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
        eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
        Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
        Realizar un menú para lograr todas las acciones previamente mencionadas.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Creamos el mapa
        HashMap<String, Integer> tienda = new HashMap();
        //Llamamos a la clase servicio
        TiendaServicio service = new TiendaServicio();

        String salir = "n";
        boolean bucle = true;
        do {

            System.out.println("MENU TIENDA");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Precio");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Productos en Stock");
            System.out.println("5. Salir");
            System.out.println("");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    service.crearProducto(tienda);
                    break;
                case 2:
                    service.modificarPrecio(tienda);
                    break;
                case 3:
                    service.eliminarProducto(tienda);
                    break;
                case 4:
                    System.out.println(tienda);
                    break;
                case 5:
                    System.out.println("Desea Salir?? (S / N)");
                    salir = leer.next();
                    if (salir.equalsIgnoreCase("S")) {
                        System.out.println("Salio del programa");
                        bucle = false;
                    }
                    break;
                default:
                    System.out.println("Ingrese una Opcion valida.");
                    salir = "n";
                    break;
            }
        } while (bucle);
    }
}
