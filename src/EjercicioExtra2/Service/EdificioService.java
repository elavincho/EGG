/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.Service;

import EjercicioExtra2.Entidades.Edificio;
import EjercicioExtra2.Entidades.EdificioOficinas;
import EjercicioExtra2.Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
/*
    Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
    edificio tendrá como métodos:
    • Método calcularSuperficie(): calcula la superficie del edificio.
    • Método calcularVolumen(): calcula el volumen del edifico.
    Estos métodos serán abstractos y los implementarán las siguientes clases:
    • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
    Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
    • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
    por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
    los atributos del padre.
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
    cuantas personas entrarían en un piso y cuantas en todo el edificio.
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
    dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
    métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
    superficie y el volumen de cada edificio.
    Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
    techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
    cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
public class EdificioService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo crearPolideportivo(ArrayList<Edificio> edificio) {
        System.out.println("=================CARGAR POLIDEPORTIVO==============");
        System.out.println("");
        System.out.println("Ingrese el Nombre de Polideportivo");
        String nombre = leer.next();
        String tipoIns;
        do {
            System.out.println("Ingrese el Tipo de Instalacion (Abierto / Techado)");
            tipoIns = leer.next();
        } while (!(tipoIns.equalsIgnoreCase("abierto")) && (!(tipoIns.equalsIgnoreCase("techado"))));
        System.out.println("Ingrese el Alto del Polideportivo");
        int alto = leer.nextInt();
        System.out.println("Ingrese el Ancho del Polideportivo");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el Largo del Polideportivo");
        int largo = leer.nextInt();
        //Instanciamos el objeto tipo polideportivo
        Polideportivo poli = new Polideportivo(nombre, tipoIns, alto, ancho, largo);
        //Agregamos el polideportivo a la lista de Edificios
        edificio.add(poli);

        return poli;
    }

    public void crearEdificioOficinas(EdificioOficinas edif, ArrayList<Edificio> edificio) {
        System.out.println("============CARGAR EDIFICIO DE OFICINAS=============");
        System.out.println("");
        System.out.println("Ingrese el Numero de Oficinas del Edificio");
        edif.setNroOficinas(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Personas x Oficina");
        edif.setCantPersonasxOficina(leer.nextInt());
        System.out.println("Ingrese el Numero de Pisos del Edificio");
        edif.setNroPisos(leer.nextInt());
        System.out.println("Ingrese la Altura del Edificio");
        edif.setAlto(leer.nextInt());
        System.out.println("Ingrese el Ancho del Edificio");
        edif.setAncho(leer.nextInt());
        System.out.println("Ingrese el Largo del Edificio");
        edif.setLargo(leer.nextInt());
        //Agregamos el edificio a la lista de edificios
        edificio.add(edif);
    }

    public void mostrarEdificios(ArrayList<Edificio> edificio) {
        System.out.println("==========MOSTRAR LISTA DE EDIFICIOS===============");
        System.out.println("");
        
        int contTechado = 0;
        int contAbierto = 0;
        for (Edificio aux : edificio) {

            if (aux instanceof Polideportivo) {
                System.out.println(aux.toString());
                aux.calcularSuperfice();
                aux.calcularVolumen();

                if (((Polideportivo) aux).getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    contTechado++;
                } else {
                    contAbierto++;
                }
                System.out.println("La cantidad de Polideportivos son: " + (contTechado + contAbierto));
                System.out.println("La cantidad de Polideportivos Techados son: " + contTechado);
                System.out.println("La cantidad de Polideportivos Abiertos son: " + contAbierto);
            }

            if (aux instanceof EdificioOficinas) {
                System.out.println(aux.toString());
                aux.calcularSuperfice();
                aux.calcularVolumen();
                ((EdificioOficinas) aux).cantidadPersonas();
            }
        }
    }
}
