package casa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author benjamin
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Estancia cuina = new Estancia("cuina", 10, 8, 2);
        Estancia bany = new Estancia("bany", 6, 5, 1);

        Bustia bustia = new Bustia(20, 10);
        Hipoteca hipoteca = new Hipoteca(100000, 20);

        Casa casa = new Casa(bustia, hipoteca);
        casa.afegirEstancia(cuina);
        casa.afegirEstancia(bany);

        
        System.out.println("Superfície total de la casa: " + casa.calcularSuperficieTotal());
        System.out.println("Finestres a netejar: " + casa.calcularFinestresANetejar());
        casa.netejarBustia();
        casa.rebreCartes();
        casa.realitzarPagamentHipoteca();
        Estancia sala = new Estancia("sala", 15, 10, 3);
        casa.afegirEstancia(sala);
         System.out.println("Nueva superfície total de la casa: " + casa.calcularSuperficieTotal());

    }
}

