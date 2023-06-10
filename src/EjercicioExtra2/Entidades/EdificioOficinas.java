/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2.Entidades;

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
public class EdificioOficinas extends Edificio {

    protected int nroOficinas;
    protected int cantPersonasxOficina;
    protected int nroPisos;

    public EdificioOficinas() {
    }

    public EdificioOficinas(int nroOficinas, int cantPersonasxOficina, int nroPisos, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersonasxOficina = cantPersonasxOficina;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersonasxOficina() {
        return cantPersonasxOficina;
    }

    public void setCantPersonasxOficina(int cantPersonasxOficina) {
        this.cantPersonasxOficina = cantPersonasxOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public void calcularSuperfice() {

        System.out.println("Superficie: " + (2 * ((largo * ancho) + (alto * ancho) + (largo * alto))) + " mts2.");

    }

    @Override
    public void calcularVolumen() {

        System.out.println("Volumen: " + (largo * ancho * alto) + " mts3.");

    }

    public void cantidadPersonas() {

        System.out.println("La cantidad de Personas que entran en cada Oficina es: " + cantPersonasxOficina);
        System.out.println("La cantidad de Personas que pueden trabajar en el Edificio es: " + (cantPersonasxOficina * nroPisos * nroOficinas));

    }

    @Override
    public String toString() {
        return "\n EdificioOficinas: " + "\n NroOficinas: " + nroOficinas
                + "\n CantPersonasxOficina: " + cantPersonasxOficina
                + "\n NroPisos: " + nroPisos
                + "\n Largo: " + largo + "\n Ancho: " + ancho + "\n Altura: " + alto + "\n";
    }
}
