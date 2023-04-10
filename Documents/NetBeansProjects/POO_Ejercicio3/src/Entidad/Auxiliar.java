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
public class Auxiliar {
    
    /*Crear una clase llamada Operacion que tenga como atributos privados
        numero1 y numero2. A continuación, se deben crear los siguientes
        métodos:
        a) Método constructor con todos los atributos pasados por parámetro.
        b) Método constructor sin los atributos pasados por parámetro.
        c) Métodos get y set.
        d) Método para crearOperacion(): que le pide al usuario los dos
        números y los guarda en los atributos del objeto.
        e) Método sumar(): calcular la suma de los números y devolver el
        resultado al main.
        f) Método restar(): calcular la resta de los números y devolver el
        resultado al main
        g) Método multiplicar(): primero valida que no se haga una
        multiplicación por cero, si fuera a multiplicar por cero, el método
        devuelve 0 y se le informa al usuario el error. Si no, se hace la
        multiplicación y se devuelve el resultado al main
        h) Método dividir(): primero valida que no se haga una división por cero,
        si fuera a pasar una división por cero, el método devuelve 0 y se le
        informa al usuario el error se le informa al usuario. Si no, se hace la
        división y se devuelve el resultado al main.*/
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        Operacion operacion = new Operacion();
        System.out.println("Ingrese el primer numero");
        operacion.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        operacion.setNumero2(leer.nextInt());
        return operacion;

    }
    // Creamos el metodo Sumar 
    public int Sumar(Operacion operacion) {
        int suma = operacion.getNumero1() + operacion.getNumero2();
            return suma;
    }
    
    // Creamos el metodo Restar
    public int Restar(Operacion operacion) {
        int resta = operacion.getNumero1() - operacion.getNumero2();
        return resta;
    }
    
    // Creamos el metodo Multiplicar
    public int Multiplicar(Operacion operacion) {
        if ((operacion.getNumero1() == 0) || operacion.getNumero2() == 0) {
            System.out.println("ERROR. NO SE PUEDE MULTIPLICAR POR 0");
            return 0;
        }else {
            int multiplicacion = operacion.getNumero1() * operacion.getNumero2();
            return multiplicacion;
        }
    }

   // Creamos el metodo dividir
    public double Dividir (Operacion operacion) {
        if ((operacion.getNumero1() == 0) || (operacion.getNumero2() == 0)) {
            System.out.println("ERROR. NO SE PUEDE DIVIDIR POR 0");
            return 0;
        }else {
            int division = operacion.getNumero1() / operacion.getNumero2();
            return division;
        }
    }
    
}
