/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class AdivinaNumero {

    /**
     * Programa que piensa un numero del 1 al 20
     * y el usuario va introduciendo numeros hasta adivinarlo
     * si no lo adivina debe dar pista mayor o menor
     */
    public static void main(String[] args) {
        // 1. El programa pensa un numero (numero_correcte)
        Random rd = new Random();
        int rango = 21;
        int numero_correcte = rd.nextInt(rango);
        // 2. (Opcional) Ens el mostra
        System.out.println("Prueba: " + numero_correcte);
        // 3. Demanar un numero (num_usuari)
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero: ");
        int num_usuario = sc.nextInt();
        // 4. Comprovar si el num_usuari es major (tornar al pas 3)
            if (num_usuario>numero_correcte) 
            {
                System.out.println("Tu numero es mayor");
            }
            // Comprovar si el num_usuari es menor (tornar al pas 3)
            else if (num_usuario<numero_correcte) 
            {
                System.out.println("Tu numero es menor");
            }
            // Comprovar si el num_usuari es igual (imprimir, sortir bucle i acabar)
            else
            {
                System.out.println("Es correcto");
            }
            while (num_usuario!=numero_correcte);
    }
    
}
