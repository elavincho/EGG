/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioGuiaInterfaz.EntidadMascota;

import EjercicioGuiaInterfaz.Interfaces.AccionMascota;

/**
 *
 * @author elavincho Vamos a crear una interfaz con un método abstracto. Luego
 * desde el main intentaremos instanciar un objeto a partir de la interfaz
 *
 */
public class Mascota implements AccionMascota {
    //Implementamos a la clase Mascota la interfaz accionMascota

    protected String nombre = "Pepito";
    protected String apodo = "Loquito";
    protected Integer edad = 7;

    public Mascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public Integer getEdad() {
        return edad;
    }

    // Importamos y modificamos los metodos "abstractos" de la interfaz accionMascota
    @Override
    public void pasear(int vueltas) {

        System.out.println("Paseamos " + vueltas + " vueltas.");

    }

    @Override
    public void saltar(int veces) {

        System.out.println("Salto " + veces + " veces.");

    }

    @Override
    public void comer(String alimento) {

        System.out.println("Comio  " + alimento + " , su alimento favorito!");

    }

}
