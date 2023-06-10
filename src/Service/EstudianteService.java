/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Estudiante;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class EstudianteService {

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
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random aleatorio = new Random();

    //Creamos los 8 estudiantes con sus respectivas notas
    //1. Calcular y mostrar el promedio de notas de todo el curso
    public Estudiante crearEstudiante(Estudiante[] student) {
        double promedio = 0;
        double aleatorio;
        //Pedimos los nombres y calculamos las notas  de los alumnos
        for (int i = 0; i < student.length; i++) {
            student[i] = new Estudiante();
            System.out.println("Ingrese el nombre del estudiante");
            student[i].setNombre(leer.nextLine());
            student[i].setNota(Math.random() * 10);
            promedio += student[i].getNota() / student.length;
        }
        //Mostramos las notas
        for (int i = 0; i < 8; i++) {
            //System.out.println("Las notas de los estudiaantes son: ");
            System.out.println(student[i].getNombre() + " = " + student[i].getNota());
        }
        System.out.println("El promedio de las notas es: " + promedio);
        return new Estudiante();
    }

    //2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
    //nota mayor al promedio del curso
    public void mayorPromedio(Estudiante[] student, double promedio) {
        int contador = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > promedio) {
                contador++;
            }
        }

        String[] alumnos = new String[contador];
        int j = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > promedio) {
                alumnos[j] = student[i].getNombre();
                j++;
            }
        }

    }
//Retornar otro arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso

    //3. Por último, deberemos mostrar todos los estudiantes con una nota
    //mayor al promedio.
    public void mostrarMayorPromedio(Estudiante[] student, double promedio) {
        System.out.println("Los alumnos que tienen una nota mayor al promedio son:");
        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > promedio) {
                System.out.println(student[i].getNombre() + " = " + student[i].getNota());
            }
        }

    }
}
