/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_califa;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_14_califa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura la calificacion final");
        cali = captu.nextInt();
        
        if(cali>=70){
            System.out.println("Aprobado: calificacion aprobatoria");
            
        }else{
            System.out.println("N/A");
        }
    }
    
}
