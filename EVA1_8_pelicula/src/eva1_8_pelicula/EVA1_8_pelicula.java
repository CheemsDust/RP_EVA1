/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_8_pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String genero;
        int duracion;
        String actores;
        String clasificacion;
        
        Scanner captu;
        captu = new Scanner(System.in);
        System.out.println("capturar el nombre de la pelicula");
        nombre = captu.nextLine();
        System.out.println("capturar el genero de tu pelicula");
        genero = captu.nextLine();
        System.out.println("captura el tiempo de la pelicula en segundos");
        duracion = captu.nextInt();
        System.out.println("captura la clasificacion");
        clasificacion = captu.nextLine();
        System.out.println("captura los nombres de los actores");
        actores = captu.nextLine();
        //imprimir
        System.out.println("<<<<<<<<<<<datos imprimidos>>>>>>>>>>>");
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(actores);
        System.out.println(clasificacion);
    }
    
}
