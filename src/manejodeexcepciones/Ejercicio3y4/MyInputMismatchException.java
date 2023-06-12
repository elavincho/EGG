/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexcepciones.Ejercicio3y4;

import java.util.InputMismatchException;

/**
 *
 * @author elavincho
 */
public class MyInputMismatchException extends InputMismatchException{

    /**
     * Creates a new instance of <code>MyInputMismatchException</code> without
     * detail message.
     */
    public MyInputMismatchException() {
    }

    /**
     * Constructs an instance of <code>MyInputMismatchException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MyInputMismatchException(String msg) {
        super(msg);//Escribir el mensaje personalizado
    }
}
