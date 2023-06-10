/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.Guia_EjercicioPersona.Service;

import java.util.Scanner;
import relacionesentreclases.Guia_EjercicioPersona.Entidades.DNI;
import relacionesentreclases.Guia_EjercicioPersona.Entidades.Persona;

/**
 *
 * @author elavincho
 */
public class PersonaService {
    /*
        EJERCICIO PERSONA
        Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
        objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
        acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
        */
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearPersona(){
        //Llamamos a la clase persona
        Persona pers = new Persona();
        System.out.println("Ingrese el Nombre de la Persona");
        pers.setNombre(leer.next());
        System.out.println("Ingrese el Apellido de la Persona");
        pers.setApellido(leer.next());
        DNI dni = new DNI();
        System.out.println("Ingrese la Serie del DNI");
        dni.setCaracter(leer.next());
        System.out.println("Ingrese el Numero de DNI");
        dni.setNumero(leer.nextInt());
        System.out.println("Mostramos los Datos de la Persona");
        System.out.println(pers + "" + dni);
    }
}

