/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author beta1501
 */
public class Normal extends Pokemon {

    public Normal(String nom, int fuerza_combate, int life) {
        super(nom, fuerza_combate, life);
    }

    @Override
    public int ataque() {
         if (this.escape()){
            
        
        System.out.println("Arañazo");
        int num =150;
        return num;
        }
        else
            return 0;
    }
    
}
