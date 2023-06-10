/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_Ejercicio1;

import RelacionesEntreClases_Ejercicio1.Entidades.Perro;
import RelacionesEntreClases_Ejercicio1.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio1V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        // Crear dos personas y dos perros
        personas.add(new Persona("Juan", "Perez", 25, 12345678));
        personas.add(new Persona("Maria", "Gomez", 30, 98765432));

        perros.add(new Perro("Firulais", "Chihuahua", 5, "Pequeño"));
        perros.add(new Perro("Rex", "Doberman", 3, "Grande"));

        System.out.println("==============ADOPCION DE PERROS==================");
        
        for (Persona p : personas) {
            System.out.println(p.getNombrePersona() + ", ¿qué perro quieres adoptar?");
            String perroName = input.nextLine();
            boolean perroEncontrado = false;
            for (Perro perro : perros) {
                if (perro.getNombrePerro().equals(perroName)) {
                    if (perro.getAdoptadoPor() == null) {
                        p.adoptar(perro);
                        perroEncontrado = true;
                        break;
                    } else {
                        System.out.println("Lo siento, " + p.getNombrePersona() + ", el perro " + perro.getNombrePerro() + " ya está adoptado. Por favor, elige otro perro.");
                        perroEncontrado = true;
                        break;
                    }
                }
            }
            if (!perroEncontrado) {
                System.out.println("Lo siento, " + p.getNombrePersona() + ", no se encontró ningún perro con el nombre " + perroName);
            }
            // Mostramos todas las personas con sus respectivos perros
            System.out.println(p.toString());
        }
    }
}
