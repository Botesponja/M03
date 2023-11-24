/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprogramvariables;

import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class FirstProgramVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int m01, m02, m03;  
      //un objecte que escaneja dades de entrada
      //System.in indico que sigui pero consola
      Scanner pantalla = new Scanner(System.in);
      /*
      Informar valor por el usuario
      */
      System.out.println("¿Que crees que sacaras en M01?");
      m01 = pantalla.nextInt();
      System.out.println("Y en M02?");
      m02 = pantalla.nextInt();
      System.out.println("Y en M03?");
      m03 = pantalla.nextInt();
      
      System.out.println("Tu nota de M01 es " + m01);
      System.out.println("Tu nota de M02 es " + m02);
      System.out.println("Tu nota de M03 es " + m03);
      
    }
    
}
