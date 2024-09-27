/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_25_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int año; // Cambia el año que deseas verificar
        Scanner captu = new Scanner(System.in);
            System.out.println("captura el año");
            año = captu.nextInt();
        boolean esBisiesto = false;

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0)
                    esBisiesto = true;
            } else {
                esBisiesto = true;
            }
        }

        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
    
}
