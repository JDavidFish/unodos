/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
      
        System.out.println("Se ingresará un valor en euros se mostrará el equivalente en varias monedas.");
        System.out.println("Ingrese el valor.");
        double money=read.nextInt();
        dinners(money);
        
    }
    public static void dinners(double money){
        System.out.println("La cantidad equivalente en libras es "+money*0.86);
        System.out.println("La cantidad equivalente en dolares es "+money*1.28611);
        System.out.println("La cantidad equivalente en yenes es "+money*129.852);
        
    }
    
}
