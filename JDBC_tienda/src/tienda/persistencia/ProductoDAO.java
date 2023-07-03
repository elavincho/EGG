/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Producto;

/**
 *
 * @author elavincho
 */
public final class ProductoDAO extends DAO {

    public void listarNombreDeProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarNombreYPrecioDeProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + " -  $" + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarProductoEntre120y202(int a, int b) throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + " -  $" + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarTodosLosPortatiles() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%portatil%'";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                System.out.println(resultado.getString("nombre") + " -  $" + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void productoMasBarato() throws Exception{
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                System.out.println(resultado.getString("nombre") + " -  $" + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void ingresarProducto(String nombre, double precio, int codigo_fabricante) throws Exception{
        try {
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" + nombre + "' , '" + precio + "' , '" + codigo_fabricante + "')";
            conectarBase();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Ingreso el Producto Correctamente!!");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(int codigo, String nombre, double precio, int codigo_fabricante) throws Exception{
        try {
            String sql = "UPDATE producto SET nombre = '" + nombre + "' , precio = " + precio + ", codigo_fabricante = " + codigo_fabricante + " WHERE codigo = " + codigo;
            conectarBase();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Modifico el Producto Correctamente!!");
        } catch (Exception e) {
            throw e;
        }
    }
    
}
