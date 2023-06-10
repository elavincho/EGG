package Guia_EjercicioPersona;

import relacionesentreclases.Guia_EjercicioPersona.Service.PersonaService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elavincho
 */
public class Guia_EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Llamamos a la clase Servicio
        PersonaService service = new PersonaService();
        //Llamamos a la funcion crear persona
        service.crearPersona();
    }
}
