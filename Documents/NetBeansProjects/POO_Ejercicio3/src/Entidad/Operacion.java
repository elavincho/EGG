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
public class Operacion {
    
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
    
    // Creamos los atributos 
    public int numero1;
    public int numero2;
    
    // Creamos el metodo constructor vacio para que se pueda crear el objeto
    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Creamos el Set 
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    // Creamos el Get
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    
}
