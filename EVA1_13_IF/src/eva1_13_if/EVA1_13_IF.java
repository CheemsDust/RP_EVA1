/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
         Scanner captu = new Scanner(System.in);
         System.out.println("captura la edad");
         edad = captu.nextInt();    //esto es capturar xd
         
         //instruccion if
         if(edad >= 18){
             System.out.println("Adulto: mayor de edad");
             
             
         }else{
             System.out.println("menor de edad");
         }
    }
    
}
