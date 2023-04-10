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
public class Rectangulo {
    
    /*Crear una clase Rectángulo que modele rectángulos por medio de un
        atributo privado base y un atributo privado altura. La clase incluirá un
        método para crear el rectángulo con los datos del Rectángulo dados por
        el usuario. También incluirá un método para calcular la superficie del
        rectángulo y un método para calcular el perímetro del rectángulo. Por
        último, tendremos un método que dibujará el rectángulo mediante
        asteriscos usando la base y la altura. Se deberán además definir los
        métodos getters, setters y constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2.*/
    
    private int base;
    private int altura;

    // Creamos el constructor
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Creamos el Setter

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // Creamos el Getter

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    
    
}
