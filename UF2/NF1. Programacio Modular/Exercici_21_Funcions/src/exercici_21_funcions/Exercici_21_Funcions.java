/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_21_funcions;

import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class Exercici_21_Funcions {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            opcion = menu();
            double radio;
            switch (opcion) {
                case 1:
                    radio = pideRadio();
                    double circunferencia = circunferencia(radio);
                    System.out.println("La circunferencia es: " + circunferencia);
                    break;
                case 2:
                    radio = pideRadio();
                    double area = area(radio);
                    System.out.println("El área es: " + area);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija 1, 2 o 3.");
            }
        } while (opcion != 3);
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Salir");
        System.out.print("Elija una opción (1, 2 o 3): ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static double pideRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio: ");
        double radio = sc.nextDouble();
        return radio;
    }

    public static double circunferencia(double r) {
        return 2 * Math.PI * r;
    }

    public static double area(double r) {
        return Math.PI * r * r;
    }
}
    

