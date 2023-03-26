/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size=0;int num=0;
      Scanner read=new Scanner(System.in);
        System.out.println("En un conjunto de N  numeros aleatorios de hasta 5 cifras se los clasificara,");
        System.out.println("a cada uno de acuerdo a la cantidad de cifras ");
        System.out.println("Ingrese la cantidad de elementos que contendrá el conjunto.");
        int n=read.nextInt();
        int[] classification=new int[5];
      //  int[] set=new int[n];
        for (int i = 0; i < n; i++) {
    num=(int)(Math.random()*10000);
            size= (String.valueOf(num)).length();
            System.out.println(size+"");
            switch(size){
                case 1: 
                    classification[size-1]++;
                    
                    break;
                case 2: 
                     classification[size-1]++;
                     break;
                case 3:
                     classification[size-1]++;
                     break;
                case 4: 
                     classification[size-1]++;
                     break;
                case 5:
                     classification[size-1]++;
                     break;
                default:
                     classification[5]++;
                     break;
            }
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("La cantidad de elementos de "+(i+1)+" cifra es "+classification[i]);
        }
    }
    
}
