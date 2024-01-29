/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author benjamin
 */
public class Estancia {
    private String tipus;
    private double llarg;
    private double ample;
    private int numeroFinestres;

    public Estancia(String tipus, double llarg, double ample, int numeroFinestres) {
        this.tipus = tipus;
        this.llarg = llarg;
        this.ample = ample;
        this.numeroFinestres = numeroFinestres;
    }

    public void ferObres(double nouLlarg, double nouAmple) {
        this.llarg = nouLlarg;
        this.ample = nouAmple;
    }

    public double calcularSuperficie() {
        return llarg * ample;
    }

    public int getNumeroFinestres() {
        return numeroFinestres;
    }
}

