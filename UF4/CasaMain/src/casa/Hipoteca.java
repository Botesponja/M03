/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author benjamin
 */
public class Hipoteca {
    private double importPendent;
    private int anysRestants;

    public Hipoteca(double importInicial, int anys) {
        this.importPendent = importInicial;
        this.anysRestants = anys;
    }

    public double calcularCuotaMensual() {
        return importPendent / (anysRestants * 12);
    }

    public void amortitzar(double quantitat) {
        if (quantitat > 0 && quantitat <= importPendent) {
            importPendent -= quantitat;
        } else if (quantitat > importPendent) {
            System.out.println("Error: La quantitat a amortitzar no pot ser superior al total pendent.");
            acabarHipoteca();
        }
    }

    private void acabarHipoteca() {
        importPendent = 0;
        anysRestants = 0;
    }

    public double getImportPendent() {
        return importPendent;
    }

    public int getAnysRestants() {
        return anysRestants;
    }
}

