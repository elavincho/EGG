/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra1.Service;

import EjercicioExtra1.Entidades.AlquilerAmarre;
import EjercicioExtra1.Entidades.BarcosEspeciales;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
/*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
        nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
        amarre y el barco que lo ocupará.
        Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
        Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Número de mástiles para veleros.
        • Potencia en CV para barcos a motor.
        • Potencia en CV y número de camarotes para yates de lujo.
        Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
        alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
        multiplicando por 10 los metros de eslora).
        En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
        sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
        en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
        el número de camarotes.
        Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
        métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
        precio final de su alquiler.
 */
public class BarcosService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarBarco(BarcosEspeciales barEsp) {
        System.out.println("==================CARGAR BARCOS===================");

        System.out.println("Ingrese la Matricula del Barco");
        barEsp.setMatricula(leer.next());
        System.out.println("Ingrese la Eslora del Barco (mts)");
        barEsp.setEslora(leer.nextInt());
        System.out.println("Ingrese el Año de Fabricacion del Barco");
        barEsp.setAnoFabricacion(leer.nextInt());
        System.out.println("El Barco es un Velero?? (S / N)");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el Numero de Mastiles");
            barEsp.setNroMastiles(leer.nextInt());
        } else {
            barEsp.setNroMastiles(0);
        }

        System.out.println("El Barco es a Motor??");
        String respuesta2 = leer.next();
        if (respuesta2.equalsIgnoreCase("S")) {
            System.out.println("Ingrese la Potencia en CV");
            barEsp.setPotenciaCV(leer.nextInt());
        } else {
            barEsp.setPotenciaCV(0);
        }

        System.out.println("El Barco es un Yate?? (S / N)");
        String respuesta3 = leer.next();
        if (respuesta3.equalsIgnoreCase("S")) {
            System.out.println("Ingrese la Cantidad de Camarotes");
            barEsp.setCamarotes(leer.nextInt());
        } else {
            barEsp.setCamarotes(0);
        }
    }

    public void alquilarAmarre(AlquilerAmarre alq, BarcosEspeciales barEsp) {
        System.out.println("==================ALQUILAR AMARRE==================");
        System.out.println("Ingrese el Nombre del Cliente");
        alq.setNombreCliente(leer.next());
        System.out.println("Ingrese el Documento del Cliente");
        alq.setDocumentoCliente(leer.next());
        System.out.println("Ingrese el Dia del Alquiler");
        int dia = leer.nextInt();
        System.out.println("Ingrese el Mes del Alquiler");
        int mes = leer.nextInt();
        System.out.println("Ingrese el Año del alquiler");
        int ano = leer.nextInt();
        Date fechaAlquiler = new Date(ano - 1900, mes - 1, dia);
        alq.setFechaAlquiler(fechaAlquiler);
        System.out.println("Ingrese el Dia de la Devolucion");
        int diaD = leer.nextInt();
        System.out.println("Ingrese el Mes de la Devolucion");
        int mesD = leer.nextInt();
        System.out.println("Ingrese el Año de la Devolucion");
        int anoD = leer.nextInt();
        Date fechaDevolucion = new Date(anoD - 1900, mesD - 1, diaD);
        alq.setFechaDevolucion(fechaDevolucion);
        System.out.println("Ingrese la Posicion del Amarre");
        alq.setPosicionAmarre(leer.next());
    }

    public int valorModulo(BarcosEspeciales barEsp, AlquilerAmarre alq) {
        System.out.println("================VALOR DEL MODULO==================");
        // Como java da la cuenta en milisegundos creamos una variable para poder dividirla y pasarla a dias
        // Cabe aclarar que 86400000 ms/dia = 24 hr/dia x 60 min/hr x 60 seg/min x 1000 ms/seg. 
        
        int milisecondsByDay = 86400000;
        int diasAlquilados = (int) ((alq.getFechaDevolucion().getTime() - alq.getFechaAlquiler().getTime())/milisecondsByDay);
        
        System.out.println("Dias Alquilados: " + diasAlquilados + " dias.");
        
        int valorModulo = 0;

        if (barEsp.getMatricula() != null) {
            valorModulo = barEsp.getEslora() * 10;
        } else if (barEsp.getNroMastiles() != 0) {
            valorModulo = valorModulo * barEsp.getNroMastiles();
        } else if (barEsp.getPotenciaCV() != 0) {
            valorModulo = valorModulo * barEsp.getPotenciaCV();
        } else if (barEsp.getCamarotes() != 0) {
            valorModulo = valorModulo * barEsp.getCamarotes();
        }
        System.out.println("Valor Modulo: " + valorModulo);
        
        int alqModulo = diasAlquilados * valorModulo;
        
        System.out.println("El importe a pagar por el alquiler del Modulo es $: " + alqModulo);

        return alqModulo;
    }
}
