/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_operaciones;

/**
 *
 * @author calza
 */
public class EVA1_9_operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //operaciones aritmeticas
        int x = 10;   //declarando y asignando
        int y = 5;
        //si necesitan muchas variables:
        int suma, resta, mul, div, pote, raiz;
        //suma y resta
        suma = x+y;  //operador de suma +
        System.out.println("la suma de x + y :");
        System.out.println(suma);
        
        resta = x-y;
        System.out.println("resta de x-y:");
        System.out.println(resta);
        //muñtiplicacion
        mul = x*y;
        System.out.println("la multiplicacion de x*y:");
        System.out.println(mul);
        //division
        //si divides enteros, Java da como resultado enteros
        div = x/y;
        System.out.println("la division de x/y:");
        System.out.println(div);
        x = 5;
        y = 2;
        System.out.println("division de x (5) / y (2):");
        System.out.println(div);
        
        //divison con numeros con punto flotante
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1/val2;
        System.out.println("division de vall (5) / val2 (2)");
        System.out.println(resu);
        
    }
    
}
