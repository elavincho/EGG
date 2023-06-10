/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_EjercicioExtra2V2.Entidades;

/**
 *
 * @author elavincho
 */
/**
 * De Entidad.Cine nos interesa conocer la película que se está reproduciendo, la
 * sala con los espectadores y el precio de la entrada.
 */
public class Cine {
    private Pelicula pelicula;
    private SalaCine sala;
    private double precio;


    public Cine(Pelicula pelicula, SalaCine sala, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Entidad.Cine{" +
                "pelicula=" + pelicula +
                ", sala=" + sala +
                ", precio=" + precio +
                '}';
    }
}