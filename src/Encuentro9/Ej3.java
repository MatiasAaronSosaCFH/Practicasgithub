/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package Encuentro9;

import java.util.Scanner;

/**
 *
 * @author mer22
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        
        int [] vector = new int [tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            
            vector [i] = (int) (Math.random() * 100000);
            
            
        }
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println("[" + i + "] = " + vector[i]);            
        }
        
        int unidad = 0, decena = 0, centena = 0, mil = 0, decenamil = 0;
        String digitos;
        
        for (int i = 0; i < tamaño; i++) {
            digitos = "" + vector [i]; 
            if (digitos.length() == 1) {
                unidad++;
            }else if (digitos.length() == 2) {
                decena++;                
            }else if (digitos.length() ==3){
                centena++;
                
            }else if (digitos.length() ==4){
                mil++;
            }else if (digitos.length() ==5){
                decenamil++;
            
                    
        }
    }
        System.out.println("\nEl vector aloja:\n" + unidad + " números de un dígito\n" + decena + " números de 2 dígito\n" + centena + " números de 3 dígito\n" + mil + " números de 4 dígito\n" + decenamil + " números de 5 dígito\n");
}
}









