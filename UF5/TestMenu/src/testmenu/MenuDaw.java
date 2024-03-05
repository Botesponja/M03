/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmenu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class MenuDaw {
    private String titiol;
    private ArrayList<String> items;

    public MenuDaw(String titiol) {
        this.titiol = titiol;
        this.items = new ArrayList<String>();
    }
    /**
     * rebrà per paràmetre una opció i afegirà l'Opció a la collection dem(comprovar que no existeixi abans, i si existeix llançar l’excepció 
 OptionDuplicateException)anada.ption)
     * @param option_menu nueva opcio que tindra e
     * @throws testmenu.OptionDuplicateException
     */
    public void addOption(String option_menu) throws OptionDuplicateException{
        //com que el objecte arrayList es un String
        //ja te el equals implementat, i per tant funcionara
        //contains
        if(!items.contains(option_menu)){
            //podria perguntar indexOf >0 existeix
            items.add(option_menu);
            System.out.println("Opció afegida -> " + option_menu);
        }
        else{
            throw new OptionDuplicateException(option_menu);
        }
    }
     public void AddOptionWithRepetition(String opcion_menu){
      items.add(opcion_menu);
      System.out.println("Opcion añadida -> " + opcion_menu);
  }
    public void AddOptionByIndex(String opcion_menu, int index) throws IndexOutOfBoundsException {
      items.add(index, opcion_menu);
      System.out.println("Opcion añadida -> " + opcion_menu);
  }
    public int NumeroOptionsMenu(){
       int options = 0;
      for (String opcion : items) {
          options++;
      }   
       return options;
    }

    @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
        String titol = null;
      sb.append("*********" + titol + "*********\n");
      sb.append("-------------------------------\n");
      int cont = 1;
      for (String item : items) {
          sb.append(cont + " - " + item);
          cont++;
      }
      return sb.toString();
    }
   
   public void mostrarMenu(){
     System.out.println(toString());
   }
    public int ChooseOption(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Elige una opcion: ");
      int opcion = sc.nextInt();
      return opcion;
  } 
    
    
}
