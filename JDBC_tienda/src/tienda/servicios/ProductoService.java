/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;



/**
 *
 * @author elavincho
 */
public class ProductoService {
    
    Scanner leer = new Scanner(System.in);
    
    private ProductoDAO dao;
    
    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void listarNombreDeProductos(){
        try {
            dao.listarNombreDeProductos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listarNombreYPrecioDeProductos(){
        try {
            dao.listarNombreYPrecioDeProductos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listarProductoEntre120y202(int a, int b){
        try {
            dao.listarProductoEntre120y202(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listarTodosLosPortatiles(){
        try {
            dao.listarTodosLosPortatiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void productoMasBarato(){
        try {
            dao.productoMasBarato();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ingresarProducto(){
        try {
            System.out.println("Ingrese el Nombre del Producto");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el Precio del Producto");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el Codigo del Fabricante");
            int codigo_fabricante = leer.nextInt();
            dao.ingresarProducto(nombre, precio, codigo_fabricante);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void modificarProducto(){
        try {
            System.out.println("Ingrese el Codigo del Producto");
            int codigo = leer.nextInt();
            System.out.println("Ingrese el Nombre del Producto");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el Precio del Producto");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el Codigo del Fabricante del Producto");
            int codigo_fabricante = leer.nextInt();
            dao.modificarProducto(codigo, nombre, precio, codigo_fabricante);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
