
package ejercicio5;
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

import java.util.Scanner;


public class Ejercicio5 {

 
    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
     int addition;
        System.out.println("Se determinará un valor límitre y luego se solicitaran otros para ser sumados,");
        System.out.println("si la suma en mayor o igual el programa finalizará.");
        System.out.println("Ingrese el valor limite");
     int reference=read.nextInt();
        System.out.println("Ingrese primer valor a sumar");
        int num=read.nextInt();
        addition=num;
     while(addition<=reference){
         
         System.out.println("Ingrese el siguiente valor a sumar");
         num=read.nextInt();
         addition+=num;
         if(addition>reference){
         break;
         }
         
     }
         System.out.println("La suma de los valores ingresados es "+addition+" y el valor limite es "+reference);
     
     }
    
}
