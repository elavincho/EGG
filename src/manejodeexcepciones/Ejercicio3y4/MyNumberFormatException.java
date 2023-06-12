/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexcepciones.Ejercicio3y4;

/**
 *
 * @author elavincho
 */
public class MyNumberFormatException extends Exception{

    /**
     * Creates a new instance of <code>MyNumberFormatException</code> without
     * detail message.
     */
    
    private String msg; //Creamos el atributo tipo string
    
    public MyNumberFormatException() {
    }

    /**
     * Constructs an instance of <code>MyNumberFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MyNumberFormatException(String msg) {
        super("El tipo de Dato Ingresado no es Correcto!"); //agregamos el mensaje personalizado
        this.msg = msg; 
    }
    //Creamos el getter de la excepcion personalizada
    public String getMsg() {
    return msg;
  }
}
