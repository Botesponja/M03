/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int horas, h_extra;
        final double T_NORMAL = 20;
        final int HORAS_NORMAL= 40;
        final double PRECIOS_EXTRA = 1.5;
        double salario, salario_extra, salario_normal;
         
        System.out.println("Introduce horas trabajadas:");
        horas = sc.nextInt();
        
        if (horas > HORAS_NORMAL) 
        {
            h_extra = horas - HORAS_NORMAL;
            salario_extra = h_extra * T_NORMAL * PRECIOS_EXTRA;
            salario_normal = HORAS_NORMAL * T_NORMAL;
            salario = salario_normal + salario_extra;
        } 
        else 
        {
            salario = horas * T_NORMAL;
        }
        
        System.out.println("Tu salario bruto es......... " + salario);
        
        final int SALARIO_SIN_IMPUESTOS = 500;
        final int SALARIO_TOPE_IMPUESOTS = 900;
        //Impuestos
        double impuestos = 0, impuestos_25;
        double salario_impuestos, salario_tope_impuestos;
        
        
        if (salario > SALARIO_TOPE_IMPUESOTS) 
        {//tipo45%
            salario_tope_impuestos = salario - SALARIO_TOPE_IMPUESOTS;
            impuestos = salario_tope_impuestos * 0.45;
            salario_impuestos = SALARIO_TOPE_IMPUESOTS - SALARIO_SIN_IMPUESTOS;
            impuestos_25 = salario_impuestos * 0.25;
            impuestos = impuestos + impuestos_25;
            System.out.println("            Impuestos...." + impuestos);
        }
        else if (salario > SALARIO_SIN_IMPUESTOS && salario < SALARIO_TOPE_IMPUESOTS) 
        {//tipo 25%
            salario_impuestos= salario - SALARIO_SIN_IMPUESTOS;
            impuestos = salario_impuestos * 0.25;
            System.out.println("            Impuestos...." + impuestos);
        }
        
        //Salario neto
        salario = salario - impuestos;
        System.out.println("            Salario neto.... " + salario);
        
    }
    
}
