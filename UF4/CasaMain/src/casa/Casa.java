/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author benjamin
 */
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Estancia> estancies;
    private Bustia bustia;
    private Hipoteca hipoteca;

    public Casa(Bustia bustia, Hipoteca hipoteca) {
        this.estancies = new ArrayList<>();
        this.bustia = bustia;
        this.hipoteca = hipoteca;
    }

    Casa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double calcularSuperficieTotal() {
        double superficieTotal = 0;
        for (Estancia estancia : estancies) {
            superficieTotal += estancia.calcularSuperficie();
        }
        return superficieTotal;
    }

    public int calcularFinestresANetejar() {
        int finestresANetejar = 0;
        for (Estancia estancia : estancies) {
            finestresANetejar += estancia.getNumeroFinestres();
        }
        return finestresANetejar;
    }

    public void afegirEstancia(Estancia novaEstancia) {
        estancies.add(novaEstancia);
        System.out.println("Nueva estancia agregada.");
        System.out.println( "Total estancias: " + estancies.size());
    }

    public void netejarBustia() {
        if (bustia.hiHaCartes()) {
            System.out.println("Netejant la bustia...");
            bustia.posarCartes();
        } else {
            System.out.println("La bustia ja està neta.");
        }
    }

    public void rebreCartes() {
        System.out.println("Rebent cartes...");
        bustia.actualitzarBandereta(true);
        bustia.posarCartes();
    }

    public void realitzarPagamentHipoteca(double quantitatAmortitzar) {
        double cuotaMensual = hipoteca.calcularCuotaMensual();
        hipoteca.amortitzar(cuotaMensual);
        System.out.println("Pagament mensual de la hipoteca realitzat. Import pendent: " + hipoteca.getImportPendent());
    }

    public void setBustia(Bustia bustia) {
        this.bustia = bustia;
    }

    public void setHipoteca(Hipoteca hipoteca) {
        this.hipoteca = hipoteca;
    }

   

 
}

