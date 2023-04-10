/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author elavincho
 */
public class Cocina {

    /*Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
        crea métodos para agregar nuevas recetas a la lista, para buscar una
        receta por nombre y para obtener la lista de recetas que se pueden
        preparar con los ingredientes disponibles en la cocina.*/ 
    public List<Receta> recetas; // se agrego la palabra final+++++++++++++++++++++++++

    public Cocina() {
        this.recetas = new ArrayList<>();
    }

    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    public Receta buscarRecetaPorNombre(String nombre) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                return receta;
            }
        }
        return null;
    }

    public List<Receta> recetasConIngredientesDisponibles(Set<String> ingredientesDisponibles) {
        List<Receta> recetasPreparables = new ArrayList<>();
        for (Receta receta : recetas) {
            if (ingredientesDisponibles.containsAll(receta.getIngredientes())) {
                recetasPreparables.add(receta);
            }
        }
        return recetasPreparables;
    }

}
