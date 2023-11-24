/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomutilidades;

/**
 *
 * @author beta1501
 */
public class RandomUtilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int max = 2;
       int min = 1;
       int range = max - min + 1;
       int aleatorio;
       int cont_creus=0;
       
        do {            
            aleatorio = (int) (Math.random()*range + min);
       //simular tirar una moneda
        if (aleatorio ==1) {
            System.out.println("Cara");
        }
        
        else {
            System.out.println("Creu");
            cont_creus ++;
        }
        } while(cont_creus<3);
       
        
    
       
    }
    
}
