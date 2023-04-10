/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Set;

/**
 *
 * @author elavincho
 */
public class Receta {

    public String nombre; // se agrego la palabra final++++++++++++++++++++++
    public Set<String> ingredientes; // idem

    public Receta(String nombre, Set<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getIngredientes() {
        return ingredientes;
    }

}
