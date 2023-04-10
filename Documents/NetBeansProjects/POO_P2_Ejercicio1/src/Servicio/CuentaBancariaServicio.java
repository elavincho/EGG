/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.cuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class CuentaBancariaServicio {
    
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
    
    
    
    public cuentaBancaria crearCuenta(){
        cuentaBancaria cuenta = new cuentaBancaria();
        System.out.println("Ingrese el Numero de Cuenta del cliente");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        cuenta.setDniCliente(leer.nextInt());
        System.out.println("Ingrese el Saldo Actual");
        cuenta.setSaldoActual(leer.nextDouble());
        
        return cuenta;
    }
    
    public void ingresarDinero(cuentaBancaria cuenta) {
        System.out.println("Ingresar Dinero");
        Double ingresar = leer.nextDouble();
        System.out.println("Ingreso exitoso $ " + ingresar);
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingresar);
    }
    
    public void retirarDinero(cuentaBancaria cuenta) {
        System.out.println("Retirar Dinero");
        Double retirar = leer.nextDouble();
        if (retirar > (cuenta.getSaldoActual())) {
            System.out.println("Saldo Insusficiente");
        } else {
           System.out.println("Retiro exitoso $ " + retirar);
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar); 
        }
    }
    
    public void extraccionRapida(cuentaBancaria cuenta) {
        System.out.println("Extraccion Rapida");
        double extraccion = leer.nextDouble();
        if (extraccion > (cuenta.getSaldoActual()*0.20)) {
            System.out.println("Solo puede retirar el 20% de su saldo actual");
        }else {
            System.out.println("Su extraccion rapida fue exitosa");
            System.out.println("$ " + extraccion);
            cuenta.setSaldoActual(cuenta.getSaldoActual()- extraccion);
        }
    }
    
    public void consultarSaldo(cuentaBancaria cuenta) {
        System.out.println("Su saldo actual es:");
        System.out.println("$ " + cuenta.getSaldoActual());
    }

   public void consultarDatos(cuentaBancaria cuenta) {
       System.out.println(cuenta);
   }

    
    
}
