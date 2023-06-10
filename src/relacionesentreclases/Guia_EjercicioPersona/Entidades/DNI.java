/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases.Guia_EjercicioPersona.Entidades;

/**
 *
 * @author elavincho
 */
public class DNI {
    
    /*
        EJERCICIO PERSONA
        Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
        objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
        acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
        */
    
    public String caracter;
    public int numero;

    public DNI() {
    }

    public DNI(String caracter, int numero) {
        this.caracter = caracter;
        this.numero = numero;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "Caracter = " + caracter + ", Numero = " + numero + '}';
    }
}
