/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author elavincho
 */
public class ParDeNumerosServicio {

    /*Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.*/
    //Llamamos a la clase entidad
    //a) Método mostrarValores que muestra cuáles son los dos números
    //guardados.
    
    //Llamamos a la clase entidad e instanciamos el objeto
    ParDeNumeros pDn = new ParDeNumeros();

    public ParDeNumeros mostrarValores() {

        System.out.println("Mostramos los numeros");
        System.out.println("El primer numero es: " + pDn.getNum1());
        System.out.println("El segundo numero es: " + pDn.getNum2());
        return pDn;
    }

    //b) Método devolverMayor para retornar cuál de los dos atributos tiene
    //el mayor valor
    public double devolverMayor(ParDeNumeros mostrarValores) {
        double maximo;
        maximo = Math.max(pDn.getNum1(), pDn.getNum2());
        double minimo;
        minimo = Math.min(pDn.getNum1(), pDn.getNum2());
        System.out.println("El numero mayor es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
        return maximo;
    }

    //c) Método calcularPotencia para calcular la potencia del mayor valor de
    //la clase elevado al menor número. Previamente se deben redondear
    //ambos valores.
    public double calcularPotencia(ParDeNumeros pDn) {
        double minimo;
        minimo = Math.min(pDn.getNum1(), pDn.getNum2());
        double maximo;
        maximo = Math.max(pDn.getNum1(), pDn.getNum2());
        double potencia;
        potencia = Math.pow(maximo, minimo);
        System.out.println("La potencia es: " + maximo + "^" + minimo + " = " + potencia);
        return potencia;

    }

    /*d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    dos valores. Antes de calcular la raíz cuadrada se debe obtener el
    valor absoluto del número.*/
    public double calcularRaiz(ParDeNumeros pDn) {
        double minimo;
        minimo = Math.min(pDn.getNum1(), pDn.getNum2());
        double menor;
        menor = Math.abs(minimo);
        double raiz;
        raiz = Math.sqrt(menor);
        System.out.println("La raiz cuadrada de " + Math.abs(minimo) + " es: " + raiz);
        return raiz;
    }

}
