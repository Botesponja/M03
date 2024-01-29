package casa;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author benjamin
 */
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Casa inicialmente vacía
        Casa casa = new Casa(null, null);

        int opcion;
        while (true) {
            System.out.println("\n----- Menú Principal -----");
            System.out.println("1. Añadir nueva estancia");
            System.out.println("2. Añadir nueva Bustia");
            System.out.println("3. Añadir nueva Hipoteca");
            System.out.println("4. Amortizar dinero de la Hipoteca");
            System.out.println("5. Mostrar superficie total de la casa");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Solicitar datos para una nueva estancia y agregarla a la casa
                    System.out.print("Tipo de estancia: ");
                    String tipusEstancia = scanner.next();
                    System.out.print("Longitud: ");
                    double llarg = scanner.nextDouble();
                    System.out.print("Anchura: ");
                    double ample = scanner.nextDouble();
                    System.out.print("Número de ventanas: ");
                    int numFinestres = scanner.nextInt();

                    Estancia novaEstancia = new Estancia(tipusEstancia, llarg, ample, numFinestres);
                    casa.afegirEstancia(novaEstancia);
                    System.out.println("Nueva estancia agregada.");
                    break;
                case 2:
                    // Solicitar datos para una nueva caja de correos y agregarla a la casa
                    System.out.print("Altura de la caja de correos: ");
                    double alturaBustia = scanner.nextDouble();
                    System.out.print("Anchura de la caja de correos: ");
                    double ampladaBustia = scanner.nextDouble();

                    Bustia novaBustia = new Bustia(alturaBustia, ampladaBustia);
                    casa.setBustia(novaBustia);
                    System.out.println("Nueva caja de correos agregada.");
                    break;
                case 3:
                    // Solicitar datos para una nueva hipoteca y agregarla a la casa
                    System.out.print("Importe inicial de la hipoteca: ");
                    double importeInicial = scanner.nextDouble();
                    System.out.print("Duración en años de la hipoteca: ");
                    int duracionHipoteca = scanner.nextInt();

                    Hipoteca novaHipoteca = new Hipoteca(importeInicial, duracionHipoteca);
                    casa.setHipoteca(novaHipoteca);
                    System.out.println("Nueva hipoteca agregada.");
                    break;
                case 4:
                    // Solicitar cantidad a amortizar y realizar la amortización
                    System.out.print("Cantidad a amortizar de la hipoteca: ");
                    double quantitatAmortitzar = scanner.nextDouble();
                    casa.realitzarPagamentHipoteca(quantitatAmortitzar);
                    break;
                case 5:
                    System.out.println("Superfície total de la casa: " + casa.calcularSuperficieTotal());
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }
}
