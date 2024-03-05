/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmenu;


/**
 *
 * @author beta1501
 */
public class TestMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            MenuDaw menu_daw = new MenuDaw("FIFA 23");
            
            menu_daw.addOption("Settings");
            menu_daw.addOption("Play");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            
            System.out.println();
        }
    }
}
