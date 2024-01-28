/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author benjamin
 */
public class Bustia {
    private final double amplada;
    private final double altura;
    private boolean bandereta;
    private boolean hiHaCartes;

    public Bustia(double amplada, double altura) {
        this.amplada = amplada;
        this.altura = altura;
        this.bandereta = false;
        this.hiHaCartes = false;
    }

    public boolean isBanderetaAlcada() {
        return bandereta;
    }

    public void actualitzarBandereta(boolean carterPassat) {
        this.bandereta = carterPassat;
        this.hiHaCartes = false;
    }

    public boolean hiHaCartes() {
        return hiHaCartes;
    }

    public void posarCartes() {
        this.hiHaCartes = true;
    }
}
