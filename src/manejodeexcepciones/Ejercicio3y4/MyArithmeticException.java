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
public class MyArithmeticException extends ArithmeticException{

    /**
     * Creates a new instance of <code>MyArithmeticException</code> without
     * detail message.
     */
    public MyArithmeticException() {
    }

    /**
     * Constructs an instance of <code>MyArithmeticException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MyArithmeticException(String msg) {
        super(msg);//Mensaje personalizado
    }
}
