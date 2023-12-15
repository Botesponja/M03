/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplecajasnormalesrarasyepicas;

/**
 *
 * @author beta1501
 */
public class ExempleCajasNormalesRarasyEpicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int max = 100;
       int min = 1;
       int range = max - min + 1;
       int aleatorio;
       int contador;
       int normal=0;
       int rara=0;
       int epica=0;
        for (contador = 1; contador < 100; contador++) {
        aleatorio = (int) (Math.random()*range + min);
     
       if(aleatorio>=1 && aleatorio<=60) {
          normal++;
       }
       else if (aleatorio>=60 && aleatorio<=90) {
            ++rara;
        }
       else {
          epica=epica+1;
       }
        }
        System.out.println("Cajas normales ---> " + normal );
        System.out.println("Cajas superaras ---> " + rara );
        System.out.println("Cajas epicas ---> " + epica );
       
    }
    
}
