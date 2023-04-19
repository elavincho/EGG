/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class CadenaServicio {

    /*1. Realizar una clase llamada Cadena, en el paquete de entidades, que
        tenga como atributos una frase (String) y su longitud. Agregar
        constructor vacío y con atributo frase solamente. Agregar getters y
        setters. El constructor con frase como atributo debe setear la longitud
        de la frase de manera automática. Crear una clase CadenaServicio en el
        paquete servicios que implemente los siguientes métodos:
        a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
        que tiene la frase ingresada.
        b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
        por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
        asac".
        c) Método vecesRepetido(String letra), recibirá un carácter ingresado
        por el usuario y contabilizar cuántas veces se repite el carácter en la
        frase, por ejemplo:
        d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
        veces.
        e) Método compararLongitud(String frase), deberá comparar la longitud
        de la frase que compone la clase con otra nueva frase ingresada por
        el usuario.
        f) Método unirFrases(String frase), deberá unir la frase contenida en la
        clase Cadena con una nueva frase ingresada por el usuario y mostrar
        la frase resultante.
        g) Método reemplazar(String letra), deberá reemplazar todas las letras
        “a” que se encuentren en la frase, por algún otro carácter
        seleccionado por el usuario y mostrar la frase resultante.
        h) Método contiene(String letra), deberá comprobar si la frase contiene
        una letra que ingresa el usuario y devuelve verdadero si la contiene y
        falso si no.*/
    Scanner leer = new Scanner(System.in);

    Cadena cadena = new Cadena();

    public Cadena ingresarFrase() {
        
        System.out.println("Ingrese una Frase");
        cadena.setFrase(leer.nextLine());
        return cadena;
    }
    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
    //que tiene la frase ingresada.
    int contVocal = 0;

    public void mostrarVocales() {

        for (int i = 0; i < cadena.getFrase().length(); i++) {
            String buscarVocal = cadena.getFrase().substring(i, i + 1).toLowerCase();
            switch (buscarVocal) {
                case "a":
                    contVocal++;
                    break;
                case "e":
                    contVocal++;
                    break;
                case "i":
                    contVocal++;
                    break;
                case "o":
                    contVocal++;
                    break;
                case "u":
                    contVocal++;
                    break;
            }
        }
        System.out.println("La cantidad de vocales son: " + contVocal);
    }

    // b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
    //por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase() {
        String cadenaInvertida = "";
        for (int i = cadena.getFrase().length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.getFrase().charAt(i);
        }
        System.out.println("La cadena invertida es: ");
        System.out.println(cadenaInvertida);
    }
    
    //c) Método vecesRepetido(String letra), recibirá un carácter ingresado
    //por el usuario y contabilizar cuántas veces se repite el carácter en la
    //frase, por ejemplo:
    //d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(){
        System.out.println("Ingrese el caracter que desea saber cuantas veces se repitio");
        String caractRep = leer.nextLine();
        
        int posicion = 0;
        int contador = 0;
        // se busca la primera vez que aparece
        posicion = cadena.getFrase().indexOf(caractRep.toLowerCase());
        while (posicion != -1) {    // mientras se encuentre el caracter
            contador++;             // se cuenta
            // se sigue buscando a partir de la siguiente posicion encontrada
            posicion = cadena.getFrase().indexOf(caractRep.toLowerCase(), posicion + 1);
        }
        System.out.println("El caracter " + caractRep + " se encontro " + contador + " veces.");
    }
    
        //e) Método compararLongitud(String frase), deberá comparar la longitud
        //de la frase que compone la clase con otra nueva frase ingresada por
        //el usuario.
    public void compararLongitud() {
        System.out.println("Ingrese una nueva Frase");
        cadena.setNuevaFrase(leer.nextLine());
        System.out.println("");
        System.out.println("Comparamos las Frases");
        int longNuevaFrase = cadena.getNuevaFrase().length();
        
        System.out.println("La primera frase  '" + cadena.getFrase() + "'  tiene " + cadena.getFrase().length() + " caracteres.");
        System.out.println("");
        System.out.println("La segunda frase  '" + cadena.getNuevaFrase() + "'  tiene " + longNuevaFrase + " caracteres.");
        System.out.println("");
        if (cadena.getFrase().length() == longNuevaFrase) {
            System.out.println("Las longitudes son iguales");
        }else {
            System.out.println("Las longitudes no son iguales");
        }
        
    }
    
        //f) Método unirFrases(String frase), deberá unir la frase contenida en la
        //clase Cadena con una nueva frase ingresada por el usuario y mostrar
        //la frase resultante.
    
    public void unirFrases() {
        System.out.println("Unimos las Frases");
        System.out.println(cadena.getFrase().concat(cadena.getNuevaFrase()));
    }
    
        //g) Método reemplazar(String letra), deberá reemplazar todas las letras
        //“a” que se encuentren en la frase, por algún otro carácter
        //seleccionado por el usuario y mostrar la frase resultante.
    
    public String reemplazar() {
        
        System.out.println("Ingrese el caracter por el cual desea reemplazar la letra A");
        String caracterR = leer.nextLine();
        
        System.out.println("Reemplazamos todas las letras A");
        String reemplazo = " ";
        
        for (int i = 0; i < cadena.getFrase().length(); i++) {
           
            String letra = cadena.getFrase().substring(i, i+1).toLowerCase();
            switch (letra) {
                case "a":
                    reemplazo += caracterR;
                    break;
                case "A":
                    reemplazo += caracterR;
                    break;
                default:
                    reemplazo = reemplazo + letra;
            }
        }
        return reemplazo;
        
        // OTRO METODO
        // String replace_frase = cadena.getFrase().replace("a", caracterR);
                
    }
        /*h) Método contiene(String letra), deberá comprobar si la frase contiene
        una letra que ingresa el usuario y devuelve verdadero si la contiene y
        falso si no.*/
    
    public boolean contieneLetra() {
        System.out.println("Ingrese la letra que quiere buscar en la frase");
        String letra = leer.nextLine().toLowerCase();
        boolean contiene = false;
        if (cadena.getFrase().contains(letra)){
            contiene = true;
            System.out.println("La letra " + letra + " esta en la frase.");
        }else {
            contiene = false;
            System.out.println("La letra " + letra + " no se encuentra en la frase.");
        }
     return contiene;   
    }
    
    
}
