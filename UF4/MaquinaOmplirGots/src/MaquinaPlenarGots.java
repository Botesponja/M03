/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class MaquinaPlenarGots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
//        Botella bottle = new Botella(); //1er objecte del tipus botella
//        System.out.println("capacidad de la botella recien creada "
//                + bottle.getCapacity()+ " cerrada " + bottle.isClosed());
//
//        Botella bottle2 = new Botella(500);
//        System.out.println("capacidad de la segunda botella recien creada "
//                + bottle2.getCapacity()+ " cerrada " + bottle2.isClosed());
//
//        Botella bottle3 = new Botella(1500, 1500);
//        System.out.println("capacidad de la tercera botella recien creada "
//                + bottle3.getCapacity()+ " cerrada " + bottle3.isClosed());
//
//        System.out.println("Liquido que tienes las 3 botellas"
//        + bottle.getLiquid() + "-"+ bottle2.getLiquid() + "-"
//        + bottle3.getLiquid() + "-");

        //Llenar
        Scanner sc = new Scanner(System.in);
        Botella bottle4 = new Botella();
        System.out.println("Capacidad de la botella recién creada: " + bottle4.getCapacity());
        System.out.println("Cantidad a llenar: ");
        int cantidad = sc.nextInt();
        bottle4.plenarBotella(cantidad);
        System.out.println("Líquido actual en la botella: " + bottle4.getLiquid());

        System.exit(0);

        Got glass = new Got(); //
        System.out.println("Capacidad del vaso recien creaddo " + glass.getCapacity());

        Got glass2 = new Got(300);
        System.out.println("Capacidad del segundo vaso recien creaddo " + glass2.getCapacity());

        Got glass3 = new Got(300, 100);
        System.out.println("Capacidad del tercer vaso recien creaddo " + glass3.getCapacity());

        System.out.println("liquido que tienes en los 3 vasos "
                + glass.getLiquid() + "-" + glass2.getLiquid() + "-" + glass3.getLiquid());
        System.exit(0);
    }
    
    public static void basura()
    {
         Botella bottle = new Botella(); //1er objecte del tipus botella
        Got glass = new Got(); //
        int nueva_capacidad = 100;
        System.out.println("capacidad " + bottle.getCapacity());
        System.out.println("cambio capacidad a " + nueva_capacidad);
        bottle.setCapacity(nueva_capacidad);
        System.out.println("capacidad " + bottle.getCapacity());
        nueva_capacidad=300;
        System.out.println("cambio capacidad a " + nueva_capacidad);
        bottle.setCapacity(nueva_capacidad);
        System.out.println("capacidad " + bottle.getCapacity());
        glass.setCapacity(10);
        System.out.println("vaso capacidad" + glass.getCapacity());
    }
}
