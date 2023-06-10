/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ejercicio6.TiendaServicio;

import Colecciones_Ejercicio6.Entidad.Tienda;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class TiendaServicio {

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

    //Llamamos a la clase entidad
    Tienda tiend = new Tienda();
    
    public void crearProducto(HashMap<String, Integer> tienda) {
        System.out.println("CREAR PRODUCTO");
        String salir;
        do {
            System.out.println("Ingrese un Producto");
            tiend.setProducto(leer.next());
            System.out.println("Ingrese el Precio del Producto");
            tiend.setPrecio(leer.nextInt());
            //Agregamos el producto y el precio al mapa
            tienda.put(tiend.getProducto(), tiend.getPrecio());
            System.out.println("Queres agregar otro Producto?? (S / N)");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("S"));
        System.out.println("Los Productos en Stock son:");
        System.out.println(tienda);
        System.out.println("");
    }
    
    public void modificarPrecio(HashMap<String, Integer> tienda){
        System.out.println("MODIFICAR PRECIO");
        System.out.println("Ingrese el Producto del cual quiere Modificar el Precio");
        String modificar = leer.next();
        if (tienda.containsKey(modificar)){
            System.out.println("Ingrese el Nuevo Precio");
            //Modificamos el precio del producto
            tienda.replace(modificar, leer.nextInt());
        }else {
            System.out.println("El Producto ingresado no se encuentra en la lista");
        }
        System.out.println("");
        System.out.println("Los Productos en Stock son:");
        System.out.println(tienda);
        System.out.println("");
    }
    
    public void eliminarProducto(HashMap<String, Integer> tienda){
        System.out.println("ELIMINAR PRODUCTO");
        System.out.println("Ingrese el Producto que quiere Eliminar");
        String eliminar = leer.next();
        if (tienda.containsKey(eliminar)) {
            tienda.remove(eliminar);
        }else {
            System.out.println("El Producto ingresado no se encuentra en la lista");
        }
        System.out.println("");
        System.out.println("Los Productos en Stock son:");
        System.out.println(tienda);
        System.out.println("");
    }
}
