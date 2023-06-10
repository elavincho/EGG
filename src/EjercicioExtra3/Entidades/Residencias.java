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
public class Residencias extends Alojamiento {
    
    protected int cantHabitaciones;
    protected boolean descuento;
    protected boolean campoDeportivo;
    protected int precio;

    public Residencias() {
    }

    public Residencias(int cantHabitaciones, boolean descuento, boolean campoDeportivo, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
        this.precio = precio;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantHabitaciones=" + cantHabitaciones + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + ", precio=" + precio + '}';
    }
    
    
}
