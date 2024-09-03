/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_operaciones2;

import java.util.Locale;

/**
 *
 * @author calza
 */
public class EVA1_10_operaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //concatenacion cadenas:
        //operador de concatenacion +
        //mismo simbolo con diferentes usos:
        //sobrecarga de operadores
        String nombre = "Luis";
        String apellido = "calzadillas";
        String nomCom;
        //cancatenar:
        nomCom = nombre + " " + apellido;
        //imprimir datos
        System.out.println("Nombre del usuario:  " + nombre);
        System.out.println("Apellido del usuario:  " + apellido);
        System.out.println("nombre completo del usuario:  " + nomCom);
    }
}
