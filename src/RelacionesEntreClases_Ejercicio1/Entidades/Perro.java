/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_Ejercicio1.Entidades;


/**
 *
 * @author elavincho
 */
public class Perro {
    
    /*
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
        */
    
    private String nombrePerro;
    private String raza;
    private int edadPerro;
    private String tamano;
    
    private Persona adoptadoPor;

    public Perro() {
    }

    public Perro(String nombrePerro, String raza, int edadPerro, String tamano) {
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.edadPerro = edadPerro;
        this.tamano = tamano;
    }
    //Creamos una funcion para indicar por quien sera adoptado el perro
    public void adoptadoPor(Persona adoptadoPor) {
        this.adoptadoPor = adoptadoPor;
    }

    public Persona getAdoptadoPor() {
        return adoptadoPor;
    }

    public void setAdoptadoPor(Persona adoptadoPor) {
        this.adoptadoPor = adoptadoPor;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(int edadPerro) {
        this.edadPerro = edadPerro;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return  
                "\n" + nombrePerro + 
                "\n Raza = " + raza +
                "\n Edad = " + edadPerro +
                "\n Tamaño = " + tamano;
    }
}
