/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_12_formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dis, vel, tiem, acel;
        Scanner captu = new Scanner(System.in);
        System.out.println("dame la velocidad inicial:");
        vel = captu.nextDouble();
        System.out.println("dame el timpo transcurrido:");
        tiem = captu.nextDouble();
        System.out.println("dame la aceleracion:");
        acel = captu.nextDouble();
        dis = vel*tiem+(acel * tiem * tiem)/2.0; //siempre poner el punto al dividir para obtener resultados correctos
        System.out.println("Distancia = "+ dis);
    }
    
}
