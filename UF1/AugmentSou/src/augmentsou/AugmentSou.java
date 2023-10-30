/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package augmentsou;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class AugmentSou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo;
        int SUELDO_MINIMO = 18000;
        int SUELDO_MEDIO = 30000;
        int SUELDO_MAXIMO = 45000;
        double incremento;
        System.out.println("Introduzca sueldo anual: ");
        sueldo = sc.nextInt();
        
        if (sueldo < SUELDO_MINIMO) 
        {// incremento del 12%
            incremento = sueldo * 0.12;
            sueldo = sueldo + incremento;
        }
        else if (sueldo >= SUELDO_MINIMO && sueldo <= SUELDO_MEDIO) 
        {// incremento del 10%
            incremento = sueldo * 0.10;
            sueldo = sueldo + incremento;
        }
         else if (sueldo > SUELDO_MEDIO && sueldo < SUELDO_MAXIMO) 
        {// incremento del 8%
            incremento = sueldo * 0.08;
            sueldo = sueldo + incremento;
        }
         else 
         {// incremento del 6%
            incremento = sueldo * 0.06;
            sueldo = sueldo + incremento;
         }
        
        System.out.println("Le toca un incremento de " + incremento);
        System.out.println("Sueldo del año que viene: "+ sueldo);
    }
    
}
