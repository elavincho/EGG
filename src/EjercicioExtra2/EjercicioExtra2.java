/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2;

import EjercicioExtra2.Entidades.Edificio;
import EjercicioExtra2.Entidades.EdificioOficinas;
import EjercicioExtra2.Entidades.Polideportivo;
import EjercicioExtra2.Service.EdificioService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
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
    public static void main(String[] args) {

        Polideportivo poli = new Polideportivo();
        EdificioOficinas edif = new EdificioOficinas();
        ArrayList<Edificio> edificio = new ArrayList<>();
        EdificioService service = new EdificioService();
        
        
        //Creamos dos polideportivos con sus atributos
        Polideportivo poliOne = new Polideportivo("Poli Real Madrid", "Techado", 6, 45, 60);
        Polideportivo poliTwo = new Polideportivo("Poli Barza", "Abierto", 0, 30, 80);
        //Agregamos los polideportivos a la lista de edificios
        edificio.add(poliOne);
        edificio.add(poliTwo);
        //Creamos dos edificios de oficinas con sus atributos
        EdificioOficinas ofiOne = new EdificioOficinas(12, 6, 6, 45, 15, 15);
        EdificioOficinas ofiTwo = new EdificioOficinas(26, 15, 26, 70, 25, 35);
        //Agregamos los edificios de oficinas a la lista de edificios
        edificio.add(ofiOne);
        edificio.add(ofiTwo);

        Scanner leer = new Scanner(System.in);
        boolean bucle = true;
        String salir;

        do {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1. Agregar Polideportivo");
            System.out.println("2. Agregar Edificio de Oficinas");
            System.out.println("3. Mostrar Lista de Edificios");
            System.out.println("4. Salir");
            int opcion;
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    service.crearPolideportivo(edificio);
                    break;
                case 2:
                    service.crearEdificioOficinas(edif, edificio);
                    break;
                case 3:
                    service.mostrarEdificios(edificio);
                    break;
                case 4:
                    System.out.println("Desea Salir?? (S / N)");
                    salir = leer.next();
                    if (salir.equalsIgnoreCase("s")) {
                        bucle = false;
                    }
                    break;
                default:
                    bucle = true;
                    break;
            }
        } while (bucle);
    }
}
