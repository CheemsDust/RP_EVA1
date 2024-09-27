/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura la calificacion final");
        cali = captu.nextInt();
        
        if(cali >= 90 && cali <= 100){
            System.out.println("tienes una:  A");
        }else if(cali >= 80 && cali <= 89){
            System.out.println("tienes una:  B");
        }else if(cali >= 70 && cali <= 79){
            System.out.println("TIenes una:  C");
        }else if(cali >= 60 && cali <= 69){
            System.out.println("Tienes una:  D");
        }else if(cali >= 0 && cali <= 59){
            System.out.println("tienes una:  F");
        }else{
            System.out.println("numero de calificacion invalida!!!");
        }
    }
    
}
