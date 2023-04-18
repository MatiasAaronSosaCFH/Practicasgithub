/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.
 */
package Encuentro9;

/**
 *
 * @author mer22
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [] vector = new int [100];
        
        for (int i = 0; i < 100; i++) {
            
            vector [i] = (int) (Math.random() *100);
            
        }
                
        for (int i = 0; i < 100; i++) {
            System.out.println(vector [i]);
            
        }
  
                 
    }
    
}

