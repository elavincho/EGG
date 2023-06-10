/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ejercicio3.Service;

import Colecciones_Ejercicio3.Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class AlumnoService {

    /*
        Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
        alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
        con sus 3 notas.
        En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
        toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        pregunta al usuario si quiere crear otro Alumno o no.
        Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
        Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
        final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
        del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
        promedio final, devuelto por el método y mostrado en el main.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno(ArrayList<Alumno> alumnos) {
        String salir;
        do {
            System.out.println("Ingrese el nombre del Alumno");
            String nombre = leer.next();
            System.out.println("Ingrese las Notas del Alumno");
            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            System.out.println("Quiere agregar otro Alumno? (S / N)");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("S"));
        System.out.println("");
        for (Alumno mostrar : alumnos) {
            System.out.println(mostrar);
        }
        System.out.println("");
    }

    public void metodoFinal(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el Nombre del Alumno para calcular su Nota Final");
        String nome = leer.next();
        System.out.println("");
        int promedio = 0;
        boolean existe = true;

        for (Alumno mostrar : alumnos) {

            if (mostrar.getNombre().equalsIgnoreCase(nome)) {
                existe = true;
                for (int notas : mostrar.getNotas()) {
                    promedio += notas;
                }
                System.out.println("El promedio de " + mostrar.getNombre() + " es: " + promedio / 3);
            } else {
                existe = false;
            }
        }
        if (existe == false) {
            System.out.println("El nombre no se encuentra en la lista");
        }
    }
}
