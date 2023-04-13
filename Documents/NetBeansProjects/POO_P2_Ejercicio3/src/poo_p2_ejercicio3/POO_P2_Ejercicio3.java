/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_p2_ejercicio3;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author elavincho
 */
public class POO_P2_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Realizar una clase llamada Persona en el paquete de entidades que
        tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
        para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
        atributo, puede hacerlo. Agregar constructores, getters y setters.
        En el paquete Servicios crear PersonaServicio con los siguientes 3
        métodos:
        a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
        función devuelve un booleano.
        b) Metodo crearPersona(): el método crear persona, le pide los valores
        de los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Persona. Además, comprueba que el
        sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
        deberá mostrar un mensaje
        3
        c) Método calcularIMC(): calculara si la persona está en su peso ideal
        (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
        valor menor que 20, significa que la persona está por debajo de su
        peso ideal y la función devuelve un -1. Si la fórmula da por resultado
        un número entre 20 y 25 (incluidos), significa que la persona está en
        su peso ideal y la función devuelve un 0. Finalmente, si el resultado
        de la fórmula es un valor mayor que 25 significa que la persona tiene
        sobrepeso, y la función devuelve un 1.
        A continuación, en la clase main hacer lo siguiente:
        ● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
        llamaremos todos los métodos para cada objeto, deberá comprobar si la
        persona está en su peso ideal, tiene sobrepeso o está por debajo de su
        peso ideal e indicar para cada objeto si la persona es mayor de edad.
        ● Por último, guardaremos los resultados de los métodos calcularIMC y
        esMayorDeEdad en distintas variables(arrays), para después calcular un
        porcentaje de esas 4 personas cuantas están por debajo de su peso,
        cuantas en su peso ideal y cuantos, por encima, y también calcularemos
        un porcentaje de cuantos son mayores de edad y cuantos menores. Para
        esto, podemos crear unos métodos adicionales.*/
        // Llamamos a la clase servicio
        PersonaServicio servicio = new PersonaServicio();
        // Creamos el vector persona
        Persona[] vp = new Persona[4];
        int contador = 1;
        int q = 0;
        int s = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona " + contador++);
            vp[i] = servicio.crearPersona();
            //servicio.esMayorDeEdad();
            if(servicio.esMayorDeEdad()== true) {
                q++;
            } else {
                s++;
            }
            //servicio.calcularIMC();
            switch (servicio.calcularIMC(vp[i])) {
                case 1:
                    b++;
                    break;
                case 2:
                    c++;
                    break;
                case 3:
                    d++;
                    break;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("La cantidad de personas mayores de edad son: " + q + " y el porcentaje es: " + ((q*100)/4));
        System.out.println("La cantidad de personas menores de edad son: " + s + " y el porcentaje es: " + ((q*100/4)));
        System.out.println("La cantidad de personas con sobrepeso son: " + d);
        System.out.println("La cantidad de personas con peso ideal son: " + c);
        System.out.println("La cantidad de personas debajo de su peso ideal son: " + b);
    }
}
