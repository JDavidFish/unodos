//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

package ejercicio1e2;

import java.util.Scanner;


public class Ejercicio1E2 {

  
    public static void main(String[] args) {
   Scanner read= new Scanner(System.in);
        System.out.println("Ingrese dos números se mostrará el resultado de la suma entre ellos.");
        System.out.println("Ingrese el primer valor");
        int num=read.nextInt();
        System.out.println("Ingrese el segundo valor.");
        int num1=read.nextInt();
        int sum=num+num1;
        System.out.println("El resultado de la suma entre "+num+" y "+num1+" es "+sum);
    }
    
}
