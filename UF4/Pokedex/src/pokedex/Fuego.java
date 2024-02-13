/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author beta1501
 */
public class Fuego extends Pokemon{

    public Fuego(String nom, int fuerza_combate, int life) {
        super(nom, fuerza_combate, life);
    }

    @Override
    public int ataque() {
        if (this.escape()){
            
        
        System.out.println("Nitrocarga");
        int num =250;
        return num;
        }
        else
            return 0;
    }
    
}
