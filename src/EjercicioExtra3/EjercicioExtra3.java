/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3;

import EjercicioExtra3.Entidades.Alojamiento;
import EjercicioExtra3.Entidades.Camping;
import EjercicioExtra3.Entidades.Hotel4;
import EjercicioExtra3.Entidades.Hotel5;
import EjercicioExtra3.Entidades.Residencias;
import EjercicioExtra3.Entidades.Service.AlojamientoService;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author elavincho
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    /*
    Una compañía de promociones turísticas desea mantener información sobre la infraestructura
    de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
    acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
    una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
    alojamientos: Hoteles y Alojamientos Extrahoteleros.
    Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
    Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
    características de las distintas categorías son las siguientes:
    • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
    • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
    Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
    Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
    acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
    cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
    será.
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
    Donde:
    Valor agregado por el restaurante:
    • $10 si la capacidad del restaurante es de menos de 30 personas.
    • $30 si está entre 30 y 50 personas.
    • $50 si es mayor de 50.
    Valor agregado por el gimnasio:
    • $50 si el tipo del gimnasio es A.
    • $30 si el tipo del gimnasio es B.
    Valor agregado por las limosinas:
    • $15 por la cantidad de limosinas del hotel.
    En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
    hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
    Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
    cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
    Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
    disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
    indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
    campo deportivo. Realizar un programa en el que se representen todas las relaciones
    descriptas.
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
    • todos los alojamientos.
    • todos los hoteles de más caro a más barato.
    • todos los campings con restaurante
    • todos las residencias que tienen descuento. 
    */
    public static void main(String[] args) {
        
        Hotel4 hot4 = new Hotel4();
        Hotel5 hot5 = new Hotel5();
        Camping camp = new Camping();
        Residencias res = new Residencias();
        
        AlojamientoService service = new AlojamientoService();
        
        ArrayList<Alojamiento> alojamientoList = new ArrayList<>();
        
        Scanner leer = new Scanner(System.in);
        boolean bucle = true;
        String salir;

        do {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1. Agregar Hotel 5 *");
            System.out.println("2. Precio Hotel 5 *");
            System.out.println("3. Agregar Hotel 4 *");
            System.out.println("4. Precio Hotel 4 *");
            System.out.println("5. Agregar Camping");
            System.out.println("6. Agregar Residencia");
            System.out.println("7. Mostrar Lista de Alojamientos");
            System.out.println("8. Mostrar Hoteles del Mas Caro al Mas Barato");
            System.out.println("9. Mostrar Residencias con Descuento");
            System.out.println("10. Mostrar Camping con Restaurante");
            System.out.println("11. Salir");
            int opcion;
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    service.crearHotel5(hot5, alojamientoList);
                    break;
                case 2:
                    service.precioHabitacionesH5(hot5);
                    break;
                case 3:
                    service.crearHotel4(hot4, alojamientoList);
                    break;
                case 4:
                    service.precioHabitacionesH4(hot4);
                    break;
                case 5:
                    service.crearCamping(camp, alojamientoList);
                    break;
                case 6:
                    service.crearResidencia(res, alojamientoList);
                    break;
                case 7:
                    service.mostrarAlojamientos(alojamientoList);
                    break;
                case 8:
                    service.mostrarHotelesMasCaroAMasBarato(alojamientoList);
                    break;
                case 9:
                    service.residenciasCondescuento(alojamientoList);
                    break;
                case 10:
                    service.campingConRestaurante(alojamientoList);
                    break;
                case 11:
                    System.out.println("Desea Salir?? (S / N)");
                    salir = leer.next();
                    if (salir.equalsIgnoreCase("s")) {
                        bucle = false;
                    }
                    break;
                default:
                    bucle = true;
                    break;
            }
        } while (bucle);
    }
}
