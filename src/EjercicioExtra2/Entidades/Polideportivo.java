/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.Entidades;

import EjercicioExtra2.Service.EdificioService;

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
public class Polideportivo extends Edificio {

    protected String nombre;
    protected String tipoInstalacion; // techado o abierto

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo: " + nombre + "\n TipoInstalacion: " + tipoInstalacion
                + "\n Alto: " + alto + "\n Largo: " + largo + "\n Ancho: " + ancho + "\n";

    }

    @Override
    public void calcularSuperfice() {

        System.out.println("Superficie: " + (ancho * largo) + " mts2");

    }

    @Override
    public void calcularVolumen() {

        System.out.println("Volumen: " + (alto * ancho * largo) + " mts3");

    }
}
