/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriusbidimensionals;

import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class MatriusBidimensionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int[][] notes_alumnes = new int[notes_alumnes.length][notes_alumnes[0].length];
       int[][] notes_alumnes = new int[3][4];
       
       introduirNotes(notes_alumnes);
       mostrarArray(notes_alumnes);
       notasAlumno(notes_alumnes);
       notasModulo(notes_alumnes);
    }
    
    
    /**
     * Demanar les notes al usuari de tots els alumnes i moduls
     * @param notes_alumnes 
     **/
    private static void introduirNotes(int[][] notes_alumnes) {
        Scanner sc = new Scanner(System.in);
        
        for (int alumnes = 0; alumnes < notes_alumnes.length; alumnes++) {
            
            for (int Modulos = 0; Modulos < notes_alumnes[0].length; Modulos++) {
                System.out.println("Introduce la nota del alumno " + alumnes + " y el modulo " + Modulos);
                notes_alumnes[alumnes][Modulos] = sc.nextInt();
            }
            
        }
    }

    private static void mostrarArray(int[][] notes_alumnes) {
        for (int i = 0; i < notes_alumnes.length; i++) {
            for (int j = 0; j < notes_alumnes[0].length; j++) {
                System.out.println(notes_alumnes[i][j] + "-");
                //System.out.println("");
                
            }
        }
    }

    private static void notasAlumno(int[][] notes_alumnes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime de que alumno quieres la nota " + notes_alumnes.length );
        int alumno = sc.nextInt();
        for (int col_notas = 0; col_notas < notes_alumnes[alumno-1].length; col_notas++) {
            System.out.println(notes_alumnes[alumno-1][col_notas]+ ",");
        }
        //System.out.println("");
    }

    private static void notasModulo(int[][] notes_alumnes) {
        Scanner sc = new Scanner(System.in);
        int modulo = sc.nextInt();
        for (int alum_filas = 0; alum_filas < notes_alumnes.length; alum_filas++) {
            System.out.println("Alumno " + (alum_filas+1) + "-" + notes_alumnes[alum_filas][modulo]);
        }
    }
    
}
