/*

 */
package ejercicio1;

/*Realizar un algoritmo que llene un vector con los 100 primeros números 
enteros y los muestre por pantalla en orden descendente.


 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Se mostrarán los primeros 100 numeros de mayor a menor.");
        int[] numbers=new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i]=i+1;
            
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(numbers[i]+" ,");  
        }
    }
    
}
