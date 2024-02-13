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
    protected String nom;
    private int fuerza_combate;
    protected int life;
    private boolean huida;

    public Pokemon(String nom, int fuerza_combate) {
        this.nom = nom;
        this.fuerza_combate = fuerza_combate;
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
     public void recibirAtaque(Pokemon pok){
        this.life -= pok.ataque();
        
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

    public int getLife() {
        return life;
    }
    
    //Metodo OBLIGATORIO para todos los tipos de pokemon
    public abstract int ataque();
    //sin codigo porque sera diferente para todos los tipos

    @Override
    public String toString() {
        return "nom=" + nom + ", fuerza_combate=" + fuerza_combate + ", life=" + life + ", huida=" + huida;
    }



}

