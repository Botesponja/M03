/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3_pt1;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3_pt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int premium, local, mercadillo;
        double PRECIO_PREMIUM = 20, PRECIO_LOCAL = 15, PRECIO_MERCADILLO = 7;
        
        System.out.println("¿Cuantos productos premium hay en la cesta?");
        premium = sc.nextInt();
        
        System.out.println("¿Y locales?");
        local = sc.nextInt();
        
        System.out.println("¿Y de mercadillo?");
        mercadillo = sc.nextInt();
        
        
        double total_premium, total_local, total_mercadillo, precio_total;
        int producto;
        
        producto = premium + local + mercadillo;

        total_premium = PRECIO_PREMIUM * premium;
        total_local = PRECIO_LOCAL * local;
        total_mercadillo = PRECIO_MERCADILLO * mercadillo;
        precio_total = total_local + total_mercadillo + total_premium;
        
        
        System.out.println("Total productos premium.... " + total_premium);
        System.out.println("Total productos local.... " + total_local);
        System.out.println("Total productos mercadillo.... " + total_mercadillo);
        
        if (precio_total > 200) 
        {
         precio_total = precio_total - PRECIO_PREMIUM;   
        }
        
        if (producto > 5 ) 
        {
          precio_total = precio_total - ((precio_total * 15) / 100);
            System.out.println("    Descuento 15%.... SI");
        }
        else 
        {
            System.out.println("    Descuento 15%.... NO");
        }
        
        System.out.println("TOTAL.... " + precio_total);
                
    }
    
}
