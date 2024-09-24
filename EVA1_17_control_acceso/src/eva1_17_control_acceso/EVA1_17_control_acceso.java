/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_17_control_acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear variables y capturar usuario y contraseña
        String usu, cont;
        Scanner captu = new Scanner(System.in);
        System.out.println("usuario: ");
        usu = captu.nextLine();
        System.out.println("contraseña: ");
        cont = captu.nextLine();
        
        if(usu == ("Admin") && cont == ("1234")){
            System.out.println("Acceso concedido!!!");
        }else{
            System.out.println("Acceso denegado");
        }
        
        
    }
    
}
