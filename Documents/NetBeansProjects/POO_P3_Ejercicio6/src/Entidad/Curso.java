/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author elavincho
 */
public class Curso {

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
    public String nombre;
    public String nombreCurso;
    public int cantidadHorasPorDia;
    public int cantidadHorasPorSemana;
    public String turno;
    public int precioPorHora;
    public String alumnos[];

    public Curso() {
    }

    public Curso(String nombre, String nombreCurso, int cantidadHorasPorDia, int cantidadHorasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombre = nombre;
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadHorasPorSemana() {
        return cantidadHorasPorSemana;
    }

    public void setCantidadHorasPorSemana(int cantidadHorasPorSemana) {
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "";
    }

}
