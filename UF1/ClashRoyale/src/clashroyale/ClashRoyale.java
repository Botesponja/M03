/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copas;
        char carta;
        
        System.out.println("¿Cuantas copas tenes?");
        copas = sc.nextInt();
        
        
        if (copas < 2000) 
        {
            System.out.println("M. Mago Electrico\nE. Esbirro Mega");
        } 
        
        else if (copas >= 2000 & copas < 3000)
        {
            System.out.println("M. Mago Electrico\nE. Esbirro Mega\nC. Caballero\nB. Bandida");
        }
        
        else//if (copas >= 3000)
        {
            System.out.println("M. Mago Electrico\nE. Esbirro Mega\nC. Caballero\nB. Bandida\nQ. Ejercito de Esqueletos\nG. Guardian");
        }
       
        System.out.println("Escoge una carta:");
        carta = sc.next().charAt(0);
       
        switch (carta) {
            case 'm':
            case 'M':
                System.out.println("Has escogido Mago Electrico");
                break;
            case 'e':
            case 'E':
                System.out.println("Has escogido Esbirro Mega");
                break;
            case 'c':
            case 'C':
                System.out.println("Has escogido Caballero");
                break;
            case 'b':
            case 'B':
                System.out.println("Has escogido Bandida");
                break;
            case 'q':
            case 'Q':
                System.out.println("Has escogido Ejercito de Esqueletos");
                break;
            case 'g':
            case 'G':
                System.out.println("Has escogido Guardian");
                break;
            default:
                System.out.println("Esa carta no existe");
        }
    }
    
}
