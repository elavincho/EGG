/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.EstudianteV2;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class EstudianteServiceV2 {

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
    Scanner leer = new Scanner(System.in);

    //Creamos el objeto tipo estudiante
    //EstudianteV2 student[] = new EstudianteV2[8];
    //Una vez creado los estudiantes deberemos guardar los estudiantes en un
    //arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
    //dos tareas que nos ha pedido la escuela.
    public EstudianteV2 crearAlumno(EstudianteV2[] student) {
        for (int i = 0; i < student.length; i++) {
            student[i] = new EstudianteV2();
            System.out.println("Ingrese el nombre del alumno");
            student[i].setNombre(leer.nextLine());
            student[i].setNota(Math.random() * 10);
        }
        return new EstudianteV2();
    }

    public void mostrarAlumno(EstudianteV2[] student) {
        System.out.println("MOSTRAR ALUMNO");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getNombre() + " = " + student[i].getNota());
        }
    }

    //1. Calcular y mostrar el promedio de notas de todo el curso
    public double calcularMostrar(EstudianteV2[] student) {
        double promedio = 0;
        for (int i = 0; i < student.length; i++) {
            promedio += student[i].getNota() / student.length;
        }
        return promedio;
    }

    //2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
    //nota mayor al promedio del curso
    public String[] notaMayor(EstudianteV2[] student) {
        int contMayorProm = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > calcularMostrar(student)) {
                student[i].setNota(student[i].getNota());
                contMayorProm++;
            }
        }
        String[] name = new String[contMayorProm];
        int contName = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > calcularMostrar(student)) {
                name[contName] = student[i].getNombre();
                contName++;
            }
        }
        return name;
    }

    //3. Por último, deberemos mostrar todos los estudiantes con una nota
    //mayor al promedio.
    public void mostrarMayorPromedio(EstudianteV2[] student, double promedio, String[] name) {
        System.out.println("");
        System.out.println("El promedio de las notas es: " + calcularMostrar(student));
        System.out.println("");
        System.out.println("MOSTRAR LAS NOTAS MAYOR AL PROMEDIO");

        for (int i = 0; i < student.length; i++) {
            if (student[i].getNota() > calcularMostrar(student)) {
                System.out.println(student[i].getNombre() + " = " + student[i].getNota());
            }
        }
    }
}
