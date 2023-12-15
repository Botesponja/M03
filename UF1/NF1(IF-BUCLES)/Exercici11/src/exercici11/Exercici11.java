/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Introduzca primer numero");
        num1 = sc.nextDouble();
        
        System.out.println("Introduzca segundo numero");
        num2 = sc.nextDouble();
        
        if (num1 == num2) 
        {
            System.out.println("Son iguales");
            
        }
        
        else if (num1 > num2)
        {
            System.out.println("El mayor es " + num1);
        }
        
        else if (num1 >num2)
            
        {
            System.out.println("El mayor es " + num2);
        }
            
    }
    
}
