/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistpruebas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class ArrayListPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estancia uno = new Estancia("hab1", 1, 1, 1);
        Estancia dos = new Estancia("hab2", 2, 2, 2);
        Estancia tres = new Estancia("hab3", 3, 3, 3);
    
        List<Estancia> listado = new ArrayList();
    
        listado.add(uno);
        listado.add(dos);
        listado.add(tres);
        listado.add(new Estancia("hab4", 4, 4, 4));
    
        System.out.println("Has guardado " + listado.size());
        
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i).getTipus());
            
        }
        
        System.out.println("for each");
        for (Estancia estancia : listado) {
            System.out.println(estancia.getTipus());
        }
        
        
        System.out.println("Que habitacion quieres borrar "
                + listado.size());
        Scanner sc = new Scanner(System.in);
        int num_hab = sc.nextInt();
        System.out.println("Borrando... " + num_hab);
        listado.remove(num_hab);
        System.out.println("Habitaciones restantes... " + listado.size());
    }
    
}
