//Realizar un programa que solo permita introducir solo frases o palabras de 8 
//de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
//Nota: investigar la función Lenght() en Java.

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

  
    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
        System.out.println("Ingrese frases o palabras de 8 caracteres de longitud.");
        String word=read.nextLine();
        
        if(word.length() ==8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("Incorrecto");
        }
                
  
    }
    
}
