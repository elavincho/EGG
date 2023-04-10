/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class RaicesServicio {

    /*RaicesServicio las operaciones que se podrán realizar son las siguientes:
        a) Método getDiscriminante(): devuelve el valor del discriminante
        (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
        b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
        soluciones, para que esto ocurra, el discriminante debe ser mayor o
        igual que 0.
        c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
        única solución, para que esto ocurra, el discriminante debe ser igual
        que 0.
        d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
        imprime las 2 posibles soluciones.
        e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
        una única raíz. Es en el caso en que se tenga una única solución
        posible.
        f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
        y mostrará por pantalla las posibles soluciones que tiene nuestra
        ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
        que devuelvan nuestros métodos y en caso de no existir solución, se
        mostrará un mensaje.
        Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
        el signo delante de -b*/
    Scanner leer = new Scanner(System.in);
    // Llamamos a la clase raices
    Raices rc = new Raices();

    public Raices crearValores() {
        System.out.println("Ingrese el valor de A");
        rc.setA(leer.nextInt());
        System.out.println("Ingrese el valor de B");
        rc.setB(leer.nextInt());
        System.out.println("Ingrese el valor de C");
        rc.setC(leer.nextInt());
        return rc;
    }

    double ecuacionPos;// = -rc.getB() + (Math.sqrt((Math.pow(rc.getB(), 2)) - (4 * rc.getA() * rc.getC()))) / (2 * rc.getA());
    double ecuacionNeg;// = -rc.getB() - (Math.sqrt((Math.pow(rc.getB(), 2)) - (4 * rc.getA() * rc.getC()))) / (2 * rc.getA());

    //a) Método getDiscriminante(): devuelve el valor del discriminante
    //(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double Discriminante() {
        double discriminante = ((Math.pow(rc.getB(), 2) - (4 * rc.getA() * rc.getC())));
        System.out.println("Discriminante: " + discriminante);
        return discriminante;
    }

    //    b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
    //    soluciones, para que esto ocurra, el discriminante debe ser mayor o
    //    igual que 0.
    public boolean tieneRaices(double Discriminante) {

        boolean tRaices = false;

        if (Discriminante >= 0) {
            tRaices = true;
        }
        return tRaices;
    }

    //c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
    //única solución, para que esto ocurra, el discriminante debe ser igual
    //que 0.
    public boolean tieneRaiz(double Discriminante) {
        boolean tRaiz = false;

        if (Discriminante == 0) {
            tRaiz = true;
        }
        return tRaiz;
    }

    //d) Método obtenerRaices(): llama a tieneRaices() y si devolvió́true,
    //imprime las 2 posibles soluciones.
    public void obtenerRaices(boolean tRaices) {

        if (tRaices == true) {
            System.out.println("ecuacionPos =  " + ecuacionPos);
            System.out.println("ecuacionNeg =  " + ecuacionNeg);
        }
    }

    //e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
    // una única raíz. Es en el caso en que se tenga una única solución
    // posible.
    public void obtenerRaiz(boolean tRaiz) {
        if (tRaiz == true) {
            System.out.println("ecuacionPos = " + ecuacionPos);
        }
    }

    //f) Método calcular(): esté método llamará tieneRaices() y a tieneRaiz(),
    //y mostrará por pantalla las posibles soluciones que tiene nuestra
    //ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    //que devuelvan nuestros métodos y en caso de no existir solución, se
    //mostrará un mensaje.
    //Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
    //el signo delante de -b*/
    public void Calcular(boolean tRaices, boolean tRaiz) {

        ecuacionPos = (-rc.getB()) + Math.sqrt(Math.pow(rc.getB(), 2)-(4 * rc.getA() * rc.getC())) / (2 * rc.getA());
        //ecuacionNeg = (-rc.getB()) - Math.sqrt(Math.pow(rc.getB(), 2)-(4 * rc.getA() * rc.getC())) / (2 * rc.getA());

        if (tRaices == true) {
            System.out.println("ecuacion = " + ecuacionPos*(-1));
            System.out.println("ecuacion = " + ecuacionPos);
        } else if (tRaiz == true) {
            System.out.println("ecuacion = " + ecuacionPos);
        }else {
            System.out.println("No tiene solucion");
        }

    }

}
