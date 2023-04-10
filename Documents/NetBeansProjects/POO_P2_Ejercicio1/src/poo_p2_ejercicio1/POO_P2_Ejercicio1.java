/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_p2_ejercicio1;

import Entidad.cuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;




/**
 *
 * @author elavincho
 */
public class POO_P2_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /*Realizar una clase llamada CuentaBancaria en el paquete Entidades con
        los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
        saldoActual. Agregar constructor vacío, con parámetros, getters y
        setters.
        Agregar la clase CuentaBancariaServicio en el paquete Servicios que
        contenga:
        a) Método para crear cuenta pidiéndole los datos al usuario.
        b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
        se le sumará al saldo actual.
        c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
        restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
        retirar se retirará el máximo posible hasta dejar la cuenta en 0.
        d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
        Validar que el usuario no saque más del 20%.
        e) Método consultarSaldo: permitirá consultar el saldo disponible en la
        cuenta.
        f) Método consultarDatos: permitirá mostrar todos los datos de la
        cuenta.*/
           
       Scanner leer = new Scanner(System.in);
       
        // Instanciamos el objeto del tipo servicio
       CuentaBancariaServicio servicio = new CuentaBancariaServicio();
       // Instanciamos el objeto del tipo entidad
       cuentaBancaria cuenta = servicio.crearCuenta();
       // Llamamos a los metodos del servicio
        int opcion;
      
       do {
           System.out.println("MENU");
           System.out.println("1. Ingresar Dinero");
           System.out.println("2. Retirar Dinero");
           System.out.println("3. Extraccion Rapida");
           System.out.println("4. Consultar Saldo");
           System.out.println("5. Consultar Datos");
           System.out.println("6. Salir");
           opcion = leer.nextInt();
           switch (opcion) {
               case 1:
                   servicio.ingresarDinero(cuenta);
                   break;
               case 2:
                   servicio.retirarDinero(cuenta);
                   break;
               case 3:
                   servicio.extraccionRapida(cuenta);
                   break;
               case 4:
                   servicio.consultarSaldo(cuenta);
                   break;
               case 5:
                   servicio.consultarDatos(cuenta);
                   break;
               case 6:
                   System.out.println("Muchas gracias por utilizar nuestro servicio");
                   break;
           }
           
       }while(opcion != 6);
       
       
       
       
       
       
       
       
       
       
       
       
       
        
    }
    
}
