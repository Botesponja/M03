/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class Exercici5 {

    /**
     * @5.
Dibuja un ordinograma que toma como dato de entrada un
número que corresponde a la longitud de un radio y nos escribe la longitud de
la circunferencia(Pi * diametro), el área del círculo(buscalo en google).
     */
    public static void main(String[] args) {
        double pi=3.14, diametro, longitud, area, radio;
        
        Scanner pantalla = new Scanner(System.in);
        
        System.out.println("Introduzca valor de radio");    
        radio = pantalla.nextDouble();
        diametro = 2*radio;
        longitud = pi*diametro ;
        area= pi*(radio*radio);
        
        System.out.println("Area = " + area);
        System.out.println("Longitud = " + longitud);
    }
    
}
