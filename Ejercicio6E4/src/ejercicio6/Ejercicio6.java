//Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

        public static void main(String[] args) {
        String option="";
        int election;

        Scanner read = new Scanner(System.in);
        System.out.println("Se solicita dos numeros enteros para realizar opraciones matematicas");
        System.out.println("Ingrese primer valor");
        int num = read.nextInt();
        System.out.println("Ingrese el segundo valor.");
        int num1 = read.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elegir opcion");
            election = read.nextInt();
            switch (election) {
                case 1:
                    System.out.println("La suma es: " + (num + num1));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num - num1));
                    break;
                case 3:
                    System.out.println("El produto es: " + (num * num1));
                    break;
                case 4:
                    double res=(double)num;
                    System.out.println("El cociente es: " + (res/ num1));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir?");
                    System.out.println("s / S para salir    n / N volver al menú");
                    option = read.next();
                    if (option.equalsIgnoreCase("s")) {
                        break;
                   } else if(option.equalsIgnoreCase("n")){
                   continue;
                    }else{
                        System.out.println("La opcion ingresada no es valida ");
                        System.out.println("Volverá al menú principal.");
                         break;
                   }
                   
                default:
                    System.out.println("La opcion ingresada no coresponde a las disponibles");
                    System.out.println("Intente nuevamente");
                    break;
           }
            }while (!option.equalsIgnoreCase("s"));// cuando se antesede una condicion o una exprecion con un signo "!" significa que esta esta negada , es decir que significa lo contrario.
        
         

    }
}