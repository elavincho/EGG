/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicioextra4;

import Entidad.Cocina;
import Entidad.Receta;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author elavincho
 */
public class POO_EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
        crea métodos para agregar nuevas recetas a la lista, para buscar una
        receta por nombre y para obtener la lista de recetas que se pueden
        preparar con los ingredientes disponibles en la cocina.*/ 
        Cocina cocina = new Cocina();

        Set<String> ingredientesPizza = new HashSet<>();
        ingredientesPizza.add("harina");
        ingredientesPizza.add("levadura");
        ingredientesPizza.add("agua");
        ingredientesPizza.add("sal");
        ingredientesPizza.add("aceite");
        ingredientesPizza.add("salsa de tomate");
        ingredientesPizza.add("queso");

        Receta pizza = new Receta("Pizza", ingredientesPizza);
        cocina.agregarReceta(pizza);

        // Agregar más recetas aquí
        Set<String> ingredientesDisponibles = new HashSet<>();
        ingredientesDisponibles.add("harina");
        ingredientesDisponibles.add("levadura");
        ingredientesDisponibles.add("agua");
        ingredientesDisponibles.add("sal");
        ingredientesDisponibles.add("aceite");
        ingredientesDisponibles.add("salsa de tomate");
        ingredientesDisponibles.add("queso");

        List<Receta> recetasPreparables = cocina.recetasConIngredientesDisponibles(ingredientesDisponibles);
        recetasPreparables.forEach((recetaPreparable) -> {
            System.out.println("Se puede preparar: " + recetaPreparable.getNombre());
        });
    }

}
