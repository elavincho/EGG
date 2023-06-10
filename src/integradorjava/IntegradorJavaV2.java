/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjava;

import Entidad.Estudiante;
import Entidad.EstudianteV2;
import Service.EstudianteServiceV2;

/**
 *
 * @author elavincho
 */
public class IntegradorJavaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creamos el objeto tipo estudiante
        EstudianteV2 student[] = new EstudianteV2[8];

        //Llamamos a la clase servicio
        EstudianteServiceV2 service = new EstudianteServiceV2();
        //Llamamos a la funcion crear alumno
        service.crearAlumno(student);
        //Mostramos los alumnos
        service.mostrarAlumno(student);
        //Llamamos a la funcion calcular mostrar
        service.calcularMostrar(student);
        //Llamamos a la funcion nota mayor
        service.notaMayor(student);
        //Llamamos a la funcion mostrar nota mayor
        service.mostrarMayorPromedio(student, 0, args);
        
    }
    
}
