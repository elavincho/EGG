/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicioextra1;

import Entidad.Cancion;

/**
 *
 * @author elavincho
 */
public class POO_EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Desarrollar una clase Cancion con los siguientes atributos: título y autor.
        Se deberá́definir además dos constructores: uno vacío que inicializa el
        título y el autor a cadenas vacías y otro que reciba como parámetros el
        título y el autor de la canción. Se deberán además definir los métodos
        getters y setters correspondientes.*/
        
        // Llamamos a la clase cancion
        Cancion canc = new Cancion();
        
        Cancion cancion = canc.crearCancion();
        System.out.println("");
        System.out.println("El titulo de la cancion es: " + cancion.titulo);
        System.out.println("El autor de la cancion es: " + cancion.autor);
        
        

        

    }
    
}
