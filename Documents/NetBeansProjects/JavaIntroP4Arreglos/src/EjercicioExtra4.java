
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elavincho
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Los profesores del curso de programación de Egg necesitan llevar un
        registro de las notas adquiridas por sus 10 alumnos para luego obtener
        una cantidad de aprobados y desaprobados. Durante el período de
        cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
        evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el
        arreglo. Al final del programa los profesores necesitan obtener por
        pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
        que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
        notas del curso.*/
        
        Scanner leer = new Scanner(System.in);
        
        //ingresamos los valores
        double[][] matriz = {{8, 9, 7, 9}, {6, 8, 4, 7}, {5, 4, 7, 6}, {6, 5, 7, 6}, {5, 4, 7, 9}, {5, 7, 8, 9}, {6, 5, 7, 5}, {7, 6, 9, 8}, {8, 6, 5, 7}, {5, 4, 6, 3}};
        double suma = 0;
        int i = 0;
        int aprobados = 0;
        
        do {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        suma += (matriz[i][j] * 1.1);
                        continue;
                    case 1:
                        suma += (matriz[i][j] * 1.15);
                        continue;
                    case 2:
                        suma += (matriz[i][j] * 1.25);
                        continue;
                    case 3:
                        suma += (matriz[i][j] * 1.50);
                        continue;
                    case 4:
                        matriz[i][j] = (suma / 4);
                }
            }
            suma = 0;
            i++;
        }while(i != 10);
        System.out.println(" ");
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("{" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        for (i = 0; i < 10; i++) {
            {
                if (matriz[i][3] >= 7) { // 3 porque son 4 notas y se cuentan desde el 0.
                    aprobados++;
                }
                
            }
        }
        System.out.println("");
        System.out.println("Los aprobados son: " + aprobados);
        System.out.println("Los desaprobados son: " + (10 - aprobados));
    }
    
}
