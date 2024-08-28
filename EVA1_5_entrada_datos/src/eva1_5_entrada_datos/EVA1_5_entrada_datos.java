/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_5_entrada_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
        //capturar datos del teclado:
        //Scanner --> herramienta (clase)
        //Scanner es un tipo de dato
        Scanner captura;   //incorporar la herramienta al codigo (inport)
        //no existe, hay que crearla darle un valor
        captura = new Scanner(System.in);
        
        //darle la instruccion al usuario
        System.out.println("introduce tu nombre completo:  ");
        //capturar (asignar un valor variable)
        nombre = captura.nextLine(); //capturamos todo el texto hasta que se precione "enter"
        
        //imprimir los datos
        System.out.println("-------------datos capturados----------------");
        System.out.println(nombre);
        
        
    }
    
}
