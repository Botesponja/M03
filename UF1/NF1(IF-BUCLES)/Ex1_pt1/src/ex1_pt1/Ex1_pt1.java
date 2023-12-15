/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1_pt1;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1_pt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, tope_dia = 0;
       
        System.out.println("Introduce dia: ");
        dia = sc.nextInt();
       
        System.out.println("Introduce mes: ");
        mes = sc.nextInt();
       
        System.out.println("Introduce año: ");
        año = sc.nextInt();
       
        System.out.println("Dia --> " + dia);
        System.out.println("Mes --> " + mes);
        System.out.println("Año --> " + año);
       
        switch (mes) {
            case 1:
                tope_dia = 31;
                break;
            case 2:
                tope_dia = 28;
                break;
            case 3:
                tope_dia = 31;
                break;
            case 4:
                tope_dia = 30;
                break;
            case 5:
                tope_dia = 31;
                break;
            case 6:
                tope_dia = 30;
                break;
            case 7:
                tope_dia = 31;
                break;
            case 8:
                tope_dia = 31;
                break;
            case 9:
                tope_dia = 30;
                break;
            case 10:
                tope_dia = 31;
                break;
            case 11:
                tope_dia = 30;
                break;
            case 12:
                tope_dia = 31;
                break;
            default:
               
        }
       
       
       
        if (dia > tope_dia || dia <= 0 )
        {
            System.out.println("Dia incorrecto");
        }
       
        else if (mes > 12 || mes <= 0 )
        {
            System.out.println("Mes incorrecto");
        }
         
        else if (año < 1900)
        {
            System.out.println("Año incorrecto");
        }
         
        else
        {
            System.out.println("Fecha correcta");
        }
       
       
   
    }
}
