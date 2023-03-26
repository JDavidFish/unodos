/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     boolean check1=false;
        Scanner read=new Scanner(System.in);
        System.out.println("Se amalizara una matriz de 3x3 y se determinará si ésta es magica.");
        int[] check=new int[8];
        int[][] matrix= new int [3][3];
        System.out.println("Ingrese valores");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Posicion ["+i+"] , ["+j+"]");
               
                matrix[i][j]=read.nextInt();
            } 
        }
        for (int i = 0; i < 7; i++) {
            
       
            for (int j = 0; j < 3; j++) {
            if(i<=2){
                   check[i]+=matrix[i][j];
            }else if(i>=3&&i<=5){
                   check[i]+=matrix[j][i-3];
               }else{
                               
                   check[i]+=matrix[j][j];
                   check[i+1]+=matrix[j][2-j];
                   }
         }
    }
        for (int i = 0; i < 8; i++) {
            System.out.println(check[i]+",");
            check1=check[1]==check[i];
            if(check1==false){
                break;
            }else{
                continue;
            }
        }
        System.out.println("Esta matriz es MAGICA ["+check1+"]");
    }}

