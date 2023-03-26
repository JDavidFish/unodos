/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner read=new Scanner(System.in);
 int counter=0;
        System.out.println("Se indicará una cantidad designada de numeros aleatorios.");
        System.out.println("A continuacion se solicitará buscar un numero en especifico si este se encuentra");
        System.out.println("en el listado se indicará y si estubiese repetido se indicará la cantidad de veces.");
        System.out.println("INGRESE LA CANTIDAD DE VALORES");
        int size=read.nextInt();
        System.out.println("Designe limite maximo");
        int limit=read.nextInt();
        System.out.println("Indique el valor a buscar.");
        int num=read.nextInt();
        int[] random=new int[size];
        for (int i = 0; i < size; i++) {
            random[i]=(int)(Math.random()*limit);
            
        }
        for (int i = 0; i < size; i++) {
            
            System.out.print("["+random[i]+ "]"); 
            if(num==random[i]){
             counter++;   
            }
            
        }
        System.out.println("");
        if(counter==1){
            System.out.println("El valor buscado "+num+" fue encontrado "+counter+" vez,");
        }else if(counter>1){
            System.out.println("El valor buscado "+num+" fue encontrado "+counter+ "veces.");
        }else{
            System.out.println("El valor buscado "+num+" no se encontró.");
        }
    }
    
}
