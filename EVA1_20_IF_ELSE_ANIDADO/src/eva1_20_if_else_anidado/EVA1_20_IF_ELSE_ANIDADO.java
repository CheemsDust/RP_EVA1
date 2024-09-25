/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author calza
 */
public class EVA1_20_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dias;
        Scanner captu = new Scanner(System.in);
        System.out.println("dame el numero del dia:  (1 a 7)");
        dias = captu.nextInt();
        captu.nextLine();
        
        if(dias == 1){
            System.out.println("domingo");
        }else if(dias == 2){
            System.out.println("lunes");
        }else if(dias == 3){
            System.out.println("martes");
        }else if(dias == 4){
            System.out.println("miercoles");
        }else if(dias == 5){
            System.out.println("jueves");
        }else if(dias == 6){
            System.out.println("viernes");
        }else if(dias == 7){
            System.out.println("sabado");
        }else{
            System.out.println("numero de dia incorrecto!!");
        }
            
    }
    
}
