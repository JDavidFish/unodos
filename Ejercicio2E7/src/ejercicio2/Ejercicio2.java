/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in); // TODO code application logic here
       int fox=0;
       Info(fox);
    }
 

   public static void Info(int fox) {
      Scanner read=new Scanner(System.in);
        int year=0;
        String name="";
        System.out.println("Se sonicita nombre y edad de una persona , se determinará si ésta es mayor de edad.");
        do {
            System.out.println("Escriba el nombre de la persona");
            name=read.next();
            System.out.println("Ingrese edad de esta.");
            
            year=read.nextInt();
            if (year<16){
                System.out.println(name+" es çmenor de edad.");
            }else{
                System.out.println(name+" es mayor de edad.");
            }
            System.out.println("¿Desea ingresar otra persona?.");
            System.out.println("si/Si Continuar.  no/No salir.");
            name=read.next();
        }while(!("no".equalsIgnoreCase(name)));
    }
}
    
