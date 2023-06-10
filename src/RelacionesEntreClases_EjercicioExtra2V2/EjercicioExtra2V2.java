/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_EjercicioExtra2V2;


import RelacionesEntreClases_EjercicioExtra2V2.Entidades.Cine;
import RelacionesEntreClases_EjercicioExtra2V2.Entidades.Espectador;
import RelacionesEntreClases_EjercicioExtra2V2.Entidades.SalaCine;
import RelacionesEntreClases_EjercicioExtra2V2.Servicio.CineService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class EjercicioExtra2V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        CineService cineService = new CineService();
        SalaCine salaCine = cineService.crearSalaCine();
        ArrayList<Espectador> espectadores = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            espectadores.add(cineService.crearEspectadores());
        }

        System.out.println("Ingrese el precio de las peliculas:");
        double precio = leer.nextDouble();

        Cine cine = cineService.crearCine(salaCine.getPelicula(), salaCine, precio);
        cineService.mostrarSalaCine(cine, salaCine);
        for (int i = 0; i < espectadores.size(); i++) {
            System.out.println("Vendiendo butaca a: " + espectadores.get(i).getNombre());
            System.out.println("Dinero disponible: " + espectadores.get(i).getDineroDisponible());
            System.out.println("Edad: " + espectadores.get(i).getEdad());
            cineService.venderButaca(cine, salaCine, espectadores.get(i));
        }
    }
}