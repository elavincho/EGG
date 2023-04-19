/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.lang.reflect.Array;
import java.util.Arrays;
import poo_p3_ejercicio3.POO_P3_Ejercicio3;

/**
 *
 * @author elavincho
 */
public class ArregloServicio {
    
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
    
        //1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
        //números aleatorios.
    
    public void inicializarA(double[] arregloA) {
        System.out.println("InicializarA");
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int)(Math.random()*10);
        }
        System.out.println("");
    }
    
    //2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    
    public void mostrar(double[] arreglo) {
        System.out.println("Mostrar");
        //Mostramos por pantalla
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");   
        }
        System.out.println("");
    }

        //3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    
    public void ordenar(double[] arreglo) {
        System.out.println("Ordenar");
            Arrays.sort(arreglo);
        System.out.println("");
    }
    
        /*4) Método inicializarB copia los primeros 10 números del arreglo A en el
        arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
        En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
        mostrar A y B.*/
    public void inicializarB(double arregloA[], double arregloB[]){
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        System.out.print("[" + arregloB[i] + "]");    
        }
        
        System.out.println("");
    }

}
