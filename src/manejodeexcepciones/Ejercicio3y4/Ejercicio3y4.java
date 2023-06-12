/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexcepciones.Ejercicio3y4;

import java.util.Scanner;

/**
 *
 * @author elavincho
 *
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
 * para leer dos números en forma de cadena. A continuación, utilice el método
 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y
 * guardarlas en dos variables de tipo int. Por ultimo realizar una división con
 * los dos numeros y mostrar el resultado.
 *
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
 * teclado puede causar una excepción de tipo InputMismatchException, el método
 * Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
 * NumberFormatException y además, al dividir un número por cero surge una
 * ArithmeticException. Manipule todas las posibles excepciones utilizando
 * bloques try/catch para las distintas excepciones
 *
 */
public class Ejercicio3y4 {

    public static void main(String[] args) throws MyNumberFormatException { //Agregamos el throws para NumberFormatException

        Scanner leer = new Scanner(System.in);
        //Creamos 2 numeros de tipo cadena
        String numero1;
        String numero2;
        //Pedimos que ingresen los numeros por teclado
        System.out.println("Ingrese el Primer Numero Entero");
        numero1 = leer.nextLine();
        System.out.println("Ingrese el Segundo Numero Entero");
        numero2 = leer.nextLine();

        try {//Intentar
            //Convertimos los numeros de tipo cadena a enteros
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);

            if (num2 == 0) {
                throw new MyArithmeticException("No se puede dividir por Cero!");
                //System.out.println("No se puede dividir por Cero!");
            }
            if (num1 < 0) {
                throw new MyInputMismatchException("El tipo de dato ingresado no es un Entero!");
            }
            if (num2 < 0) {
                throw new MyInputMismatchException("El tipo de dato ingresado no es un Entero!");
            }

            double dividir = (num1 / num2);

            System.out.println("La division del Numero 1 / Numero 2 = " + dividir);
            
        } catch (MyInputMismatchException e) {//Agarrar
            System.out.println(e.getMessage());
        } catch (MyArithmeticException e) {//Agarrar
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {//Codigio que siempre se ejecuta
            System.out.println("Fin del Progrma!!!");
        }

    }
}
