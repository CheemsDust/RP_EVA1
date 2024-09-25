/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rva1_19_or;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class RVA1_19_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes,kil;
        Scanner captu = new Scanner(System.in);
        System.out.println("kilometraje: ");
        kil = captu.nextInt();
        System.out.println("dame los meses: ");
        mes = captu.nextInt();
        
        if(kil >= 5000 || mes >= 6){
            System.out.println("necesita cambio de aceite!!");
        }else{
            System.out.println("Todo bien con el carro");
        }
        
        
    }
    
}
