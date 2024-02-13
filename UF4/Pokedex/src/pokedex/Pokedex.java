/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokedex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author beta1501
 */
public class Pokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dragon dragonite = new Dragon("Dragonite", 10);
        Normal ratata = new Normal("Ratata", 15);
        Fuego arcanine = new Fuego("Arcanine", 30);
        Fuego charizard = new Fuego("Charyzard", 40);
        Dragon dyalga = new Dragon("Dyalga", 45);
        
        ArrayList<Pokemon> bag = new ArrayList<>();
        
        bag.add(dyalga);
        bag.add(charizard);
        bag.add(arcanine);
        bag.add(dragonite);
        bag.add(ratata);
        
        
        System.out.println("Pokemons Capturados " + bag.size());
        menu(bag);
        System.out.println("Primer pokemon");
        int pos_primer = chooseOption(bag.size());
        System.out.println("Segundo pokemon");
        int pos_segundo = chooseOption(bag.size());
        
        System.out.println("Combate pokemon " + bag.get(pos_primer).getNom() + " VS " + bag.get(pos_segundo).getNom());
        Pokemon primer = bag.get(pos_primer);
        Pokemon segundo = bag.get(pos_segundo);
        
        while (primer.getLife()>0 && segundo.getLife()>0) {            
            segundo.recibirAtaque(primer);
            primer.recibirAtaque(segundo);
        }
    }

    private static void menu(ArrayList<Pokemon> bag) {
        System.out.println("Vamos a hacer un combate pokemin");
        System.out.println("Tienes que esocger dos combatientes");
        int num=1;
        for (Pokemon pokemon : bag) {
            System.out.println(num + "-" + pokemon.getNom());
            num++;
        }
    }

    private static int chooseOption(int size) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {            
            System.out.println("Pon numero");
            num = sc.nextInt();
        } while (num<1 || num>size);
        
        return (num-1);
    }
    
}
