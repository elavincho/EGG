/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_EjercicioExtra1.Entidad;

import java.util.Date;

/**
 *
 * @author elavincho
 */
public class Alumnos {
    
    /*
        Ejercicio1 (utilizar ArrayList)
        Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y
        su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
        solamente.
        Necesidades:
         Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los
        objetos de este tipo.
         Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
        para no hacer carga manual de los datos)
         Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
        apellido de forma ascendente.
         Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
        nombre de forma descendente.
         Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo
        nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas,
        utilizando el atributo fecha de nacimiento.
         Crear listas paralelas de Alumnos, según la nacionalidad.
         Realizar un reporte final de datos que informe:
        o Cuantos alumnos son mayores de 25 años.
        o Cuantos alumnos tiene su apellido que comienzan con letra L o P
        o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
        VENEZOLANA.
        Recordar:
         Hacer uso de paquetes y clases correspondientes para buena estructura de
        nuestro proyecto.
         Todos los métodos deben ser pensados para reutilizar y adaptarse a futuros
        cambios (por ejemplo, mañana quiero carga de 30 alumnos, y las instrucciones
        deben prevenir esta modificación)
        */
    
    /*
    Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y
        su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
        solamente.
    */
    
    public String nombre;
    public String apellido;
    public String nacionalidad;
    public Date fecNac;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, String nacionalidad, Date fecNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fecNac = fecNac;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    @Override
    public String toString() {
        return "Lista de Alumnos:  " + 
                " Nombre = " + nombre + 
                " Apellido = " + apellido + 
                " Nacionalidad = " + nacionalidad + 
                " Fecha de Nacimiento =" + fecNac;
    }
}
