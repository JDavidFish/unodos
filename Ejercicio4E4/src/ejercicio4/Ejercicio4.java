
package ejercicio4;
//Escriba un programa que pida una frase o palabra y valide si la primera
//letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de

import java.util.Scanner;

//imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
//contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
//Substring y equals() de Java.

public class Ejercicio4 {

    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
        System.out.println("Al ingresar una frase o cadena se analizará si la primera letra es la vocal A .");
        String phrase=read.nextLine();
        if(phrase.substring(0,1).equals("A")) {
            System.out.println("");
    }
    
}
}