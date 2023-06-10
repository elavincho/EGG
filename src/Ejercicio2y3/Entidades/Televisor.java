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
public class Televisor extends Electrodomestico {
    
    protected Double resolucion;
    protected Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Integer precio, String color, Character consumoElectrico, Integer peso) {
        super(precio, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        
        super.crearElectrodomestico();
        super.comprobarColor();
        super.comprobarConsumoElectrico();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la Resolucion del Televisor (En Pulgadas)");
        this.resolucion = leer.nextDouble();
        System.out.println("El Televisor tiene Sintonizador TDT (S / N)??");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("S")){
            this.sintonizadorTDT = true;
        }else{
            this.sintonizadorTDT = false;
        }
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */

    @Override
    public int precioFinal() {
       super.precioFinal();
       int nuevoPrecio;
       
       if(resolucion > 40){
            nuevoPrecio = (int)(super.precioFinal() * 1.30);
            this.precio = nuevoPrecio;
            System.out.println("Precio = $ " + nuevoPrecio);
       }else if(sintonizadorTDT == true){
           nuevoPrecio = super.precioFinal() + 500;
           this.precio = nuevoPrecio;
           System.out.println("Precio = $ " + nuevoPrecio);
       }
       
       
       return precio;
    }
}
