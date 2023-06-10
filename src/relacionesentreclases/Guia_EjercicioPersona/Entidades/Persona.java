/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.Guia_EjercicioPersona.Entidades;

/**
 *
 * @author elavincho
 */
public class Persona {
    /*
        EJERCICIO PERSONA
        Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
        objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
        acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
        */
    
    public String nombre;
    public String apellido;
    public DNI dni;
    
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, DNI dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + nombre + ", Apellido = " + apellido + '}';
    }
}
