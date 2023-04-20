package Service;

import Entidad.Curso;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elavincho
 */
public class CursoService {

    /*Un profesor particular está dando cursos para grupos de cinco alumnos
        y necesita un programa para organizar la información de cada curso.
        Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
        serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
        turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
        arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
        nombres de cada alumno. A continuación, se implementarán los
        siguientes métodos:
        a) Un constructor por defecto.
        b) Un constructor con todos los atributos como parámetro.
        c) Métodos getters y setters de cada atributo.
        d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
        los alumnos que asisten a las clases. Nosotros nos encargaremos de
        almacenar esta información en un arreglo e iterar con un bucle,
        solicitando en cada repetición que se ingrese el nombre de cada
        alumno.
        e) Método crearCurso(): el método crear curso, le pide los valores de
        los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Curso. En este método invocamos al
        método cargarAlumnos() para asignarle valor al atributo alumnos
        f) Método calcularGananciaSemanal(): este método se encarga de
        calcular la ganancia en una semana por curso. Para ello, se deben
        multiplicar la cantidad de horas por día, el precio por hora, la
        cantidad de alumnos y la cantidad de días a la semana que se repite
        el encuentro.*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Llamamos a la clase entidad
    Curso crs = new Curso();

    /*d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
        los alumnos que asisten a las clases. Nosotros nos encargaremos de
        almacenar esta información en un arreglo e iterar con un bucle,
        solicitando en cada repetición que se ingrese el nombre de cada
        alumno.*/
    public String cargarAlumnos() {  // ok
        System.out.println("Cargar Alumnos");
        System.out.println("Ingrese el Nombre del Alumno");
        String nombre = leer.next();
        return nombre;
    }

    /*e) Método crearCurso(): el método crear curso, le pide los valores de
        los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Curso. En este método invocamos al
        método cargarAlumnos() para asignarle valor al atributo alumnos*/
    public Curso crearCurso() { //ok
        System.out.println("Ingrese el Nombre del Curso");
        crs.setNombreCurso(leer.next());
        System.out.println("Ingrese la Cantidad de Horas por Dia");
        crs.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Horas por Semana");
        crs.setCantidadHorasPorSemana(leer.nextInt());
        do {
            System.out.println("Ingrese el Turno (Manana / Tarde)");
            crs.setTurno(leer.next());
        } while (!((crs.getTurno().equalsIgnoreCase("manana")) || (crs.getTurno().equalsIgnoreCase("tarde"))));
        System.out.println("Ingrese el Precio por Hora");
        crs.setPrecioPorHora(leer.nextInt());

        return crs;
    }

    /*f) Método calcularGananciaSemanal(): este método se encarga de
        calcular la ganancia en una semana por curso. Para ello, se deben
        multiplicar la cantidad de horas por día, el precio por hora, la
        cantidad de alumnos y la cantidad de días a la semana que se repite
        el encuentro.*/
    public int calcularGananciaSemanal() {
        int cantAlumnos = 5;
        int cantDiasSemana;
        cantDiasSemana = crs.getCantidadHorasPorSemana() / crs.getCantidadHorasPorDia();
        int gananciaSemanal;
        gananciaSemanal = crs.getCantidadHorasPorDia() * crs.getPrecioPorHora() * cantAlumnos * cantDiasSemana;
        return gananciaSemanal;
    }

    //Creamos el metodo mostrar datos. No lo pide en el ejercicio
    public Curso mostrarDatos() {
        System.out.println("Curso: " + crs.getNombreCurso());
        System.out.println("Turno: " + crs.getTurno());
        System.out.println("Cantidad de Horas por Dia: " + crs.getCantidadHorasPorDia());
        System.out.println("Cantidad de Horas por Semana: " + crs.getCantidadHorasPorSemana());
        System.out.println("Precio por Hora: $" + crs.getPrecioPorHora());
        return crs;
    }
}
