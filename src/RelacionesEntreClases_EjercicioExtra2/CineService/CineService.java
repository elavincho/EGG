/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_EjercicioExtra2.CineService;

import RelacionesEntreClases_EjercicioExtra2.Entidades.Asiento;
import RelacionesEntreClases_EjercicioExtra2.Entidades.Espectador;
import RelacionesEntreClases_EjercicioExtra2.Entidades.Peliculas;
import RelacionesEntreClases_EjercicioExtra2.Entidades.Sala;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class CineService {

    /*
        Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
        (8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
        sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
        el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
        nombre, edad y el dinero que tiene disponible.
        Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
        etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
        la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
        ocupado se muestra una X, sino un espacio vacío.
        8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
        7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
        6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
        5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
        4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
        3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
        2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
        1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
        Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
        ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
        ocupado el asiento).
        Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
        podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
        libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
        ocupado se le debe buscar uno libre.
        Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
        cada asiento o solo las X y espacios vacíos.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<Peliculas> movieList) {
        System.out.println("================INGRESAR PELICULA================");
        String salir;
        do {
            //Instanciamos el objeto tipo pelicula
            Peliculas pelis = new Peliculas();
            System.out.println("Ingrese el Titulo de la Pelicula");
            pelis.setTitulo(leer.next());
            System.out.println("Ingrese el Director de la Pelicula");
            pelis.setDirector(leer.next());
            System.out.println("Ingrese la Duracion de la Pelicula (HH / MM)");
            pelis.setDuracion(leer.nextDouble());
            System.out.println("Ingrese Edad Minima para ver la Pelicula");
            pelis.setEdadMinima(leer.nextInt());
            //Agregamos el objeto pelicula a la lista de peliculas
            movieList.add(pelis);
            System.out.println("Queres agregar otra Pelicula (S / N)??");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("s"));
        System.out.println("==================================================");
        System.out.println("");
    }

    public void mostrarListaPeliculas(ArrayList<Peliculas> movieList) {

        System.out.println("====================CARTELERA====================");
        for (Peliculas mostrarCart : movieList) {
            System.out.println(mostrarCart);
        }
        System.out.println("==================================================");
        System.out.println("");
    }

    public void crearEspectador(ArrayList<Espectador> espectadorList) {
        System.out.println("==================ALTA ESPECTADOR==================");
        String salir;
        do {
            //Instanciamos el objeto tipo expectador
            Espectador espectador = new Espectador();
            System.out.println("Ingrese su Nombre");
            espectador.setNombre(leer.next());
            System.out.println("Ingrese su Dia de Nacimiento");
            int dia = leer.nextInt();
            System.out.println("Ingrese su Mes de Nacimiento");
            int mes = leer.nextInt();
            System.out.println("Ingrese su Año de Nacimiento");
            int anio = leer.nextInt();
            Date fn = new Date(anio - 1900, mes - 1, dia);
            espectador.setFecNac(fn);
            System.out.println("Con cuanto Dinero Cuenta??");
            espectador.setDineroDisponible(leer.nextInt());
            //Agregamos el espectador a la lista
            espectadorList.add(espectador);
            System.out.println("Quiere agregar otro Espectador??");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("s"));
        System.out.println("==================================================");
        System.out.println("");
    }

    public void mostrarEspectador(ArrayList<Espectador> espectadorList) {
        System.out.println("==================MOSTRAR ESPECTADOR==================");

        for (Espectador mostrarEspec : espectadorList) {
            System.out.println(mostrarEspec);
        }
        System.out.println("==================================================");
        System.out.println("");
    }

    Asiento[][] asiento = new Asiento[8][6];
    String[] fila = {"8", "7", "6", "5", "4", "3", "2", "1"};
    String[] columna = {"A", "B", "C", "D", "E", "F"};

    public Sala crearSala(ArrayList<Sala> salaList) {
        System.out.println("==================CREAR SALA==================");
        System.out.println("");
        // Asignar las filas y columnas a los asientos
        for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < asiento[i].length; j++) {

                asiento[i][j] = new Asiento(fila[i], columna[j], "-");

                /* Codigo para tener asientos ocupados en forma aleatoria
                Random aleatorio = new Random();
                int numAleatorio = aleatorio.nextInt(2);
                if (numAleatorio == 0) {
                    asiento[i][j] = new Asiento(fila[i], columna[j], "-");
                } else {
                    asiento[i][j] = new Asiento(fila[i], columna[j], "X");
                }
                 */
            }
        }
        System.out.println("La Sala se creo correctamente.");
        System.out.println("==================================================");
        System.out.println("");

        return null;
    }

    public void crearSalaV2(ArrayList<Sala> salaList) {
        System.out.println("==================CREAR SALA==================");
        System.out.println("");
        String salir;

        do {
            //Instanciamos un objeto tipo sala
            Sala salaCine = new Sala();
            System.out.println("Ingrese el Nombre de la Sala");
            salaCine.setNombreSala(leer.next());
            System.out.println("");
            salaCine.setAsiento(asiento);
            salaCine.setFila(fila);
            salaCine.setColumna(columna);
            //Pedimos el precio de la entrada
            System.out.println("Ingrese el Precio de la Entrada");
            salaCine.setPrecioEntrada(leer.nextInt());
            //Agregamos la sala a la lista de salas
            salaList.add(salaCine);

            // Asignar las filas y columnas a los asientos
            for (int i = 0; i < asiento.length; i++) {
                for (int j = 0; j < asiento[i].length; j++) {

                    //asiento[i][j] = new Asiento(fila[i], columna[j], "-");
                    // Codigo para tener asientos ocupados en forma aleatoria
                    Random aleatorio = new Random();
                    int numAleatorio = aleatorio.nextInt(3);
                    if (numAleatorio == 0) {
                        asiento[i][j] = new Asiento(fila[i], columna[j], "-");
                    } else {
                        asiento[i][j] = new Asiento(fila[i], columna[j], "X");
                    }
                }
            }
            System.out.println("Queres agregar otra Sala (S / N)??");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("S"));
        System.out.println("");
        System.out.println("La Sala se creo correctamente.");
        System.out.println("==================================================");
        System.out.println("");

    }

    public void mostrarSala(Sala salaCine, ArrayList<Sala> salaList) {
        System.out.println("==================MOSTRAR SALA==================");
        System.out.println("");
        for (Sala mostrarSalas : salaList) {
            System.out.println(mostrarSalas.getNombreSala() + " Precio Entrada: $" + mostrarSalas.getPrecioEntrada());
            System.out.println("");
            for (int i = 0; i < asiento.length; i++) {
                for (int j = 0; j < asiento[i].length; j++) {
                    System.out.print(asiento[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }

        System.out.println("==================================================");
        System.out.println("");
    }

    public void asignarSalaPeli(ArrayList<Peliculas> movieList, ArrayList<Sala> salaList) {
        System.out.println("=============ASIGNAR SALA Y PELI=============");
        String salir;

        do {
            //Instanciamos un objeto tipo sala
            Sala salaCine = new Sala();
            System.out.println("Ingrese el Nombre de la Sala");
            salaCine.setNombreSala(leer.next());
            System.out.println("");
            salaCine.setAsiento(asiento);
            salaCine.setFila(fila);
            salaCine.setColumna(columna);
            //Pedimos el precio de la entrada
            System.out.println("Ingrese el Precio de la Entrada");
            salaCine.setPrecioEntrada(leer.nextInt());
            //Agregamos la sala a la lista de salas
            salaList.add(salaCine);
            System.out.println("Queres agregar otra Sala (S / N)??");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("S"));

        System.out.println("");
        //Mostramos la cartelera
        mostrarListaPeliculas(movieList);
        //Pedimos la pelicula que se muestra en la sala
        for (Peliculas mostrarCart : movieList) {
            System.out.println("");
            System.out.println("Ingrese el Nombre la Pelicula");
            String peliEnSala = leer.next();

            if (mostrarCart.getTitulo().contains(peliEnSala)) {
                System.out.println("Ingrese el Nombre de la sala en la que se va a proyectar la Pelicula");
                String nameSala = (leer.next());
                System.out.println("");
                for (int j = 0; j < salaList.size(); j++) {
                    if (nameSala.contains(salaList.get(j).getNombreSala())) {
                        salaList.get(j).setReproduciendo(movieList.get(j));
                        System.out.println("Se agrego la pelicula a la Sala");
                        System.out.println("");
                    }
                }
            }
        }
        System.out.println("==================================================");
        System.out.println("");
    }

    public void asignarSalaPeliV2(ArrayList<Peliculas> movieList, ArrayList<Sala> salaList) {
        String salir;

        do {
            //Instanciamos un objeto tipo sala
            Sala salaCine = new Sala();
            System.out.println("Ingrese el Nombre de la Sala");
            salaCine.setNombreSala(leer.next());
            System.out.println("");
            salaCine.setAsiento(asiento);
            salaCine.setFila(fila);
            salaCine.setColumna(columna);
            //Pedimos el precio de la entrada
            System.out.println("Ingrese el Precio de la Entrada");
            salaCine.setPrecioEntrada(leer.nextInt());
            //Agregamos la sala a la lista de salas
            salaList.add(salaCine);
            System.out.println("Queres agregar otra Sala (S / N)??");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("S"));

        System.out.println("");
        //Mostramos la cartelera
        mostrarListaPeliculas(movieList);

    }

    public void mostrarSalaPeli(ArrayList<Sala> salaList) {
        System.out.println("=============MOSTRAR PRECIO, SALA Y PELI=============");

        for (Sala aux : salaList) {

            if (aux.getReproduciendo() == null) {
                System.out.println("No se ha asignado ninguna Pelicula a esta Sala");
            } else {
                System.out.println("La Pelicula" + aux.getReproduciendo() + " esta en la " + aux.getNombreSala() + " Precio $" + aux.getPrecioEntrada());
            }
        }
        System.out.println("==================================================");
        System.out.println("");
    }

    public void comprarEntradas(ArrayList<Peliculas> movieList, ArrayList<Espectador> espectadorList) {//Terminar
        System.out.println("=================COMPRAR ENTRADAS=================");
        System.out.println("");
        System.out.println("Ingrese su Nombre de Usuario");
        String usuario = leer.next();
        for (Espectador MostrarEspectador : espectadorList) {
            if (usuario.equalsIgnoreCase(espectadorList.get(0).getNombre())) {
                System.out.println("Bienvenido: " + espectadorList.get(0));
            }else {
                System.out.println("Usuario Incorrecto!");
            }
            
        }

        System.out.println("Ingrese el Nombre de la Pelicula");
        mostrarListaPeliculas(movieList);

    }

}
