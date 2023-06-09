/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_EjercicioExtra2V2.Entidades;

import java.util.Arrays;

/**
 *
 * @author elavincho
 */
public class SalaCine {
    private Butaca[][] butacas;
    private String[] filas;
    private String[] columnas;
    private Pelicula pelicula;

    public SalaCine() {
    }

    public SalaCine(Butaca[][] butacas, String[] filas, String[] columnas) {
        this.butacas = butacas;
        this.filas = filas;
        this.columnas = columnas;
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }

    public String[] getFilas() {
        return filas;
    }

    public void setFilas(String[] filas) {
        this.filas = filas;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Entidad.SalaCine{" +
                "butacas=" + Arrays.toString(butacas) +
                ", filas=" + Arrays.toString(filas) +
                ", columnas=" + Arrays.toString(columnas) +
                ", pelicula=" + pelicula +
                '}';
    }
}