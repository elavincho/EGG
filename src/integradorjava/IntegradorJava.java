/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjava;

import Entidad.Estudiante;
import Service.EstudianteService;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class IntegradorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Ejercicio integrador
    Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
    examen final. La escuela nos ha pedido que calculemos el promedio de notas
    final de todos sus alumnos y saber qué alumnos han recibido una nota por
    encima de ese promedio.
    Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
    van a ser nombre y nota (representando la nota obtenida en el final).
    La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
    estudiantes con sus respectivas notas.
    Una vez creado los estudiantes deberemos guardar los estudiantes en un
    arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
    dos tareas que nos ha pedido la escuela.
    1. Calcular y mostrar el promedio de notas de todo el curso
    2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
    nota mayor al promedio del curso
    3. Por último, deberemos mostrar todos los estudiantes con una nota
    mayor al promedio.
    Nota: para crear un vector de objetos la definición es la siguiente:
    Objeto nombreVector[] = new Objeto[];*/
        
        //Creamos el objeto
        Estudiante[] student = new Estudiante[8];
        //Llamamos a la clase servicio
        EstudianteService service = new EstudianteService();
        service.crearEstudiante(student);
        service.mayorPromedio(student, 0);
        service.mostrarMayorPromedio(student, 0);

    }

}
