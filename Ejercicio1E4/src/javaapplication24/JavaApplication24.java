
package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 {
      // Crear un programa que dado un número determine si es par o impar.
   
    public static void main(String[] args) {
Scanner read= new Scanner(System.in);
        System.out.println("Se determina rá si el número ingresado es par o inpar.");
        int num=read.nextInt();
        if (num%2==0) {
            System.out.println("El número ingresado es PAR");
            
      
        }else{
            System.out.println("El numero ingresado es IMPAR");
        }
            
        
    }
    
}
