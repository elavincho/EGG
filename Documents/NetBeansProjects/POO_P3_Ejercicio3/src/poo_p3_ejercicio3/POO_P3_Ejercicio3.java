/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_p3_ejercicio3;

import Servicio.ArregloServicio;

/**
 *
 * @author elavincho
 */
public class POO_P3_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
        arreglo B de 20 números reales. Crear la clase ArregloService, en el
        paquete servicio, con los siguientes métodos:
        1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
        números aleatorios.
        2) Método mostrar recibe un arreglo por parámetro y lo muestra por
        pantalla.
        3) Método ordenar recibe un arreglo por parámetro y lo ordena de
        mayor a menor.
        4) Método inicializarB copia los primeros 10 números del arreglo A en el
        arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
        En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
        mostrar A y B.*/
        
        /*A. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
        arreglo B de 20 números reales.*/
            
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
 
        // Llamamos a la clase servicio
        ArregloServicio servicio = new ArregloServicio();
        // Llamamos a la funcion inicializarA
        System.out.println("Inicializamos A");
        servicio.inicializarA(arregloA);
        //Llamamos a la funcion mostrar
        System.out.println("Mostramos A");
        servicio.mostrar(arregloA);
        //Llamamos a la funcion ordenar
        servicio.ordenar(arregloA);
        System.out.println("Ordenamos A");
        //Llamamos a la funcion inicializarB
        System.out.println("Inicializamos B");
        servicio.inicializarB(arregloA, arregloB);
        //Inicializamos nuevamente A
        System.out.println("Inicializamos nuevamente A");
        servicio.inicializarA(arregloA);
        //Mostramos nuevamente A
        System.out.println("Mostramos nuevamente A");
        servicio.mostrar(arregloA);
        //Ordenamos nuevamente A
        System.out.println("Ordenamos nuevamente A");
        servicio.ordenar(arregloA);
        //Inicializamos B
        System.out.println("Inicializamos nuevamente B");
        servicio.inicializarB(arregloA, arregloB);
        //Mostramos A y B
        System.out.println("Mostramos nuevamente A");
        servicio.mostrar(arregloA);
        System.out.println("Mostramos nuevamente B");
        servicio.mostrar(arregloB);
        
        
    }
}