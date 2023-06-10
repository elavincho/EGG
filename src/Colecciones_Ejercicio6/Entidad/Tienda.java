/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ejercicio6.Entidad;

/**
 *
 * @author elavincho
 */
public class Tienda {
    
    /*
        Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
        productos que venderemos y el precio que tendrán. Además, se necesita que la
        aplicación cuente con las funciones básicas.
        Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
        eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
        Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
        Realizar un menú para lograr todas las acciones previamente mencionadas.
     */
    
    public String producto;
    public int precio;

    public Tienda() {
    }

    public Tienda(String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "Producto = " + producto + ", Precio = " + precio + '}';
    }
}
