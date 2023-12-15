/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_10_bucles;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class Exercici_10_Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        boolean hayNotaDiez = false;

        System.out.println("Introduce notas del 0 al 10 y termina con -1.");

        do {
            nota = sc.nextInt();

            if (nota == 10) {
                hayNotaDiez = true;
                break;
            } else if (nota == -1) {
                break;
            }
        } while (true);

        if (hayNotaDiez) {
            System.out.println("Se encontró al menos una nota 10.");
        } else {
            System.out.println("No se encontró ninguna nota 10.");
        }

    }
    
}
