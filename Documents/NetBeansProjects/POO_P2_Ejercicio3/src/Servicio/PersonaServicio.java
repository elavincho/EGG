/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class PersonaServicio {

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
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Llamamos a la clase persona
    Persona persona = new Persona();

    //a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
    //función devuelve un booleano.

    public boolean esMayorDeEdad() {
        
        if (persona.getEdad() >= 18) {
            return true;
        }else {
            return false;
        }
    }

    /*b) Metodo crearPersona(): el método crear persona, le pide los valores
        de los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Persona. Además, comprueba que el
        sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
        deberá mostrar un mensaje*/
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        persona.setEdad(leer.nextInt());

        do {
            System.out.println("Ingrese el sexo de la persona(H/M/O)");
            persona.setSexo(leer.next());
        } while (!(persona.getSexo().equalsIgnoreCase("H") || persona.getSexo().equalsIgnoreCase("M") || persona.getSexo().equalsIgnoreCase("O")));

        System.out.println("Ingrese el peso de la persona(usar coma)");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona(usar coma)");
        persona.setAltura(leer.nextDouble());

        return persona;
    }

    /*c) Método calcularIMC(): calculara si la persona está en su peso ideal
        (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
        valor menor que 20, significa que la persona está por debajo de su
        peso ideal y la función devuelve un -1. Si la fórmula da por resultado
        un número entre 20 y 25 (incluidos), significa que la persona está en
        su peso ideal y la función devuelve un 0. Finalmente, si el resultado
        de la fórmula es un valor mayor que 25 significa que la persona tiene
        sobrepeso, y la función devuelve un 1.*/
    public int calcularIMC(Persona persona) {

        double imc = (persona.getPeso() / (Math.pow(persona.getAltura(), 2)));
        System.out.println("IMC: " + imc);
        int num = 0;
        if (imc < 20) {
            System.out.println("Estas por debajo de su peso ideal");
            num = 1;
        } else if (imc > 20 && imc <= 25) {
            System.out.println("Estas en tu peso ideal");
            num = 2;
        } else if (imc >= 26) {
            System.out.println("Estas con sobrepeso");
            num = 3;
        }
        return num;
    }
}
