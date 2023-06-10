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
public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected Character consumoElectrico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character consumoElectrico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(Character consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("    Ingrese el color del electrodomestico");
        System.out.println("     Blanco - Negro - Rojo - Azul - Gris");
        this.color = leer.next();
        System.out.println("Ingrese el consumo electrico del electrodomestico");
        System.out.println("            A - B - C - D - E - F");
        this.consumoElectrico = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextInt();
    }
    
    public void comprobarColor() {

        String elegirColor = color;

        if ("Blanco".equalsIgnoreCase(elegirColor) || "Negro".equalsIgnoreCase(elegirColor) || "Rojo".equalsIgnoreCase(elegirColor) || "Azul".equalsIgnoreCase(elegirColor) || "Gris".equalsIgnoreCase(elegirColor)) {
            System.out.println("Se eligio correctamente el color " + elegirColor);
        } else {
            this.color = "Blanco";
            System.out.println("Se eligio por defecto el color Blanco.");
        }
    }
    
    public void comprobarConsumoElectrico() {

        char consElect = consumoElectrico;

        if (consElect == 'A' || consElect == 'B' || consElect == 'C' || consElect == 'D' || consElect == 'E' || consElect == 'F') {
            System.out.println("Se eligio correctamente el consumo electrico " + consElect);
        } else {
            this.consumoElectrico = 'F';
            System.out.println("Se eligio por defecto el consumo electrico " + "F");
        }
    }
    
    
    public int precioFinal(){
        
        this.precio = 1000;
        switch (consumoElectrico) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }

        int catPeso = 0;

        if (peso > 1 && peso < 19) {
            catPeso = 1;
        } else if (peso > 20 && peso < 49) {
            catPeso = 2;
        } else if (peso > 50 && peso < 79) {
            catPeso = 3;
        } else if (peso > 80) {
            catPeso = 4;
        }

        switch (catPeso) {
            case 1:
                precio += 100;
                break;
            case 2:
                precio += 500;
                break;
            case 3:
                precio += 800;
                break;
            case 4:
                precio += 1000;
                break;
        }

        return precio;
    }
}
