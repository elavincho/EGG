/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class FechaService {

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
    Scanner leer = new Scanner(System.in);

    /*a) Método fechaNacimiento que pregunte al usuario día, mes y año de
        su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
        El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
        new Date(anio, mes, dia);*/
    public Date fechaNacimiento() {
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int anio = leer.nextInt();
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        return fechaNacimiento;
    }

    /*b) Método fechaActual que cree un objeto fecha con el día actual. Para
        esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
        fechaActual = new Date();
        El método debe retornar el objeto Date.*/
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    //c) Método diferencia que reciba las dos fechas por parámetro y retorna
    //la diferencia de años entre una y otra (edad del usuario).
    public int difencia(Date fechaActual, Date fechaNacimiento) {
        int edad;

        if (fechaNacimiento.getMonth() > fechaActual.getMonth() || fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate()) {
            edad = (fechaActual.getYear() - fechaNacimiento.getYear()) - 1;
        } else {
            edad = fechaActual.getYear() - fechaNacimiento.getYear();
        }

        return edad;
    }

}
