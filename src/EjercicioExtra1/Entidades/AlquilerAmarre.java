/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1.Entidades;

import java.util.Date;

/**
 *
 * @author elavincho
 */
    /*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
        nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
        amarre y el barco que lo ocupará.
        Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
        Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Número de mástiles para veleros.
        • Potencia en CV para barcos a motor.
        • Potencia en CV y número de camarotes para yates de lujo.
        Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
        alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
        multiplicando por 10 los metros de eslora).
        En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
        sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
        en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
        el número de camarotes.
        Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
        métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
        precio final de su alquiler.
    */
public class AlquilerAmarre {
    protected String nombreCliente;
    protected String documentoCliente;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected String posicionAmarre;
    Barcos barco;

    public AlquilerAmarre() {
    }

    public AlquilerAmarre(String nombreCliente, String documentoCliente, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Barcos barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barcos getBarco() {
        return barco;
    }

    public void setBarco(Barcos barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "AlquilerAmarre{" + "nombreCliente=" + nombreCliente + ", documentoCliente=" + documentoCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
}
