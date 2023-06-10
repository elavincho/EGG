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
public class Persona {

    /*
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
     */
    private String nombrePersona;
    private String apellido;
    private int edadPersona;
    private int documento;
    private Perro dog;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellido, int edadPersona, int documento) {
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.edadPersona = edadPersona;
        this.documento = documento;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getDog() {
        return dog;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

//Creamos una funcion para indicar el perro que se va a adoptar
    public void adoptar(Perro dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "\n" + nombrePersona + " " + apellido
                + "\n Edad = " + edadPersona
                + "\n Documento = " + documento
                + "\n Adopto a:" + dog;
    }
}
