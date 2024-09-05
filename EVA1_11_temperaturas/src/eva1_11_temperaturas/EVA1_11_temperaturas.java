/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperaturas;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_11_temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conversiones de temperaturas
        double far, cent, kelv;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura los faherenheit");
        far = captu.nextDouble();
        cent = (far - 32) / 1.8; //expresion
        System.out.println("C = "+ cent);
        
        System.out.println("captura los celsius");
        cent = captu.nextDouble();
        far = cent*1.8+32;
        System.out.println("F = "+ far);
        
        System.out.println("captura los faherenheit");
        far = captu.nextDouble();
        kelv = (far + 459.67)/1.8;
        System.out.println("K = "+ kelv);
        
        System.out.println("captura los celsius");
        cent = captu.nextDouble();
        kelv = cent + 273.15;
        System.out.println("K = "+ kelv);
        
        
        
        
    }
    
}
