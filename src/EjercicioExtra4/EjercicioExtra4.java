/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4;
import EjercicioExtra4.Entidad.Empleados;
import EjercicioExtra4.Entidad.Estudiante;
import EjercicioExtra4.Entidad.Persona;
import EjercicioExtra4.Entidad.PersonalDeServicio;
import EjercicioExtra4.Entidad.Profesores;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author elavincho
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personaArrayList = new ArrayList<>();
        Persona persona = new Estudiante("Agustina", "Lucero", 456, "Casada", "Egg");
        personaArrayList.add(persona);
        Persona persona2 = new PersonalDeServicio("Nicolas", "Santos", 654, "Casado", 2021, 7, "Alpedismo");
        personaArrayList.add(persona2);
        Persona persona3 = new Profesores("Pedro", "Perez", 789, "Casado", 2021, 7, "Alpedismo");
        personaArrayList.add(persona3);

        persona.cambiarEstadoCivil();
        ((Empleados) persona2).reasignarDespacho();
        ((Estudiante) persona).matricular();
        ((Profesores) persona3).cambioDeDepartamento();

        System.out.println("--------------------");
        for (Persona personas : personaArrayList) {
            System.out.println(personas);
        }
    }
}

        
        
        
    