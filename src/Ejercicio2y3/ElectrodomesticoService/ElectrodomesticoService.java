/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2y3.ElectrodomesticoService;

import Ejercicio2y3.Entidades.ElectrodomesticoV2;
import Ejercicio2y3.Entidades.LavadoraV2;
import Ejercicio2y3.Entidades.TelevisorV2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class ElectrodomesticoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Random aleatorio = new Random();

    public void comprobarConsumoElectrico(ElectrodomesticoV2 electroV2) {

        char consElect = electroV2.getConsElectrico();

        if (consElect == 'A' || consElect == 'B' || consElect == 'C' || consElect == 'D' || consElect == 'E' || consElect == 'F') {
            System.out.println("Se eligio correctamente el consumo electrico " + consElect);
        } else {
            electroV2.setConsElectrico('F');
            System.out.println("Se eligio por defecto el consumo electrico " + "F");
        }

    }

    public void comprobarConsumoElectricoAleatorio(ElectrodomesticoV2 electroV2) {
        //Creamos el valor del consumo electrico de forma aleatoria (de la A hasta la H para que tenga un margen de error)
        char consElect = (char) (aleatorio.nextInt(8) + 'A');

        if (consElect == 'A' || consElect == 'B' || consElect == 'C' || consElect == 'D' || consElect == 'E' || consElect == 'F') {
            System.out.println("Se eligio correctamente el consumo electrico " + consElect);
        } else {
            electroV2.setConsElectrico('F');
            System.out.println("Se eligio por defecto el consumo electrico " + "F");
        }

    }

    public void comprobarColor(ElectrodomesticoV2 electroV2) {

        String elegirColor = electroV2.getColor();

        if ("Blanco".equalsIgnoreCase(elegirColor) || "Negro".equalsIgnoreCase(elegirColor) || "Rojo".equalsIgnoreCase(elegirColor) || "Azul".equalsIgnoreCase(elegirColor) || "Gris".equalsIgnoreCase(elegirColor)) {
            System.out.println("Se eligio correctamente el color " + elegirColor);
        } else {
            electroV2.setColor("Blanco");
            System.out.println("Se eligio por defecto el color Blanco.");
        }
    }

    public void comprobarColorGenAleatorio(ElectrodomesticoV2 electroV2) {

        //Codigo para crear el color de forma aleatoria con 2 colores mas para que tenga un margen de error
        String[] color = {"Blanco", "Negro", "Rojo", "Azul", "Gris", "Verde", "Violeta"};
        String elegirColor = color[(aleatorio.nextInt(color.length))];
        System.out.println(elegirColor);

        if ("Blanco".equalsIgnoreCase(elegirColor) || "Negro".equalsIgnoreCase(elegirColor) || "Rojo".equalsIgnoreCase(elegirColor) || "Azul".equalsIgnoreCase(elegirColor) || "Gris".equalsIgnoreCase(elegirColor)) {
            System.out.println("Se eligio correctamente el color.");
        } else {
            electroV2.setColor("Blanco");
            System.out.println("Se eligio por defecto el color Blanco.");
        }
    }

    public ElectrodomesticoV2 crearElectrodomestico() {

        System.out.println("    Ingrese el color del electrodomestico");
        System.out.println("     Blanco - Negro - Rojo - Azul - Gris");
        String color = leer.next().toUpperCase();
        System.out.println("Ingrese el consumo electrico del electrodomestico");
        System.out.println("            A - B - C - D - E - F");

        char consElectrico = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico");
        int peso = leer.nextInt();
        //Establecemos el precio base
        int precio = 1000;

        return new ElectrodomesticoV2(precio, color, consElectrico, peso);
    }

    public LavadoraV2 crearLavadoraV2(ArrayList<ElectrodomesticoV2> listaElectrodomesticos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Creamos el objeto tipo electrodomesticoV2 y llamamos a la funcion crear electrodomestico
        ElectrodomesticoV2 electroV2 = crearElectrodomestico();
        comprobarColor(electroV2);
        comprobarConsumoElectrico(electroV2);

        System.out.println("Ingrese la capacidad de carga de la lavadora(kg)");
        int carga = leer.nextInt();

        //Creamos el objeto tipo lavadoraV2 y lo llenamos con todos los atributos de electrodomesticoV2 y lavadoraV2
        LavadoraV2 lavaV2 = new LavadoraV2(carga, electroV2.getPrecio(), electroV2.getColor(), electroV2.getConsElectrico(), electroV2.getPeso());
        //Agregamos la lavadora a la lista
        listaElectrodomesticos.add(lavaV2);
        return lavaV2;
    }

    public TelevisorV2 crearTelevisorV2(ArrayList<ElectrodomesticoV2> listaElectrodomesticos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Creamos el objeto tipo electrodomesticoV2 y llamamos a la funcion crear electrodomestico
        ElectrodomesticoV2 electrodomV2 = crearElectrodomestico();
        comprobarColor(electrodomV2);
        comprobarConsumoElectrico(electrodomV2);

        System.out.println("Ingrese la Resolucion del Televisor (En Pulgadas)");
        int resolucion = leer.nextInt();
        System.out.println("El Televisor tiene Sintonizador TDT (S / N)??");
        String respuesta = leer.next();
        boolean sintonizadorTDT;
        if (respuesta.equalsIgnoreCase("S")) {
            sintonizadorTDT = true;
        } else {
            sintonizadorTDT = false;
        }
        //Creamos el objeto tipo televisor
        TelevisorV2 teleV2 = new TelevisorV2(resolucion, sintonizadorTDT, electrodomV2.getPrecio(), electrodomV2.getColor(), electrodomV2.getConsElectrico(), electrodomV2.getPeso());
        //Agregamos el televisor a la lista
        listaElectrodomesticos.add(teleV2);
        return teleV2;
    }

    public void listaElectro(ArrayList<ElectrodomesticoV2> listaElectrodomesticos) {
        //Creamos los electrodomesticos
        LavadoraV2 laV2a = new LavadoraV2(8, 135000, "Verde", 'C', 45);
        LavadoraV2 laV2b = new LavadoraV2(10, 150000, "Violeta", 'A', 52);

        TelevisorV2 TeV2a = new TelevisorV2(32, true, 62000, "Negro", 'B', 12);
        TelevisorV2 TeV2b = new TelevisorV2(50, true, 98000, "Gris", 'A', 15);
        //Agregamos a la lista los electrodomesticos
        listaElectrodomesticos.add(laV2a);
        listaElectrodomesticos.add(laV2b);
        listaElectrodomesticos.add(TeV2a);
        listaElectrodomesticos.add(TeV2b);

        System.out.println("Lista de Electrodomesticos");
        System.out.println(listaElectrodomesticos);
    }

    public int sumaPrecios(ArrayList<ElectrodomesticoV2> listaElectrodomesticos) {

        int sumaPrecios = 0;
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            sumaPrecios += listaElectrodomesticos.get(i).getPrecio();
        }
        System.out.println("Suma de Todos los Precios = $ " + sumaPrecios);
        return sumaPrecios;
    }
}
