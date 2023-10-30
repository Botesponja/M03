/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fifa;

import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class FIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = System.lineSeparator();
        
        char opcion;
        
        
        do {  
            
            System.out.println("****Bienvenido a FIFA****"
                + l + "A - Jugar"
                + l + "B - Entrenar"
                + l + "C - Jugar Partido Online"
                + l + "D - Salir"
                + l + "Escoje Opcion: ");
            opcion = sc.next().charAt(0);
            
            switch (opcion) {
            case 'a':
            case 'A':
                System.out.println("Estas jugando...");
                break;
            case 'b':
            case 'B':
                System.out.println("Estas entrenando...");
                break;
            case 'c':
            case 'C':
                System.out.println("Estas jugando online...");
                break;
            case 'd':
            case 'D':
                System.out.println("EXIT");
                break;
            default:
                System.out.println("Esa opcion no existe");;
        }
            
        } while (opcion !='D'&& opcion !='d');
        
        
        
        
    }
    
}
