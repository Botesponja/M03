/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class Exercici9 {

    /**
     
9.  Dibuja un ordinograma de un programa que pide la edad
por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de
“eres menor de edad”.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduzca edad");
        int edad = sc.nextInt();
        
        if (edad >=18)
        {
            System.out.println("Eres mayor de edad");
        }
        
        else
        {
            System.out.println("Eres menor de edad");
        }
    }
    
}  
