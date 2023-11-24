/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comprobacionpares;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class ComprobacionPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pon valor 1? ");
        int valor1 = scanner.nextInt();
        System.out.print("Pon valor 2? ");
        int valor2 = scanner.nextInt();

        if (valor1 % 2 != 0) {
            System.out.println("El " + valor1 + " no es par");
        }
        if (valor2 % 2 != 0) {
            System.out.println("El " + valor2 + " no es par");
        }
    }
    
}
