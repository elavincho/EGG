/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class PersonaService {

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
    Scanner leer = new Scanner(System.in);
    //Llamamos a la clase entidad
    Persona persona = new Persona();

    //a) Método crearPersona que pida al usuario Nombre y fecha de
    //nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona() {
        System.out.println("Ingrese su Nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese su Dia de Nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su Mes de Nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su Año de nacimiento");
        int anio = leer.nextInt();
        Date fecNac = new Date(anio - 1900, mes - 1, dia);
        persona.setFechaNacimiento(fecNac);
        return persona;
    }

    //b) Método calcularEdad que calcule la edad del usuario utilizando el
    //atributo de fecha de nacimiento y la fecha actual.
    Date fechaActual = new Date();

    public int calcularEdad() {

        int edad;

        if (persona.getFechaNacimiento().getMonth() > fechaActual.getMonth() || persona.getFechaNacimiento().getMonth() == fechaActual.getMonth() && persona.getFechaNacimiento().getDate() > fechaActual.getDate()) {
            edad = (fechaActual.getYear() - persona.getFechaNacimiento().getYear()) - 1;
        } else {
            edad = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
        }
        return edad;
    }

    //c) Método menorQue recibe como parámetro una Persona y una edad.
    //Retorna true si la persona es menor que la edad consultada o false
    //en caso contrario.
    public boolean menorQue(int calcularEdad) {
        boolean menor;

        if (calcularEdad < 18) {
            menor = true;
        } else {
            menor = false;
        }
        return menor;
    }

    //d) Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(int calcularEdad, boolean menorQue) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad);
        System.out.println("La persona es menor de edad??" + menorQue);
    }
}
