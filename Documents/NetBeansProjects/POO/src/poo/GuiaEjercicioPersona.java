/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Persona;

/**
 *
 * @author elavincho
 */
public class GuiaEjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanciamos utilizando el constructor por parametro
        Persona p1 = new Persona("David", "Gonzalez", 94236645);
        System.out.println(p1.nombre + " " + p1.apellido + " " + p1.dni);
        // Llamamos al Set
        p1.setNombre("Mario");
        // Llamamos al Get
        System.out.println(p1.getNombre());
        System.out.println(p1.toString());
        
    }
    
        
    
        
    
}
