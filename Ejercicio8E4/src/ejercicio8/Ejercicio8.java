
package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {

 
    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
        System.out.println("Se dibujará un rectangulo del tamaño designado");
        System.out.println("Designe tamaño");
        int num=read.nextInt();
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num; j++) {
                if(i==0 || j==0 || i==(num-1) || j==(num-1)){
                    System.out.print("*");
            }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println(" ");
        }
    }
    
}
