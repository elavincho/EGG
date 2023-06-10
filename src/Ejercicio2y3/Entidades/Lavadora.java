/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2y3.Entidades;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Lavadora extends Electrodomestico {

    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, Character consumoElectrico, Integer peso) {
        super(precio, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        super.comprobarColor();
        super.comprobarConsumoElectrico();
        super.precioFinal();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la capacidad de carga de la lavadora(kg)");
        this.carga = leer.nextInt();
    }

    @Override
    public int precioFinal() {
        super.precioFinal();
        int nuevoPrecio;
        //System.out.println(carga);
        if (carga > 30) {
            nuevoPrecio = super.precioFinal() + 500;
            this.precio = nuevoPrecio;
            System.out.println("Precio =  $ " + nuevoPrecio);
        } else {
            nuevoPrecio = super.precioFinal();
            this.precio = nuevoPrecio;
            System.out.println("Precio =  $ " + nuevoPrecio);
        }
        return precio;
        
    }
}


