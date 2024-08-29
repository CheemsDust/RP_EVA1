/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entrada_datos_2;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_6_entrada_datos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de las variables
        String nombre;
        String curp;
        int edad;
        double promedio;
        //crear nuestro scanner
        Scanner captu;
        captu = new Scanner(System.in);
        //capturar:
        System.out.println("captura tu nombre completo:");
        nombre = captu.nextLine();
        System.out.println("captura tu CURP");
        curp = captu.nextLine();
        System.out.println("captura tu edad");
        edad = captu.nextInt();
        System.out.println("captura tu promedio");
        promedio = captu.nextDouble();
        
        //impresion:
        System.out.println("seccion de impresion de datos:");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
    }
    
}
