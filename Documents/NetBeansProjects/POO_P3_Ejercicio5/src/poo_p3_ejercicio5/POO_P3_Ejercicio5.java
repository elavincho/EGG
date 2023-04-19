/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_p3_ejercicio5;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author elavincho
 */
public class POO_P3_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Implemente la clase Persona en el paquete entidades. Una persona tiene
        un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
        constructor parametrizado, get y set. Crear una clase PersonaService,
        en el paquete servicio, con los siguientes métodos:
        a) Método crearPersona que pida al usuario Nombre y fecha de
        nacimiento de la persona a crear. Retornar el objeto Persona creado.
        b) Método calcularEdad que calcule la edad del usuario utilizando el
        atributo de fecha de nacimiento y la fecha actual.
        c) Método menorQue recibe como parámetro una Persona y una edad.
        Retorna true si la persona es menor que la edad consultada o false
        en caso contrario.
        d) Método mostrarPersona que muestra la información de la persona
        deseada.*/
        
        //Llamamos a la clase servicio
        PersonaService service = new PersonaService();
        //Llamamos al metodo crear persona
        service.crearPersona();
        System.out.println("");
        //Llamamos al metodo calcular edad
        //service.calcularEdad();
        int edad = service.calcularEdad();
        System.out.println("Tu edad es: " + edad);
        System.out.println("");
        //Llamamos al metodo menorQue
        boolean menor = service.menorQue(edad);
        System.out.println("La persona es menor de edad??  " + menor);
        System.out.println("");
        //Llamamos al metodo mostrar persona
        service.mostrarPersona(edad, menor);
        
        
        

        
    }
    
}
