/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomvalorespositivosnegativos;

/**
 *
 * @author beta1501
 */
public class RandomValoresPositivosNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 201;
       int min = 1;
       int range = max - min + 1;
       int aleatorio, cambiado;
       int mayor=100;
       
        for (int i = 0; i < 10; i++) {
            aleatorio = (int) (Math.random()*range + min);
            cambiado = aleatorio - (mayor-1);
            System.out.println(aleatorio + " <---> " + cambiado);
        }
    }
    
}
