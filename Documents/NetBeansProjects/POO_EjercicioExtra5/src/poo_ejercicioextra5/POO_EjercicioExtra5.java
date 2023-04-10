/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicioextra5;

import Entidad.Cuenta;

/**
 *
 * @author elavincho
 */
public class POO_EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
        Luego, crea un método "retirar_dinero" que permita retirar una cantidad
        de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
        negativo después de realizar una transacción de retiro.*/
        
        // Llamamos a la clase cuenta 
        Cuenta cuenta = new Cuenta();
        
       cuenta = cuenta.crearCuenta();
       
        System.out.println("Sr. " + cuenta.getTitular() + " va a retirar: ");
        System.out.println("$ " + cuenta.retirarDinero(cuenta));
        
        
        
    }
    
}
