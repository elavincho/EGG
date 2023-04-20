/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class AdivinanzaService {

    /*Crea una clase en Java donde declares una variable de tipo array de
        Strings que contenga los doce meses del año, en minúsculas. A
        continuación, declara una variable mesSecreto de tipo String, y hazla
        igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
        programa debe pedir al usuario que adivine el mes secreto. Si el usuario
        acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
        adivinar el mes secreto. Un ejemplo de ejecución del programa podría
        ser este:
        Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
        febrero
        No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
        ¡Ha acertado!*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    String mesSecreto = meses[8];
    boolean adivino = false;

    public void mesSecreto() {

        do {
            System.out.println("Introduzca el Mes");
            String ingreso = leer.next();
            if (ingreso.equalsIgnoreCase(meses[8])) {
                adivino = true;
            } else {
                adivino = false;
                System.out.println("Intentalo nuevamente!!");
                System.out.println("");
            }

        } while (!adivino);
        System.out.println("**********************************");
        System.out.println("*        Felicidades!!!          *");
        System.out.println("*  Adivinaste el Mes Secreto!!!  *");
        System.out.println("**********************************");
    }
}
