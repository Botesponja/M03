/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomexemples;

/**
 *
 * @author beta1501
 */
public class RandomExemples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Voy a generar un numero aleatorio del 1 al 100");
        //Math.random(); genera un numero aleatori del 0 a 1 (el 1 no esta inclos)
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        System.out.println("valor maximo " + max);
        System.out.println("valor minimo " + min);
        System.out.println("rango de valores " + range);
        int aleatorio = (int) (Math.random()*range + min);
        
        System.out.println("Numero generado --> " + aleatorio);
        
        
    }
    
}
