/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author elavincho
 */
public class Raices {

    /*Vamos a realizar una clase llamada Raices, donde representaremos los
        valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
        como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
        para construir el objeto a través de un método constructor. Luego, en
        RaicesServicio las operaciones que se podrán realizar son las siguientes:
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

 /*Vamos a realizar una clase llamada Raices, donde representaremos los
        valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
        como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
        para construir el objeto a través de un método constructor.*/
    // Creamos los atributos e insertamos los valores
    public int a;
    public int b;
    public int c;
    public double discriminante;

    // Creamos el constructor
    public Raices() {
    }

    public Raices(int a, int b, int c, double discriminante) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = discriminante;
    }

    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }

    
    
   }
