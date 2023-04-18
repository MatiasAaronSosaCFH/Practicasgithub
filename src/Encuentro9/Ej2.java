/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package Encuentro9;

import java.util.Scanner;

/**
 *
 * @author mer22
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del vector que desee");
        int tamaño = leer.nextInt();
        int vector[] = new int[tamaño]; 
        for (int i = 0; i < tamaño; i++) {
            vector [i] = (int) (Math.random() * 10)+ 1;
        }
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println(vector [i]);
        }
  
        System.out.println("¿Qué número desea buscar?");
        int numero = leer.nextInt();
        // String num2 = "" + numero; //"" para pasar un n a caracter. 
            int cont = 0;    
        for (int i = 0; i < tamaño; i++){
            
            if (vector [i] == numero) {
                System.out.println("El " + numero + "se encuentra en la pocisión " + i);
                cont++;
            } 
   
        }
        System.out.println("El número se repite " + cont);
    }
    
}




