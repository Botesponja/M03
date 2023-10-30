/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class Exercici3 {

    /**
     3. Dibuja un ordinograma que calcule el área 
     de un cuadrado cuyo lado se introduce por teclado.
     */
    public static void main(String[] args) {
        int lado, area;
        Scanner pantalla = new Scanner(System.in);
        
        System.out.println("Introduzca valor de lado");
        lado=pantalla.nextInt();
        
        area=lado*lado;
        
        System.out.println("El area del cuadrado es: " + area);
        
    }
    
}
