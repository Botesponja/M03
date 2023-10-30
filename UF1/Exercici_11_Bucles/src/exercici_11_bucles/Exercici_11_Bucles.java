/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_11_bucles;

/**
 *
 * @author benjamin
 */
public class Exercici_11_Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) 
            {
                sumaPares += i;
            } 
            else 
            {
                sumaImpares += i;
            }
        }

        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
    }
    
}
