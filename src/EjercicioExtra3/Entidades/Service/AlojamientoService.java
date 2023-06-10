/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra3.Entidades.Service;

import EjercicioExtra3.Entidades.Alojamiento;
import EjercicioExtra3.Entidades.Camping;
import EjercicioExtra3.Entidades.Hotel;
import EjercicioExtra3.Entidades.Hotel4;
import EjercicioExtra3.Entidades.Hotel5;
import EjercicioExtra3.Entidades.Residencias;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author elavincho
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
public class AlojamientoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearHotel4(Hotel4 hot4, ArrayList<Alojamiento> alojamientoList) {
        System.out.println("============CARGAR HOTEL DE 4 * ===================");
        System.out.println("");
        System.out.println("Ingrese el Nombre del Alojamiento");
        hot4.setNombre(leer.next());
        System.out.println("Ingrese la Direccion del Alojamiento");
        hot4.setDireccion(leer.next());
        System.out.println("Ingrese la Localidad del Alojamiento");
        hot4.setLocalidad(leer.next());
        System.out.println("Ingrese el Nombre del Gerente del Alojamiento");
        hot4.setGerente(leer.next());
        System.out.println("Ingrese la Cantidad de Habitaciones del Hotel");
        hot4.setCantHabitaciones(leer.nextInt());
        System.out.println("Ingrese el Numero de Camas del Hotel");
        hot4.setCantPisos(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Pisos del Hotel");
        hot4.setCantPisos(leer.nextInt());
        do {
            System.out.println("Ingrese el Tipo de Gimnacio (A - B)");
            hot4.setGimnacio(leer.next());
        } while (hot4.getGimnacio().equalsIgnoreCase("A") && hot4.getGimnacio().equalsIgnoreCase("B"));
        System.out.println("Ingrese el Nombre del Restaurante");
        hot4.setNombreRestaurante(leer.next());
        System.out.println("Ingrese la Capacidad del Restaurante");
        hot4.setCapacidadRestaurante(leer.nextInt());
        //Agregamos el hotel a la lista de alojamientos
        alojamientoList.add(hot4);
    }

    public int precioHabitacionesH4(Hotel4 hot4) {
        System.out.println("========PRECIO HABITACION HOTEL DE 4 * ============");
        System.out.println("");
        int precioHabitacion;
        int capacidadHotel;
        int valorRestaurante = 0;
        int valorGimnacio = 0;

        //Calculamos la capacidad del hotel
        capacidadHotel = (hot4.getCantHabitaciones() + hot4.getNroCamas());
        //Calculamos el valor del restaurante
        if (hot4.getCapacidadRestaurante() < 30) {
            valorRestaurante = 10;
        } else if ((hot4.getCapacidadRestaurante() > 30) && (hot4.getCapacidadRestaurante() < 50)) {
            valorRestaurante = 30;
        } else if (hot4.getCapacidadRestaurante() > 50) {
            valorRestaurante = 50;
        }
        //Calculamos el valor del gimnacio
        if (hot4.getGimnacio().equalsIgnoreCase("A")) {
            valorGimnacio = 50;
        } else if (hot4.getGimnacio().equalsIgnoreCase("B")) {
            valorGimnacio = 30;
        }

        precioHabitacion = 50 + (1 * capacidadHotel) + (valorRestaurante) + (valorGimnacio);
        //Agregamos el precio a la habitacion
        hot4.setPrecioHabitacion(precioHabitacion);
        System.out.println("Capacidad Hotel:             " + capacidadHotel);
        System.out.println("Valor Restaurante:          $" + valorRestaurante);
        System.out.println("Valor Gimnacio:             $" + valorGimnacio);
        System.out.println("Precio de la Habitacion:    $" + precioHabitacion);

        return precioHabitacion;
    }

