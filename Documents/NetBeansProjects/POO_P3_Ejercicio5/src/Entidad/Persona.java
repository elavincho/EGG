/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author elavincho
 */
public class Persona {

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
    String nombre;
    Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
