/*
 * Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Se ingresaran dos numeros para realizar operaciones a eleccion.");
        String word="";
        System.out.println("Ingrese primer valor");
        double num=read.nextDouble();
        System.out.println("Ingrese segundo valor");
        double num1=read.nextDouble();
        
        do{
            System.out.println("A-Suma.");
            System.out.println("B-Resta.");
            System.out.println("C-Multiplicacion.");
            System.out.println("D-Divicion.");
            System.out.println("S-Salir.");
            System.out.println("Elije una operacion.");
            word=read.next();
            word=word.toUpperCase();
            switch(word){
                case "A":
                    System.out.println("El resultado de la suma es "+addition(num,num1));
                    System.out.println("¿Desea realizar otra operacion?");
                    System.out.println("N/n Salir.  S/s Continuar.");
                    word=read.next();
                    if("s".equalsIgnoreCase(word)){
                        word="Exit";
                        break;
                    }else{
                    break;
                    }
                   case "B":
                       System.out.println("El resultado de la resta es "+substraction(num,num1));
                    System.out.println("¿Desea realizar otra operacion?");
                    System.out.println("N/n Salir.  S/s Continuar.");
                    word=read.next();
                    if("s".equalsIgnoreCase(word)){
                        word="Exit";
                        break;
                    }else{
                    break;
                    }   
  case "C":
      System.out.println("El producto entre ambos numeros es "+multiplication(num,num1));
                    System.out.println("¿Desea realizar otra operacion?");
                    System.out.println("N/n Salir.  S/s Continuar.");
                    word=read.next();
                    if("s".equalsIgnoreCase(word)){
                        word="Exit";
                        break;
                    }else{
                    break;
                    }
                      case "D":
                          System.out.println("El cociente entre ambos numeros es "+division(num,num1));
                    System.out.println("¿Desea realizar otra operacion?");
                    System.out.println("N/n Salir.  S/s Continuar.");
                    word=read.next();
                    if("s".equalsIgnoreCase(word)){
                        word="Exit";
                        break;
                    }else{
                    break;
                    }
                      case "S":
                    System.out.println("¿Desea Salir?");
                    System.out.println("N/n Salir.  S/s Continuar.");
                    word=read.next();
                    if("s".equalsIgnoreCase(word)){
                        word="Exit";
                        break;
                    }else{
                    break;
                    }
                      default:
                          System.out.println("La opciton no es correcta .");
                          System.out.println("Intente otra vez");
            }
             
        }
            while(word.equals("Exit"));
                
    }
    public static double addition(double num,double num1){
    double add=0;
    add=num+num1;
    return add;
    }
    public static double substraction(double num,double num1){
        double substract=0;
        substract=num-num1;
        return substract;
    }
    public static double multiplication(double num,double num1){
        double multiply=1;
        multiply=num*num1;
        return multiply;
    } 
    public static double division(double num,double num1){
        double split=1;
        split=num/num1;
        return split;
    }
}
