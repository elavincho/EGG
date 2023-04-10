/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Empleado {
    
    /*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
        "salario". Luego, crea un método "calcular_aumento" que calcule el
        aumento salarial de un empleado en función de su edad y salario actual.
        El aumento salarial debe ser del 10% si el empleado tiene más de 30
        años o del 5% si tiene menos de 30 años.*/
    
    // Creamos los atributos
    public String nombre;
    public int edad;
    public int salario;
    
    // Creamos el constructor
    
    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    // Creamos el get

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }
    
    // Creamos el Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    Scanner leer = new Scanner(System.in);
    
    public Empleado crearEmpleado(){
        Empleado empleado = new Empleado();
        System.out.println("Ingrese el nombre del empleado");
        empleado.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad del empleado");
        empleado.setEdad(leer.nextInt());
        System.out.println("Ingrese el salario del empleado");
        empleado.setSalario(leer.nextInt());
        return empleado;
    }
    
    // Creamos la funcion 
    
    public int calcularAumento(Empleado empleado) {
       int aumento = 0;
       if (empleado.getEdad() > 30) {
           aumento = (int) (getSalario() * 1.1);
       }else {
           aumento = (int) (getSalario() * 1.05);
       }
       return aumento;
    }
}
