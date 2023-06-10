/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioGuiaInterfaz.Interfaces;

/**
 *
 * @author elavincho
 * 
 * Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
 * un objeto a partir de la interfaz
 * 
 */
public interface AccionMascota {
 
    //Cremamos los metos abstractos en la interfaz
    public abstract void pasear(int vueltas);
    
    public abstract void saltar(int veces);
    
    public abstract void comer(String alimento);
}
