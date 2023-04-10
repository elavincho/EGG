/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicioextra6;

import Entidad.Empleado;

/**
 *
 * @author elavincho
 */
public class POO_EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
        "salario". Luego, crea un método "calcular_aumento" que calcule el
        aumento salarial de un empleado en función de su edad y salario actual.
        El aumento salarial debe ser del 10% si el empleado tiene más de 30
        años o del 5% si tiene menos de 30 años.*/
        
        // Llamamos a la clase empleado y la nombramos
        
        Empleado empleado = new Empleado();
        empleado = empleado.crearEmpleado();
        
        System.out.println("El nombre del empleado es: " + empleado.getNombre());
        System.out.println("La edad del empleado es: " + empleado.getEdad() + " años.");
        System.out.println("Su salario es: $" + empleado.getSalario());
        System.out.println("El nuevo salario del empleado es: $" + empleado.calcularAumento(empleado));
        
    }
    
}
