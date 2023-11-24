/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class Exercici4 {

    /**
     4. Dibuja un ordinograma que lea dos números, 
     calcule y muestre el valor de sus suma, resta, producto y división.
     */
    public static void main(String[] args) {
        int num1, num2, suma, resta, producto, division;
        Scanner pantalla = new Scanner(System.in);
        
        System.out.println("Introduzca el valor del primer numero");
        num1=pantalla.nextInt();
        System.out.println("Introduzca el valor del segundo numero");
        num2=pantalla.nextInt();
        
        suma=num1+num2;
        resta=num1-num2;
        producto=num1*num2;
        
        
        
        
        System.out.println("La suma es igual a " + suma);
        System.out.println("La resta es igual a " + resta);
        System.out.println("La producto es igual a " + producto);
        if (num2!=0)
        {
        division=num1/num2;
            System.out.println("La division es igual a " + division);
        }
        else
        {
            System.out.println("No puedo dividir entre 0");
        }
        
    }
    
}
