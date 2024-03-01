/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_exepciones;

import java.util.Scanner;



/**
 *
 * @author beta1501
 */
public class Ex5_Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            imprimePositivo(0);
            imprimeNegativo(0);
        } 
        catch (Exception ex) {
            System.out.println("Excepcion capturada. " + ex.getMessage());
        }
        
       
    }
    public static void imprimePositivo(int p) throws Exception{
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Pon numero positivo:");
            p = sc.nextInt();
            System.out.println("Numero positivo " + p);

            if (p < 0) {
                throw new Exception("Numero no positivo. " + p);
            }
        }while(p>0);
    }
    public static void imprimeNegativo(int n) throws Exception{
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Pon numero negativo:");
            n = sc.nextInt();
            System.out.println("Numero negativo " + n);

            if (n > 0) {
                throw new Exception("Numero no negativo: " + n);
            }
        }while(n>0);
    }
}
