/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean check=true;
     Scanner read =new Scanner(System.in);
        System.out.println("Se determinará si una matriz es antisimetrica, es decir A=-AT, ");
        System.out.println("Designe orden de la Matriz");
        int order=read.nextInt();
     int[][] matrix=new int[order][order];
        System.out.println("Ingrese valores");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.println("Ingrese valor en la posicion ["+(i+1)+"] ; ["+(j+1)+"]");
                matrix[i][j]=read.nextInt();
            }
            
        }
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if(matrix[i][j]==(-matrix[j][i])){
                    check=true;
                }else{
                    check=false;
                    break;
                }
                
            }
            
        }
        System.out.println("¿Esta matriz en anticimetrica? "+check);
    }
    
}
