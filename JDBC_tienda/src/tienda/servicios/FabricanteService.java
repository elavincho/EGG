/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author elavincho
 */
public class FabricanteService {

Scanner leer = new Scanner(System.in);    
    
    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

   public void insertarFabricante(){
       System.out.println("Ingrese el Nombre del Fabricante");
       String nombre = leer.nextLine();
       try {
           dao.ingresarFabricante(nombre);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

}
