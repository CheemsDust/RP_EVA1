/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_18_rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la calificacion");
        califa = captu.nextInt();
        
        if(califa >= 0 && califa <=100){
            System.out.println("calificacion valida");
        }else{
            System.out.println("calificacion no valida");
        }
    }
    
}
