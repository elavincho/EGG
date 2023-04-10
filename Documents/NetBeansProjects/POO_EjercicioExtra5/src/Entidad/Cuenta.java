/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Cuenta {
    
    /*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
        Luego, crea un método "retirar_dinero" que permita retirar una cantidad
        de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
        negativo después de realizar una transacción de retiro.*/
    
    // creamos los atributos
    public int saldo;
    public String titular;
    public int monto;
    
    // Creamos el constructor

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.monto = monto;
    }
    
    // Creamos el Getter

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getMonto() {
        return monto;
    }
    
    
    
    // Creamos el Setter

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese el nombre del Titular");
        cuenta.setTitular(leer.nextLine());
        System.out.println("Ingrese su Saldo inicial");
        cuenta.setSaldo(leer.nextInt());
        System.out.println("Ingrese el monto que desea retirar");
        cuenta.setMonto(leer.nextInt());
        return cuenta;
    }
    
    int retirar; 
    
    public int retirarDinero(Cuenta crearCuenta) {
        
        
        
        if (getSaldo() > getMonto()){
           
            retirar = getMonto();
            return retirar;
        } else if (getSaldo() < getMonto()) {
            System.out.println("Saldo Insusficiente");
            return retirar;
        }
        
        return retirar;
    }

    
}
