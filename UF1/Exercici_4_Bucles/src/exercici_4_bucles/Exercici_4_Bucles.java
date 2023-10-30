/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_4_bucles;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class Exercici_4_Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int N = sc.nextInt();
        
         for (int i = 1; i <= N; i++) {
            System.out.println(i);
        } 
    }
    
}
