
package ejercicio2;

//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.

import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese frase");
        String phrase=read.nextLine();
        if (phrase.equals("eureka")){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
