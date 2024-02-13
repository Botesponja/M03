/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author beta1501
 */
public final class Dragon extends Pokemon {

    public Dragon(String nom, int fuerza_combate) {
        super(nom, fuerza_combate);
        
        this.life = 1000;
    }

    @Override
    public int ataque() {
        if (this.escape()){
            
        
        System.out.println("Ataque hiperrayo");
        int num =200;
        return num;
        }
        else
            return 0;
    }

    @Override
    public void recibirAtaque(Pokemon pok) {
        int ataque;
        if (pok instanceof Dragon){
          ataque = pok.ataque()*2;
           
        }
        else{
            ataque = pok.ataque();
        }
        System.out.println("Recibo ataque " + ataque);
        this.life -=ataque;
    }
    
}
