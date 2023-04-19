/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_p3_ejercicio4;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author elavincho
 */
public class POO_P3_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
        FechaService, en paquete Servicios, que tenga los siguientes métodos:
        a) Método fechaNacimiento que pregunte al usuario día, mes y año de
        su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
        El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
        new Date(anio, mes, dia);
        b) Método fechaActual que cree un objeto fecha con el día actual. Para
        esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
        fechaActual = new Date();
        El método debe retornar el objeto Date.
        c) Método diferencia que reciba las dos fechas por parámetro y retorna
        la diferencia de años entre una y otra (edad del usuario).
        Si necesiten acá tienen más información en clase Date: Documentacion
        Oracle*/
        //Llamamos a la clase servicio
        FechaService service = new FechaService();
        //Llamamos al metodo fechaNacimiento
        System.out.println("Fecha de Nacimiento");
        Date fechaNacimiento = service.fechaNacimiento();
        System.out.println(fechaNacimiento);
        System.out.println("");
        //Llamamos al metodo fechaActual
        System.out.println("Fecha Actual");
        Date fechaActual = service.fechaActual();
        System.out.println(fechaActual);
        System.out.println("");
        //Llamamos al medotodo diferencia
        System.out.println("Tu Edad");
        int edad = service.difencia(fechaActual, fechaNacimiento);
        System.out.println("Tienes " + edad + " años.");
    }

}
