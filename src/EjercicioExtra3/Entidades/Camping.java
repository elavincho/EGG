/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3.Entidades;

/**
 *
 * @author elavincho
 */
public class Camping extends Alojamiento{
    
    protected int cantMetrosCuad;
    protected int cantMaxCarpas;
    protected int cantBanos;
    protected boolean restaurante;
    protected int precio;

    public Camping() {
    }

    public Camping(int cantMetrosCuad, int cantMaxCarpas, int cantBanos, boolean restaurante, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantMetrosCuad = cantMetrosCuad;
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBanos = cantBanos;
        this.restaurante = restaurante;
        this.precio = precio;
    }

    public int getCantMetrosCuad() {
        return cantMetrosCuad;
    }

    public void setCantMetrosCuad(int cantMetrosCuad) {
        this.cantMetrosCuad = cantMetrosCuad;
    }

    public int getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(int cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public int getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(int cantBanos) {
        this.cantBanos = cantBanos;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantMetrosCuad=" + cantMetrosCuad + ", cantMaxCarpas=" + cantMaxCarpas + ", cantBanos=" + cantBanos + ", restaurante=" + restaurante + ", precio=" + precio + '}';
    }

    
    
    
}
