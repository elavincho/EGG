/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioGuiaInterfaz;

import EjercicioGuiaInterfaz.EntidadMascota.Mascota;

/**
 *
 * @author elavincho
 */
public class EjercicioGuiaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // * Vamos a crear una interfaz con un método abstracto. Luego desde el 
        //main intentaremos instanciar un objeto a partir de la interfaz
        
        /*
        INSTANCIAR UNA INTERFAZ
        Aunque las interfaces van a ser implementadas por clases y van a tener 
        métodos, al igual que una clase abstracta, esta, no se va a poder instanciar. 
        La definición de un interfaz no tiene constructor,
        por lo que no es posible invocar el operador new sobre un tipo interfaz, 
        por lo que no podemos crear objetos del tipo interfaz.
        */
        
        
        Mascota m = new Mascota();
        
        System.out.println(m.getNombre() + " que tiene como apodo " + m.getApodo()
                + " y tiene " + m.getEdad() + " años.");
        System.out.println("Realizo las siguientes acciones:");
        System.out.println("");
        
        m.pasear(4);
        
        m.saltar(3);
        
        m.comer("pollo");
        
        System.out.println("");
    }
    
}
