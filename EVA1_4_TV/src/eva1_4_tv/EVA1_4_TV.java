/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_tv;

/**
 *
 * @author calza
 */
public class EVA1_4_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Television
        String marca; //string para texto
        String modelo;
        int pulgadas;      //int para numeros sin flotantes
        double precio; //double para numeros con flotantes
        String tecnologia;
        
        
        //asignamos
        marca = "samsung";
        modelo = "Smart TV";
        pulgadas = 35;
        tecnologia = "LED";
        precio = 1999.99;
        
        //imprimir los datos
        System.out.println(marca);    //el system es para imprimir los datos ya establecidos
        System.out.println(modelo);
        System.out.println(pulgadas);
        System.out.println(tecnologia);
        System.out.println(precio);
    }
    
}
