/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_EjercicioExtra1.Service;

import Colecciones_EjercicioExtra1.Entidad.Alumnos;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class AlumnoService {

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
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
     Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los
        objetos de este tipo.
     */
    public void altaAlumno(ArrayList<Alumnos> alumnos) {
        System.out.println("ALTA ALUMNOS");
        String salir;
        do {
            System.out.println("Ingrese el Nombre del Alumno");
            String nombre = (leer.next());
            System.out.println("Ingrese el Apellido del Alumno");
            String apellido = (leer.next());
            boolean nacionalidadOk = true;
            String nacionalidad;
            do {
                System.out.println("Ingrese la Nacionalidad del Alumno");
                System.out.println("Argentina, Chilena, Venezolana");
                nacionalidad = (leer.next());
                if (nacionalidad.equalsIgnoreCase("argentina")) {
                    nacionalidadOk = true;
                } else if (nacionalidad.equalsIgnoreCase("chilena")) {
                    nacionalidadOk = true;
                } else if (nacionalidad.equalsIgnoreCase("venezolana")) {
                    nacionalidadOk = true;
                } else {
                    nacionalidadOk = false;
                }
            } while (!nacionalidadOk);

            System.out.println("Ingrese su Dia de Nacimiento (DD)");
            int dia = leer.nextInt();
            System.out.println("Ingrese su Mes de Nacimiento (MM)");
            int mes = leer.nextInt();
            System.out.println("Ingrese su Año de Nacimiento (AAAA)");
            int anio = leer.nextInt();
            Date fecNac = new Date(anio - 1900, mes - 1, dia);
            // Creamos un objeto de tipo alumno con todos sus atributos
            Alumnos student = new Alumnos(nombre, apellido, nacionalidad, fecNac);
            //Agregamos el objeto alumno al ArrayList
            alumnos.add(student);
            System.out.println("Queres Agregar otro Alumno (S / N)");
            salir = leer.next();

        } while (salir.equalsIgnoreCase("S"));
        System.out.println("Mostramos la Lista de Alumnos");
        for (Alumnos mostrar : alumnos) {
            System.out.println(mostrar);
        }
        System.out.println("");
    }

    public void bajaAlumno(ArrayList<Alumnos> alumnos) {
        System.out.println("");
        System.out.println("DAR DE BAJA ALUMNO");
        System.out.println("Ingrese el Nombre del Alumno:");
        String baja = leer.next();

        boolean existe = false;

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(baja)) {
                alumnos.remove(i);
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("El alumno no se encuentra en la lista.");
        }
        System.out.println("");
        System.out.println("Mostramos la Lista de Alumnos:");
        for (Alumnos mostrar2 : alumnos) {
            System.out.println(mostrar2);
        }
        System.out.println("");

    }

    public void modificarAlumno(ArrayList<Alumnos> alumnos) {
        System.out.println("MODIFICAR ALUMNO");

        System.out.println("Ingrese el Nombre del Alumno que desea Modificar");
        String mofificar = leer.next();

        System.out.println("Desea Modificar el Nombre? (S / N)");
        String modifName = leer.next();
        if (modifName.equalsIgnoreCase("S")) {
            String respuesta;
            do {
                boolean existe = false;
                for (int i = 0; i < alumnos.size(); i++) {
                    if (alumnos.get(i).getNombre().equalsIgnoreCase(mofificar)) {
                        System.out.println("Ingrese el Nuevo Nombre del Alumno");
                        alumnos.get(i).setNombre(leer.next());
                        existe = true;
                    }
                    if (existe == false) {
                        System.out.println("El Nombre del Alumno no se encuentra en la lista");
                    }
                }
                System.out.println("Modifico el Nombre Correctamente? (S / N)");
                respuesta = leer.next();
            } while (respuesta.equalsIgnoreCase("n"));
        }

        System.out.println("Desea Modificar el Apellido? (S / N)");
        String modifApellido = leer.next();

        if (modifApellido.equalsIgnoreCase("S")) {
            String respuesta1;
            do {
                boolean existe1 = false;
                System.out.println("Ingrese el Apellido que desea Modificar");
                String apell = leer.next();
                for (int i = 0; i < alumnos.size(); i++) {
                    if (alumnos.get(i).getApellido().equalsIgnoreCase(apell)) {
                        System.out.println("Ingrese el Nuevo Apellido del Alumno");
                        alumnos.get(i).setApellido(leer.next());
                        existe1 = true;
                    }
                    if (existe1 == false) {
                        System.out.println("El Nombre del Alumno no se encuentra en la lista");
                    }
                }
                System.out.println("Modifico el Apellido Correctamente? (S / N)");
                respuesta1 = leer.next();
            } while (respuesta1.equalsIgnoreCase("n"));
        }

        System.out.println("Desea Modificar la Nacionalidad? (S / N)");
        String modifNac = leer.next();

        if (modifNac.equalsIgnoreCase("S")) {
            boolean existe2 = false;
            System.out.println("Ingrese la Nacionalidad que desea Modificar");
            String nac = leer.next();
            String respuesta2;

            do {
                for (int i = 0; i < alumnos.size(); i++) {
                    if (alumnos.get(i).getNacionalidad().equalsIgnoreCase(nac)) {
                        boolean nacionalidadOk = true;
                        do {
                            System.out.println("Ingrese la Nueva Nacionalidad del Alumno");
                            alumnos.get(i).setNacionalidad(leer.next());

                            if (alumnos.get(i).getNacionalidad().equalsIgnoreCase("argentina")) {
                                nacionalidadOk = true;
                                existe2 = true;
                            } else if (alumnos.get(i).getNacionalidad().equalsIgnoreCase("chilena")) {
                                nacionalidadOk = true;
                                existe2 = true;
                            } else if (alumnos.get(i).getNacionalidad().equalsIgnoreCase("venezolana")) {
                                nacionalidadOk = true;
                                existe2 = true;
                            } else {
                                nacionalidadOk = false;
                                existe2 = false;
                            }
                        } while (nacionalidadOk);
                        if (existe2 == false) {
                            System.out.println("La Nacionalidad del Alumno no se encuentra en la lista");
                        }
                    }
                }
                System.out.println("Modifico la Nacionalidad Correctamente? (S / N)");
                respuesta2 = leer.next();
            } while (respuesta2.equalsIgnoreCase("s"));
        }
        System.out.println("Desea Modificar la Fecha de Nacimiento del Alumno? (S / N)");
        String modifFecNac = leer.next();

        if (modifFecNac.equalsIgnoreCase("S")) {
            String respuesta3;
            do {
                for (int i = 0; i < alumnos.size(); i++) {
                    if (alumnos.get(i).getNombre().equalsIgnoreCase(mofificar)) {
                        System.out.println("Ingrese su Dia de Nacimiento (DD)");
                        int dia = leer.nextInt();
                        System.out.println("Ingrese su Mes de Nacimiento (MM)");
                        int mes = leer.nextInt();
                        System.out.println("Ingrese su Año de Nacimiento (AAAA)");
                        int anio = leer.nextInt();
                        Date fecNac = new Date(anio - 1900, mes - 1, dia);
                    }
                }
                System.out.println("Modifico la Fecha de Nacimiento Correctamente? (S / N)");
                respuesta3 = leer.next();
            } while (respuesta3.equalsIgnoreCase("n"));

            System.out.println("Mostramos la Lista de Alumnos");
            for (Alumnos mostrar3 : alumnos) {
                System.out.println(mostrar3);
            }
        }
    }
}
