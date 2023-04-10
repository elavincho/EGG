/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author elavincho
 */
public class cuentaBancaria {
    
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
    
    // Creamos los atributos
    public int numeroCuenta;
    public int dniCliente;
    public double saldoActual;
    public double ingresarDinero;
    
    // Creamos el contructor por defecto

    public cuentaBancaria() {
    }
    
    
    // Creamos el constructor por parametros

    public cuentaBancaria(int numeroCuenta, int dniCliente, double saldoActual, double ingresarDinero) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.ingresarDinero = ingresarDinero;
    }
    
    // Creamos los Getter

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getIngresarDinero() {
        return ingresarDinero;
    }
    
    // Creamos los Setter

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setIngresarDinero(Double ingresarDinero) {
        this.ingresarDinero = ingresarDinero;
    }
    
    // Creamos el toString

    @Override
    public String toString() {
        return "cuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }


    
    
    
    
}
