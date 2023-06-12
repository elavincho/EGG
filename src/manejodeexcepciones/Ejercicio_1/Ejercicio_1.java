/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexcepciones.Ejercicio_1;

import manejodeexcepciones.Ejercicio1.Entidad.Persona;
import manejodeexcepciones.Ejercicio1.Servicio.PersonaServicio;

/**
 *
 * @author elavincho
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    /* MANEJO DE EXCEPCIONES
    Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
    de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
    con una cláusula try-catch para probar la nueva excepción que debe ser controlada. 
     */
    public static void main(String[] args) {
       
        //Persona(String nombre, int edad, String sexo, double peso, double altura)
        //Inicializamos el objeto de tipo persona en null
        Persona persona = null;

        try {//Intentar
            //Intentamos ejecutar el metodo mayor de edad
            persona.esMayorDeEdad();
        } catch (Exception e) {//Agarrar
            //Como no se puede ejecutar muestra el mensaje de error
            System.out.println("Error de Sistema!!!");
        }finally{//Codigo que siempre se ejecuta
            System.out.println("Fin del Programa!");
        }
        // throw: lanza una excepcion cualquiera. De esta forma podemos provocar 
        //la excepcion y forzarla a que se ejecute.
        //throws: Arroja. Determinar que excepciones puede lanzar un metodo.
    }
}
