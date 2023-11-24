/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_pt1;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2_pt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char vocal;
        
        System.out.println("Introduce vocal: ");
        vocal = sc.next().charAt(0);
        
        switch (vocal) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vocal minuscula");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vocal mayuscula");
                break;
            default:
                System.out.println("Consonante");
        }
 
        
    }
    
}
