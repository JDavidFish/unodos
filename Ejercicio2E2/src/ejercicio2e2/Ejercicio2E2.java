//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

package ejercicio2e2;

import java.util.Scanner;

public class Ejercicio2E2 {

  
    public static void main(String[] args) {
  Scanner read=new Scanner(System.in);
        System.out.println("Se pedirá un nombre y se mostrará por pantalla.");
        System.out.println("Ingrese nombre.");
        String name=read.nextLine();
        System.out.println("El nombre ingresado es "+name);
    }
    
}