    public void crearHotel5(Hotel5 hot5, ArrayList<Alojamiento> alojamientoList) {
        System.out.println("============CARGAR HOTEL DE 5 * ===================");
        System.out.println("");
        System.out.println("Ingrese el Nombre del Alojamiento");
        hot5.setNombre(leer.next());
        System.out.println("Ingrese la Direccion del Alojamiento");
        hot5.setDireccion(leer.next());
        System.out.println("Ingrese la Localidad del Alojamiento");
        hot5.setLocalidad(leer.next());
        System.out.println("Ingrese el Nombre del Gerente del Alojamiento");
        hot5.setGerente(leer.next());
        System.out.println("Ingrese la Cantidad de Habitaciones del Hotel");
        hot5.setCantHabitaciones(leer.nextInt());
        System.out.println("Ingrese el Numero de Camas del Hotel");
        hot5.setCantPisos(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Pisos del Hotel");
        hot5.setCantPisos(leer.nextInt());
        do {
            System.out.println("Ingrese el Tipo de Gimnacio (A - B)");
            hot5.setGimnacio(leer.next());
        } while (hot5.getGimnacio().equalsIgnoreCase("A") && hot5.getGimnacio().equalsIgnoreCase("B"));
        System.out.println("Ingrese el Nombre del Restaurante");
        hot5.setNombreRestaurante(leer.next());
        System.out.println("Ingrese la Capacidad del Restaurante");
        hot5.setCapacidadRestaurante(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Salones de Conferencia");
        hot5.setCantSalonesConferencia(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Suites");
        hot5.setCantSuites(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Limosinas");
        hot5.setCantLimosinas(leer.nextInt());
        //Agregamos el hotel a la lista de alojamientos
        alojamientoList.add(hot5);
    }

    public int precioHabitacionesH5(Hotel5 hot5) {
        System.out.println("========PRECIO HABITACION HOTEL DE 5 * ============");
        System.out.println("");
        int precioHabitacion;
        int capacidadHotel;
        int valorRestaurante = 0;
        int valorGimnacio = 0;
        int valorLimosina;
        //Calculamos la capacidad del hotel
        capacidadHotel = (hot5.getCantHabitaciones() + hot5.getNroCamas() + hot5.getCantSuites());
        //Calculamos el valor del restaurante
        if (hot5.getCapacidadRestaurante() < 30) {
            valorRestaurante = 10;
        } else if ((hot5.getCapacidadRestaurante() > 30) && (hot5.getCapacidadRestaurante() < 50)) {
            valorRestaurante = 30;
        } else if (hot5.getCapacidadRestaurante() > 50) {
            valorRestaurante = 50;
        }
        //Calculamos el valor del gimnacio
        if (hot5.getGimnacio().equalsIgnoreCase("A")) {
            valorGimnacio = 50;
        } else if (hot5.getGimnacio().equalsIgnoreCase("B")) {
            valorGimnacio = 30;
        }
        //Calculamos el valor de las limosinas
        valorLimosina = (15 * hot5.getCantLimosinas());

        precioHabitacion = 50 + (1 * capacidadHotel) + (valorRestaurante) + (valorGimnacio) + (valorLimosina);
        //Agregamos el precio a la habitacion
        hot5.setPrecioHabitacion(precioHabitacion);
        System.out.println("Capacidad Hotel:             " + capacidadHotel);
        System.out.println("Valor Restaurante:          $" + valorRestaurante);
        System.out.println("Valor Gimnacio:             $" + valorGimnacio);
        System.out.println("Valor Limosina:             $" + valorLimosina);
        System.out.println("Precio de la Habitacion:    $" + precioHabitacion);

        return precioHabitacion;
    }

    public void crearCamping(Camping camp, ArrayList<Alojamiento> alojamientoList) {
        System.out.println("============CARGAR CAMPING ===================");
        System.out.println("");
        System.out.println("Ingrese el Nombre del Alojamiento");
        camp.setNombre(leer.next());
        System.out.println("Ingrese la Direccion del Alojamiento");
        camp.setDireccion(leer.next());
        System.out.println("Ingrese la Localidad del Alojamiento");
        camp.setLocalidad(leer.next());
        System.out.println("Ingrese el Nombre del Gerente del Alojamiento");
        camp.setGerente(leer.next());
        System.out.println("Ingrese la cantidad Maxima de Carpas");
        camp.setCantMaxCarpas(leer.nextInt());
        System.out.println("Ingrese la Cantidad de Baños");
        camp.setCantBanos(leer.nextInt());
        String respuesta;
        do {
            System.out.println("El Camping tiene Restaurante (S / N)");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("S")) {
                camp.setRestaurante(true);
            } else {
                camp.setRestaurante(false);
            }
        } while (respuesta.equalsIgnoreCase("S") && respuesta.equalsIgnoreCase("S"));
        System.out.println("Ingrese el Precio x Dia del Camping ");
        camp.setPrecio(leer.nextInt());
        //Agregamos el camping a la lista de alojamientos
        alojamientoList.add(camp);
    }

    public void crearResidencia(Residencias res, ArrayList<Alojamiento> alojamientoList) {
        System.out.println("============CARGAR CAMPING ===================");
        System.out.println("");
        System.out.println("Ingrese el Nombre del Alojamiento");
        res.setNombre(leer.next());
        System.out.println("Ingrese la Direccion del Alojamiento");
        res.setDireccion(leer.next());
        System.out.println("Ingrese la Localidad del Alojamiento");
        res.setLocalidad(leer.next());
        System.out.println("Ingrese el Nombre del Gerente del Alojamiento");
        res.setGerente(leer.next());
        System.out.println("Ingrese la Cantidad de Habitaciones");
        res.setCantHabitaciones(leer.nextInt());
        String respuesta;
        do {
            System.out.println("La residencia Cuenta con Descuento?? (S / N) ");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("S")) {
                res.setDescuento(true);
            } else {
                res.setDescuento(false);
            }
        } while (respuesta.equalsIgnoreCase("S") && respuesta.equalsIgnoreCase("S"));
        String respuesta2;
        do {
            System.out.println("La residencia Cuenta con Campo Deportivo?? (S / N) ");
            respuesta2 = leer.next();
            if (respuesta2.equalsIgnoreCase("S")) {
                res.setDescuento(true);
            } else {
                res.setDescuento(false);
            }
        } while (respuesta2.equalsIgnoreCase("S") && respuesta2.equalsIgnoreCase("S"));
        System.out.println("Ingrese el Precio de la Residencia");
        res.setPrecio(leer.nextInt());
        //Agregamos la residencia a la lista de alojamientos
        alojamientoList.add(res);
    }

    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamientoList) {

        for (Alojamiento mostrar : alojamientoList) {
            System.out.println(mostrar);
        }
    }

    public void mostrarHotelesMasCaroAMasBarato(ArrayList<Alojamiento> alojamientoList) {
        //Creamos un arrayList de hoteles
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento aux : alojamientoList) {
            if(aux instanceof Hotel){
                hoteles.add((Hotel) aux);
            }
        }
        //Ordenamos los hoteles del mas caro al mas barato
        hoteles.sort(Comparator.comparing(Hotel::getPrecioHabitacion).reversed());
        
        for (Hotel aux2 : hoteles) {
            System.out.println("=====Hoteles del Mas Caro al Mas Barato========");
            System.out.println("Hotel: " + aux2.getNombre() + " Precio Habitacion: $" + aux2.getPrecioHabitacion());
            
        }
    }

    public void campingConRestaurante(ArrayList<Alojamiento> alojamientoList){
        for (Alojamiento aux3 : alojamientoList) {
            if(aux3 instanceof Camping){
                if(((Camping) aux3).isRestaurante()){
                    System.out.println(aux3.getNombre());
                }
            }
        }
    }
    
    public void residenciasCondescuento(ArrayList<Alojamiento> alojamientoList){
        for (Alojamiento aux4 : alojamientoList) {
            if(aux4 instanceof Residencias){
                if(((Residencias) aux4).isDescuento()){
                    System.out.println(aux4.getNombre());
                }
            }
        }
    }
}
