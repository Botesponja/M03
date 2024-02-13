/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

import java.util.Random;

/**
 *
 * @author beta1501
 */
public abstract class Pokemon {
    //abstract no en permet fer objectes de la clase pokemon (new Pokemon)
    private String nom;
    private int fuerza_combate;
    private int life;
    private boolean huida;

    public Pokemon(String nom, int fuerza_combate, int life) {
        this.nom = nom;
        this.fuerza_combate = fuerza_combate;
        this.life = life;
        huida = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getFuerza_combate() {
        return fuerza_combate;
    }

    public void setFuerza_combate(int fuerza_combate) {
        this.fuerza_combate = fuerza_combate;
    }
    
    public void recibirAtaque(int damage){
        this.life -= damage;
        
    }

    public boolean escape(){
        Random rd = new Random();
        int num = rd.nextInt(1,4);
        if (num == 1) {
            huida = true;
        }
        else{
            huida = false;
        }
        return huida;
    }
    
    //Metodo OBLIGATORIO para todos los tipos de pokemon
    public abstract int ataque();
    //son codigo porque cada tipo sera diferente
}

